package exercicioExtraPoo;

import java.util.ArrayList;
import java.util.List;

public class Jornal extends Produto {
	private String titulo;
	private List<Reportagem> reportagens = new ArrayList<>();
	
	public Jornal(String dataPub, Float precoVenda, String titulo, List<Reportagem> reportagens) {
		super(dataPub, precoVenda);
		this.titulo = titulo;
		this.reportagens = reportagens;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Reportagem> getReportagens() {
		return reportagens;
	}
	public void setReportagens(List<Reportagem> reportagens) {
		this.reportagens = reportagens;
	}

	public void addReportagem(Reportagem reportagem) {
		this.reportagens.add(reportagem);
	}
	
	public Boolean removeReportagem(Reportagem reportagem) {
		return this.reportagens.remove(reportagem);
	}
	
	public String retornaReportagens() {
		String reportagens = "";
		for (int i = 0; i < this.reportagens.size(); i++) {
			if(i == this.reportagens.size() - 1) {
				reportagens += this.reportagens.get(i);
				break;
			}
			reportagens += this.reportagens.get(i);
			reportagens += ", ";
		}
		return reportagens;
	}
	
	public String toStringResumido() {
		return "Código do produto: " + this.getCodigo()
				+ "Jornal"
				+ "Título: " + this.titulo;
	}
	
	public String toString() {
		return "Jornal"
				+ "Código do item: " + this.getCodigo()
				+ "\nTítulo: " + this.titulo
				+ "\nReportagens: " + this.retornaReportagens()
				+ super.toString();
	}
	
	
}
