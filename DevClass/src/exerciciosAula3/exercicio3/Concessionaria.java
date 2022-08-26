package exerciciosAula3.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Concessionaria {
	private List<Veiculo> veiculos = new ArrayList<>();
	private Integer seqCodVeiculo = 1;

	public void incluiVeiculo(Veiculo veiculo) {
		veiculo.setId(seqCodVeiculo);
		seqCodVeiculo++;
		this.veiculos.add(veiculo);
	}
	
	public void atualizaPrecoVeiculo(Integer idVeiculo, Double novoPreco) {
		veiculos.stream().filter(veiculo -> veiculo.getId() == idVeiculo)
				.findFirst().ifPresentOrElse(veiculo -> veiculo.setPreco(novoPreco), () -> System.out.println("Id não encontrado"));
	}
	
	public void mostraVeiculosPorId(Integer idVeiculo) {
		veiculos.stream().filter(veiculo -> veiculo.getId() == idVeiculo)
				.forEach(veiculo -> System.out.println(veiculo.toString()));
		}
	
	public void mostraCarrosPorTipo(String tipoVeiculo) {
		switch (tipoVeiculo.toUpperCase()) {
			case "NOVOS":
				obtemListaCarrosNovos().forEach(carro -> {
					System.out.println(carro.toString());
					System.out.println();
				});
				break;
			case "SEMINOVOS":
				obtemListaCarrosSeminovos().forEach(carro -> {
					System.out.println(carro.toString());
					System.out.println();
				});
				break;
			case "AMBOS":
				obtemListaCarros().forEach(carro -> {
					System.out.println(carro.toString());
					System.out.println();
				});
				break;
		}
	}
	
	private List<Veiculo> obtemListaCarrosNovos() {
		return this.obtemListaCarros().stream()
				.filter(carro -> carro.getTipoVeiculo().equals(TipoVeiculoEnum.NOVO))
				.collect(Collectors.toList());
	}
	
	private List<Veiculo> obtemListaCarrosSeminovos() {
		return this.obtemListaCarros().stream()
				.filter(carro -> carro.getTipoVeiculo().equals(TipoVeiculoEnum.SEMINOVO))
				.collect(Collectors.toList());
	}
	
	public List<Veiculo> obtemListaCarros() {
		return veiculos.stream().filter(veiculo -> veiculo instanceof Carro)
				.collect(Collectors.toList());
	}
	
	public void mostraMotosPorCilindrada(Integer cilindrada){
		this.obtemListaMotos().forEach(moto -> {
			Moto motoAtual = (Moto)moto;
			if(motoAtual.getCilindradas().equals(cilindrada))
				System.out.println(motoAtual.toString());;
		});
	}
	
	public void mostraMotosPorMarca(String marca){
		this.obtemListaMotos().stream().filter(moto -> moto.getMarca() == marca)
				.collect(Collectors.toList()).forEach(moto -> moto.toString());
	}
	
	private List<Veiculo> obtemListaMotos() {
		return veiculos.stream().filter(veiculo -> veiculo instanceof Moto)
				.collect(Collectors.toList());
	}
	
	private List<Veiculo> obtemListaCaminhoes(){
		return veiculos.stream().filter(veiculo -> veiculo instanceof Caminhao)
				.collect(Collectors.toList());
	}
	
	public void mostraCaminhoesPorTipoCarroceria(TipoCarroceriaEnum tipoCarroceria){
		this.obtemListaCaminhoes().forEach(caminhao -> {
			var caminhaoAtual = (Caminhao)caminhao;
			if(caminhaoAtual.getTipoCarroceria().equals(tipoCarroceria)) {
				System.out.println(caminhaoAtual.toString());;
			}
		});
	}
	
	public void vendaVeiculo(Integer codProduto, CompradorVeiculo comprador, ModalidadeVendaVeiculoEnum modalidadeVenda) {
		for (int i = 0; i < this.veiculos.size(); i++) {
			if(veiculos.get(i).getId() == codProduto) {
				Double precoVeiculo = 0.0;
				switch (modalidadeVenda) {
					case PCD:
						precoVeiculo = veiculos.get(i).getPreco()*0.5;
						break;
					case AGRICULTOR:
						precoVeiculo = veiculos.get(i).getPreco()*0.6;
						break;
					case DEMAIS:
						precoVeiculo = veiculos.get(i).getPreco();
						break;
				}
				if(comprador.getSaldo() < precoVeiculo) {
					System.out.println("Saldo insuficiente para a compra.");
					break;
				}
				comprador.setSaldo(comprador.getSaldo() - precoVeiculo);
				veiculos.get(i).setQuantidade(veiculos.get(i).getQuantidade() - 1);
			}
		}
	}
	
}
