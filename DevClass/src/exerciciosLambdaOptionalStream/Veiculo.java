package exerciciosLambdaOptionalStream;

public class Veiculo {
	private String chassi;
	private String marca;
	private String modelo;
	
	public Veiculo(String chassi, String marca, String modelo) {
		super();
		this.chassi = chassi;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public String toString() {
		return "Chassi: " + this.chassi
				+ "\nMarca: " + this.marca
				+ "\nModelo: " + this.modelo;
	}
}
