import org.junit.*;
import static org.junit.Assert.*;
public class NoodiTestid{
	@Test
	public void loomine(){
		Noot n1=new Noot("A");
	}
	@Test
	public void korgus(){
		Noot n1=new Noot("A");
		assertEquals(69, n1.kysiKorgus());
		Noot n1=new Noot("c");
		assertEquals(60, n2.kysiKorgus());
	}
}