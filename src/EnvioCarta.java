
public class EnvioCarta extends Service {
	public void enviaAceito(){
		      System.out.println("SP, 15 de abril de 2017\n\n");
		      System.out.println("Caro(a)" + name + "\n");//Assunto
		      System.out.println("O processo foi aceito.\n");
              
	}

	public void enviaNaoAceito(){
		System.out.println("SP, 15 de abril de 2017\n\n");
		System.out.println("Caro(a) "+ name+ "\n");//Assunto
		System.out.println("O processo não foi aceito.\n");
	}
}
