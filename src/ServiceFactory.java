
public class ServiceFactory {
public Service chooseService(String type){
	if(type.equals("email"))
        return new JavaEmailApp();
     else if(type.equals("carta"))
        return new EnvioCarta();
     else
        return null;
	}
}
