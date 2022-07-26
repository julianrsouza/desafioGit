package exerciciosAula3.exercicio2;

public class Elevador implements IElevador {
	private Integer andarAtual;
	private Integer numAndares;
	private Integer capacidade;
	private Integer numPessoas;

	public Elevador(Integer numAndares, Integer capacidade) {
		this.andarAtual = 0;
		this.numAndares = numAndares;
		this.capacidade = capacidade;
		this.numPessoas = 0;
	}

	public Integer getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}

	public Integer getNumAndares() {
		return numAndares;
	}

	public void setNumAndares(Integer numAndares) {
		this.numAndares = numAndares;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Integer getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(Integer numPessoas) {
		this.numPessoas = numPessoas;
	}

	@Override
	public void entra() {
		if (this.numPessoas == this.capacidade) {
			System.out.println("Capacidade máxima atingida!");
		} else {
			this.numPessoas++;
			System.out.println("Numero de pessoas no elevador: " + this.numPessoas);
		}
	}

	@Override
	public void sai() {
		if (this.numPessoas == 0) {
			System.out.println("Elevador Vazio!");
		} else {
			this.numPessoas--;
			System.out.println("Numero de pessoas no elevador: " + this.numPessoas);
		}
	}

	@Override
	public void sobe() {
		if (this.andarAtual == this.numAndares) {
			System.out.println("Não pode subir mais, já está no último andar!");
		} else {
			this.andarAtual++;
			System.out.println("Subiu para o andar de número" + this.andarAtual);
		}
	}

	@Override
	public void desce() {
		if (this.andarAtual == 0) {
			System.out.println("Não pode descer mais, já está no térreo!");
		} else {
			this.andarAtual--;
			if (andarAtual < 1) {
				System.out.println("Desceu para o térreo!");
			} else {
				System.out.println("Desceu para o andar de número" + this.andarAtual);
			}
		}
	}
}
