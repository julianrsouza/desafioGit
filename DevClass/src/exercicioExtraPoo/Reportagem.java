package exercicioExtraPoo;

import java.util.ArrayList;
import java.util.List;

public class Reportagem {  
	private String titulo;
	private String texto;
	private List<String> autores = new ArrayList();
	
	public Reportagem(String titulo, String texto, List<String> autores) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.autores = autores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

}
