import static org.junit.Assert.*;
import org.junit.Test;

import enums.State_Enum;

/**
 * @author Drew Rife and Jordan Long
 * 
 * Tests the Start_State
 */
public class TestStartState 
{
	
	/**
	 * Test initialization of StartState class
	 */
	@Test
	public void testInitialization()
	{
		State startState = new StartState();
		
		assertEquals(1, startState.getSign());
		assertEquals(0, startState.getValue(), 0.0001);
		assertEquals(1.0f, startState.getPoint(), 0.0001);
	}
	
	/**
	 * test sending a letter as an input
	 */
	@Test
	public void testCharacterLetterInput()
	{
		State startState = new StartState();
		State_Enum nextState = startState.evaluate('a');
	
		assertEquals(1, startState.getSign());
		assertEquals(0, startState.getValue(), 0.0001);
		assertEquals(nextState, State_Enum.INTEGER);
	}
}
