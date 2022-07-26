package exerciciosAula3.exercicio3;

public class Caminhao extends Veiculo {
	private TipoCarroceriaEnum tipoCarroceria;

	public Caminhao(Integer quantidadeRodas, Float peso, String cor,String marca, String modelo, Integer ano, Double preco,
			TipoVeiculoEnum tipoVeiculo, TipoCarroceriaEnum tipoCarroceria, Integer quantidade) {
		super(quantidadeRodas, peso, cor, marca, modelo, ano, preco, tipoVeiculo, quantidade);
		this.tipoCarroceria = tipoCarroceria;
	}

	public TipoCarroceriaEnum getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(TipoCarroceriaEnum tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	
	public String toString() {
		return "Categoria: Caminhão"
				+ "\n" + super.toString()
				+ "\nTipo de carroceria: " + this.tipoCarroceria;
	}
}
