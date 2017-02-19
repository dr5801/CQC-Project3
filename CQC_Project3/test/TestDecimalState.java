import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Drew Rife and Jordan Long
 * 
 * tests the DecimalState class
 *
 */
public class TestDecimalState 
{
	/**
	 * tests the initialization of DecimalState class
	 */
	@Test
	public void testInitialization()
	{
		DecimalState decimalState = new DecimalState();
		assertEquals(1, decimalState.getSign());
		assertEquals(0, decimalState.getValue(), 0.0001);
		assertEquals(1.0f, decimalState.getPoint(), 0.0001);
	}
	
	/**
	 * tests DecimalState evaluating digit input
	 * 
	 * SHOULD STAY AT DECIMAL STATE
	 */
	@Test
	public void testDigitInput()
	{
		
	}
}
