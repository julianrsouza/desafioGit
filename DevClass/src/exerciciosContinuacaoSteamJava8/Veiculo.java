package exerciciosContinuacaoSteamJava8;

public class Veiculo {  
	private String marca;
	private String modelo;
	private String placa;
	private String chassi;
	private Double valor;
	
	public Veiculo(String marca, String modelo, String placa, String chassi, Double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.chassi = chassi;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Marca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nPlaca: " + this.placa
				+ "\nChassi: " + this.chassi
				+ "\nValor: " + this.valor;
	}
	
}
