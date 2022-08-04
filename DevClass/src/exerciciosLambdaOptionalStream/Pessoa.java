package exerciciosLambdaOptionalStream;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private LocalDate dataNasc;
	private String cidadeEstado;
	
	public Pessoa(String nome, String sobrenome, LocalDate dataNasc, String cidadeEstado) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNasc = dataNasc;
		this.cidadeEstado = cidadeEstado;
	}  
	
	public String getCidadeEstado() {
		return cidadeEstado;
	}

	public Integer getIdade() {
		Integer idade = 0;
		LocalDate dataAtual = LocalDate.now();
		if (this.dataNasc != null) {
			idade = Period.between(this.dataNasc, dataAtual).getYears();
		} else {
			System.out.println("Falta da de nascimento");
		}
		return idade;
	}
	
	public String toString() {
		return "Nome completo: " + this.nome + " " + this.sobrenome
				+"\nData de nascimento: " + this.dataNasc
				+"\nCidade: " + this.cidadeEstado;
	}
}
