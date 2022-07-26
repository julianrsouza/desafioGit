package exerciciosAula3.exercicio3;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(Integer quantidadeRodas, Float peso, String cor, String marca, String modelo, Integer ano, Double preco,
			TipoVeiculoEnum tipoVeiculo, Integer cilindradas, Integer quantidade) {
		super(quantidadeRodas, peso, cor, marca, modelo, ano, preco, tipoVeiculo, quantidade);
		this.cilindradas = cilindradas;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public String toString() {
		return "Categoria: Moto" 
				+ "\n" + super.toString()
				+ "\nCilindradas: " + this.cilindradas;
				
	}
}
