import static org.junit.Assert.*;
import org.junit.Test;

import enums.State_Enum;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the IntegerState class
 */
public class TestIntegerState 
{
	/**
	 * Tests the initialization of integer state
	 */
	@Test
	public void testInitialization()
	{
		State integerState = new IntegerState();
		
		assertEquals(1, integerState.getSign());
		assertEquals(0, integerState.getValue(), 0.0001);
		assertEquals(1.0f, integerState.getPoint(), 0.0001);
	}
	
	/**
	 * Tests integer state evaluating a digit input
	 */
	@Test
	public void testDigitInput()
	{
		State integerState = new IntegerState();
		integerState.setValue(1);
		
		State_Enum nextState = integerState.evaluate('5');
		assertEquals(1, integerState.getSign());
		assertEquals(15, integerState.getValue(), 0.0001);
		assertEquals(1.0f, integerState.getPoint(), 0.0001);
		assertEquals(State_Enum.INTEGER, nextState);
	}
	
	/**
	 * Tests integer state evaluating a decimal input
	 */
	@Test
	public void testDecimalInput()
	{
		
	}
}
