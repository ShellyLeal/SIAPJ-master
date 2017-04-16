
public class ServicoEmailProcNaoAceito implements IServicoEmail {
	
	JavaEmailApp app;
	
	public ServicoEmailProcNaoAceito () {
		app = new JavaEmailApp();
	}
	
	public boolean sendEmail(String address) {
		app.enviaNaoAceito();
		return true;
	}

}
