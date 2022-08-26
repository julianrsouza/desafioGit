package exerciciosAula3.exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa { 
	private String nome;
	private LocalDate dataNasc;
	private Float altura;
	private Integer idade;
	
	public Pessoa(String nome, LocalDate dataNasc, Float altura) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	public void calculaIdade(LocalDate dataNascimento) {
		Integer idade = 0;
		LocalDate dataAtual = LocalDate.now();
		if (dataNascimento != null) {
			idade = Period.between(dataNascimento, dataAtual).getYears();
		} else {
			System.out.println("Falta da de nascimento");
		}
		this.idade = idade;
	}
	
	public String toString() {
		String infoPessoa = "";
		infoPessoa += "Nome: " + this.nome
		+ "\nData de Nascimento: " + this.dataNasc
		+ "\nAltura: " + this.altura
		+ "m";
		if(this.idade != null) {
			infoPessoa += "\nIdade: " + this.idade; 
		}
		return infoPessoa;
	}

}
