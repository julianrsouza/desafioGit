package exerciciosAula3.exercicio3;

public abstract class Veiculo {
	private Integer id;
	private Integer quantidadeRodas;
	private Float peso;
	private String cor;
	private String marca;
	private String modelo;
	private Integer ano;
	private Double preco;
	private TipoVeiculoEnum tipoVeiculo;
	private Integer quantidade;
	
	public Veiculo(Integer quantidadeRodas, Float peso, String cor, String marca, String modelo, Integer ano, Double preco, TipoVeiculoEnum tipoVeiculo, Integer quantidade) {
		this.quantidadeRodas = quantidadeRodas;
		this.peso = peso;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.tipoVeiculo = tipoVeiculo;
		this.quantidade = quantidade;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidadeRodas() {
		return quantidadeRodas;
	}
	public void setQuantidadeRodas(Integer quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
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

	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public TipoVeiculoEnum getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculoEnum tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String toString() {
		return "Código do produto: " + this.id
				+ "\nQuantidade de rodas: " + this.quantidadeRodas
				+ "\nPeso: " + this.peso
				+ "\nCor: " + this.cor
				+ "\nMarca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nAno: " + this.ano
				+ "\nPreco: " + this.preco
				+ "\nTipo de veículo: " + this.tipoVeiculo
				+ "\nQuantidade em estoque: " + this.quantidade;
	}
	
}
