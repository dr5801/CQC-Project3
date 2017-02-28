import static org.junit.Assert.*;
import org.junit.Test;

import enums.State_Enum;

/**
 * 
 * @author Drew Rife and Jordan Long
 * 
 * Tests EndState class
 *
 */
public class TestEndState 
{
	/**
	 * Tests intialization of EndState
	 */
	@Test
	public void testInitialization()
	{
		EndState endState = new EndState();
		
		assertEquals(1, endState.getSign());
		assertEquals(0, endState.getValue(), 0.0001);
		assertEquals(0.0f, endState.getPoint(), 0.0001);
	}

	/**
	 * Tests the evaluate method of EndState class
	 */
	@Test
	public void testEndStateEvaluate()
	{
		EndState endState = new EndState();
		endState.setSign(-1);
		endState.setValue(999999);
		endState.setPoint(0.1);
		
		State_Enum nextState = endState.evaluate('\0');
		assertEquals(-1, endState.getSign());
		assertEquals(0, endState.getValue(), 0.0001);
		assertEquals(0.1f, endState.getPoint(), 0.0001);
	}
}
