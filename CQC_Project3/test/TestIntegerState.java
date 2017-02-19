import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the IntegerState class
 */
public class TestIntegerState 
{
	@Test
	public void testInitialization()
	{
		State integerState = new IntegerState();
		
		assertEquals(1, integerState.getSign());
		assertEquals(0, integerState.getValue(), 0.0001);
		assertEquals(1.0f, integerState.getPoint(), 0.0001);
	}
}
