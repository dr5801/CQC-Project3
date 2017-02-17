import static org.junit.Assert.*;
import org.junit.Test;

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
	
	
}
