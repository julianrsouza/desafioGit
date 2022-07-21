package exercicioExtraPoo;

import java.util.ArrayList;
import java.util.List;

public class Livro extends Produto {
	private String titulo;
	private List<String> autores = new ArrayList<>();
	private String editora;

	public Livro(String titulo, List<String> autores, String editora, String dataPub, Double precoVenda, Integer quantidade) {
		super( dataPub, precoVenda, quantidade);
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	public void addAutor (String autor) {
		this.autores.add(autor);
	}
	
	public Boolean removeAutor (String autor) {
		return this.autores.remove(autor);
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String retornaAutores() {
		String autores = "";
		for (int i = 0; i < this.autores.size(); i++) {
			if(i == this.autores.size() - 1) {
				autores += this.autores.get(i);
				break;
			}
			autores += this.autores.get(i);
			autores += ", ";
		}
		return autores;
	}
	
	public String toStringResumido() {
		return "Código do produto: " + this.getCodigo()
				+ "\nLivro"
				+ "\nTítulo: " + this.titulo;
	}
	
	public String toString() {
		return "Livro" + "\nCódigo do item: " + this.getCodigo()
				+ "\nTítulo: " + this.titulo 
				+ "\nAutores: " + this.retornaAutores() 
				+"\nEditora: " + this.editora 
				+ super.toString();
	}

}
