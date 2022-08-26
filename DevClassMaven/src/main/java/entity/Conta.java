package entity;

import enums.TipoContaEnum;

public class Conta {
	private Integer agencia;
	private Banco banco;
	private Integer numConta;
	private Double saldo;
	private Titular titular;
	private TipoContaEnum tipoConta;
	
	public Conta( Integer agencia, Banco banco, Integer numConta, Double saldo, Titular titular,
			TipoContaEnum tipoConta ) {
		super();
		this.agencia = agencia;
		this.banco = banco;
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = titular;
		this.tipoConta = tipoConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia( Integer agencia ) {
		this.agencia = agencia;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco( Banco banco ) {
		this.banco = banco;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta( Integer numConta ) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo( Double saldo ) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular( Titular titular ) {
		this.titular = titular;
	}

	public TipoContaEnum getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta( TipoContaEnum tipoConta ) {
		this.tipoConta = tipoConta;
	}
	
	public String toString() {
		return "Banco: " + this.banco.getNome() +
				"\nAgência: " + this.agencia +
				"\nNúmero da conta: " + this.numConta +
				"\nSaldo: " + this.saldo +
				"\nTitular: " + this.titular.getNome() +
				"\nTipo de conta: " + this.tipoConta;
	}
	
}
