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
		assertEquals(0.0f, integerState.getPoint(), 0.0001);
	}
	
	/**
	 * Tests integer state evaluating a digit input
	 * 
	 * SHOULD STAY AT INTEGER STATE
	 */
	@Test
	public void testDigitInput()
	{
		State integerState = new IntegerState();
		integerState.setValue(1);
		
		/* also check that sign is correct */
		integerState.setSign(-1);
		
		State_Enum nextState = integerState.evaluate('5');
		assertEquals(-1, integerState.getSign());
		assertEquals(15, integerState.getValue(), 0.0001);
		assertEquals(0.0f, integerState.getPoint(), 0.0001);
		assertEquals(State_Enum.INTEGER, nextState);
	}
	
	/**
	 * Tests integer state evaluating a decimal input
	 * 
	 * SHOULD TRANSITION TO DECIMAL STATE
	 */
	@Test
	public void testDecimalInput()
	{
		State integerState = new IntegerState();
		
		State_Enum nextState = integerState.evaluate('.');
		assertEquals(1, integerState.getSign());
		assertEquals(0, integerState.getValue(), 0.0001);
		assertEquals(0.1f, integerState.getPoint(), 0.0001);
		assertEquals(State_Enum.DECIMAL, nextState);
	}
	
	/**
	 * tests integer state evaluating a null terminator
	 * 
	 * SHOULD TRANSITION TO END STATE
	 */
	@Test
	public void testNullTerminator()
	{
		State integerState = new IntegerState();
		integerState.setSign(-1);
		integerState.setValue(300);
		
		State_Enum nextState = integerState.evaluate('\0');
		assertEquals(-1, integerState.getSign());
		assertEquals(-300, integerState.getValue(), 0.0001);
		assertEquals(0.0f, integerState.getPoint(), 0.0001);
		assertEquals(State_Enum.END, nextState);
	}
	
	/**
	 * tests integer state evaluating invalid input
	 * 
	 * SHOULD TRANSITION TO END STATE
	 */
	@Test
	public void invalidInput()
	{
		State integerState = new IntegerState();
		integerState.setSign(-1);
		integerState.setValue(30000);
		integerState.setPoint(0.01);
		
		State_Enum nextState = integerState.evaluate('a');
		assertEquals(-1, integerState.getSign());
		assertEquals(0, integerState.getValue(), 0.0001);
		assertEquals(0.01f, integerState.getPoint(), 0.00001);
		assertEquals(State_Enum.END, nextState);
	}
}
