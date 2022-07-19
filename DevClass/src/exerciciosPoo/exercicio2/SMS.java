package exerciciosPoo.exercicio2;

public class SMS extends Mensagem {
	private Contato remetente;
	private Contato destinatario;
	
	public SMS(String mensagem,  Contato remetente, Contato destinatario) {
		super(mensagem);
		this.remetente = remetente;
		this.destinatario = destinatario;
	}

	public Contato getRemetente() {
		return remetente;
	}

	public void setRemetente(Contato remetente) {
		this.remetente = remetente;
	}

	public Contato getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Contato destinatario) {
		this.destinatario = destinatario;
	}
	
	public String envioSMS() {
		return this.remetente.getNome() + ":\n" + this.getMensagem() + "\n" + this.destinatario.getTelefone();
	}

}
