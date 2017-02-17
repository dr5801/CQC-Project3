import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife
 * 
 * Tests the Base_State class
 */
public class Test_Base_State 
{
	/**
	 * Tests for the initialization of Base_State
	 * (Uses the MockState as a way to test BaseState
	 */
	@Test
	public void testInitializationOfBaseState()
	{
		State state = new MockState();
		assertEquals(1, state.getSign());
		assertEquals(0, state.getValue(), 0.0001);
		assertEquals(1.000f, state.getPoint(), 0.0001);
	}

}
