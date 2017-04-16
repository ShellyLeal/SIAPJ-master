

public class TestFactoryService {

	public static void main(String[] args) {
		ServiceFactory factory = new ServiceFactory();
		Service one = factory.chooseService("email");
		one.name = "cannabiranha@gmail.com";
		one.enviaAceito(); 
		Service two = factory.chooseService("carta");
		two.name = " Raphael ";
		two.enviaAceito();
		Service three = factory.chooseService("carta");
		three.name = " Sheyne ";
		three.enviaNaoAceito();
		
	}

}
