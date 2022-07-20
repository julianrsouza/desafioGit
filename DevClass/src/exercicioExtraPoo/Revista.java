package exercicioExtraPoo;

import java.util.ArrayList;
import java.util.List;

public class Revista extends Produto{ 
	private String editora;
	private Integer numEdicao;
	private List<Artigo> artigos = new ArrayList<>();
	
	
	public Revista(String dataPub, Float precoVenda, String editora, Integer numEdicao,
			List<Artigo> artigos) {
		super(dataPub, precoVenda);
		this.editora = editora;
		this.numEdicao = numEdicao;
		this.artigos = artigos;
	}
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Integer getNumEdicao() {
		return numEdicao;
	}
	public void setNumEdicao(Integer numEdicao) {
		this.numEdicao = numEdicao;
	}
	public List<Artigo> getArtigos() {
		return artigos;
	}
	public void setArtigos(List<Artigo> artigos) {
		this.artigos = artigos;
	}
	
	public void addArtigo(Artigo artigo) {
		this.artigos.add(artigo);
	}
	
	public Boolean removeArtigo(Artigo artigo) {
		return this.artigos.remove(artigo);
	}
	
	public String retornaArtigos() {
		String artigos = "";
		for (int i = 0; i < this.artigos.size(); i++) {
			if(i == this.artigos.size() - 1) {
				artigos += this.artigos.get(i);
				break;
			}
			artigos += this.artigos.get(i);
			artigos += ", ";
		}
		return artigos;
	}
	
	public String toStringResumido() {
		return "Código do produto: " + this.getCodigo()
				+ "Revista"
				+ "Editora: " + this.editora;
	}
	
	public String toString() {
		return "Revista"
				+ "\nCódigo do item: " + this.getCodigo()
				+ "\nEditora: " + this.editora 
				+ "\nNúmero da edição: " + this.numEdicao
				+ "\nArtigos: " + this.retornaArtigos()
				+ super.toString();
	}
}
