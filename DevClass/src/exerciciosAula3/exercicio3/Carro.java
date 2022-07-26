package exerciciosAula3.exercicio3;

public class Carro extends Veiculo {

	public Carro(Integer quantidadeRodas, Float peso, String cor, String marca, String modelo, Integer ano, Double preco,
			TipoVeiculoEnum tipoVeiculo, Integer quantidade) {
		super(quantidadeRodas, peso, cor,marca, modelo, ano, preco, tipoVeiculo, quantidade);
	}

	public String toString() {
		return "Categoria: Carro"
				+ super.toString();
	}
}
