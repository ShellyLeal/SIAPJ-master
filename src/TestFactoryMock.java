import junit.framework.TestCase;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TestFactoryMock extends TestCase {
	
public static void testeNumeroDeChamadasProcessoAceito (){
		JavaEmailApp one = mock(JavaEmailApp.class);
	
		one.name = "cannabiranha@gmail.com";
		one.enviaAceito();
		one.name = "shellyleal.ita@gmail.com";
		one.enviaAceito();
		verify(one, atLeastOnce()).enviaAceito();
		verify(one, times(2)).enviaAceito();
		verify(one, never()).enviaNaoAceito();
		
		EnvioCarta two = mock(EnvioCarta.class);
		
		two.name = " Shelly ";
		two.enviaNaoAceito();
		verify(two, times(1)).enviaNaoAceito();
		
	}
}
