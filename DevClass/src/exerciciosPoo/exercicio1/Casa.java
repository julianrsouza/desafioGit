package exerciciosPoo.exercicio1;

public class Casa extends Imovel {
	private int comodos;
	private double areaDoTerreno;
	
	public Casa(double areaDoImovel, double valorDoImovel, int comodos, double areaDoTerreno) {
		super(areaDoImovel, valorDoImovel);
		this.comodos = comodos;
		this.areaDoTerreno = areaDoTerreno;
	}
	public int getComodos() {
		return comodos;
	}
	public void setComodos(int comodos) {
		this.comodos = comodos;
	}
	public double getAreaDoTerreno() {
		return areaDoTerreno;
	}
	public void setAreaDoTerreno(double areaDoTerreno) {
		this.areaDoTerreno = areaDoTerreno;
	}
	
	@Override
	public String toString() {
		return "Area do imovel: " + this.getAreaDoImovel() + "m2\n"
				+ "Valor do imovel: R$" + this.getValorDoImovel() + "\n"
				+ "Numero de comodos: " + this.comodos + "\n" 
				+ "Area do terreno: " + this.areaDoTerreno +"m2";
	}
	
}
