package exerciciosPoo.exercicio2;

public class Email extends Mensagem {
	private Contato remetente;
	private Contato destinatario;
	
	public Email(String mensagem, Contato remetente, Contato destinatario) {
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
	
	public String envioEmail() {
		return "De: " + this.remetente.getNome() + " - " + this.remetente.getEmail() 
				+"\n" + "Para: " + this.destinatario.getNome() + " - " + this.destinatario.getEmail()
				+"\n\n" + this.getMensagem();
	}
	
}
