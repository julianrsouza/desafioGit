package exerciciosPoo.exercicio1;

public class Apartamento extends Imovel {
	private int comodos;
	private boolean salaoDeFestas;
	
	public Apartamento(double areaDoImovel, double valorDoImovel, int comodos, boolean salaoDeFestas) {
		super(areaDoImovel, valorDoImovel);
		this.comodos = comodos;
		this.salaoDeFestas = salaoDeFestas;
	}
	public int getComodos() {
		return comodos;
	}
	public void setComodos(int comodos) {
		this.comodos = comodos;
	}
	public boolean isSalaoDeFestas() {
		return salaoDeFestas;
	}
	public void setSalaoDeFestas(boolean salaoDeFestas) {
		this.salaoDeFestas = salaoDeFestas;
	}
	
	@Override
	public String toString() {
		String temSalao = "";
		if (this.salaoDeFestas == true) {
			temSalao += "sim";
		} else {
			temSalao += "nao";
		}
		return "Area do Imovel: " + this.getAreaDoImovel() + "\n" 
				+ "Valor do imovel: R$" + this.getValorDoImovel() + "\n"
				+ "Numero de comodos: " + this.comodos + "\n"
				+ "Salao de festas: " + temSalao;
	}
	
}
