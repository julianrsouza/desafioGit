package exercicioExtraPoo;

public class Produto {
	private Integer codigo;
	private String dataPub;
	private Float precoVenda;
	
	
	public Produto(String dataPub, Float precoVenda) {
		this.dataPub = dataPub;
		this.precoVenda = precoVenda;
	}
	
	public String getDataPub() {
		return dataPub;
	}
	public void setDataPub(String dataPub) {
		this.dataPub = dataPub;
	}
	public Float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Float precoVenda) {
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
				+ "\nPreço de venda: R$" + this.precoVenda;
	}
	
}
