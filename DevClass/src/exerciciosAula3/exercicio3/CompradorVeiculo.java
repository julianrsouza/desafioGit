package exerciciosAula3.exercicio3;

public class CompradorVeiculo {
	private String nome;
	private Double saldo;
	
	public CompradorVeiculo(String nome, Double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "Saldo: R$" + this.saldo;
	}
}
