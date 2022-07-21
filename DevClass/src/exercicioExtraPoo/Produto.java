package exercicioExtraPoo;

public class Produto {
	private Integer codigo;
	private String dataPub;
	private Double precoVenda;
	private Integer quantidade;
	
	
	public Produto(String dataPub, Double precoVenda, Integer quantidade) {
		this.dataPub = dataPub;
		this.precoVenda = precoVenda;
		this.quantidade = quantidade;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDataPub() {
		return dataPub;
	}
	public void setDataPub(String dataPub) {
		this.dataPub = dataPub;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return "\nData da publicação: " + this.dataPub 
				+ "\nPreço de venda: R$" + this.precoVenda
				+ "\nQuantidade: " + this.quantidade;
	}
	
}
