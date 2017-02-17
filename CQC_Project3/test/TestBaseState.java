import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Drew Rife
 * 
 * Tests the Base_State class
 */
public class TestBaseState 
{
	/**
	 * Tests for the initialization of Base_State
	 * (Uses the MockState as a way to test BaseState
	 */
	@Test
	public void testInitializationOfBaseState()
	{
		State mockState = new MockState();
		assertEquals(1, mockState.getSign());
		assertEquals(0, mockState.getValue(), 0.0001);
		assertEquals(1.000f, mockState.getPoint(), 0.0001);
	}
	
	/**
	 * Test by setting sign a new value and seeing if it is returned from the getter
	 */
	@Test
	public void testSettingSign()
	{
		State mockState = new MockState();
		mockState.setSign(0);
		
		assertEquals(0, mockState.getSign());
		assertEquals(0, mockState.getValue(), 0.0001);
		assertEquals(1.000f, mockState.getPoint(), 0.0001);
	}
	
	/**
	 * Test by setting value a new value and seeing if it is returned from the getter
	 */
	@Test
	public void testSettingValue()
	{
		State mockState = new MockState();
		mockState.setValue(20);
		
		assertEquals(1, mockState.getSign());
		assertEquals(20, mockState.getValue(), 0.0001);
		assertEquals(1.000f, mockState.getPoint(), 0.0001);
	}
	
	/**
	 * Test by setting point a new value and seeing if it is returned for the getter
	 */
	@Test
	public void testSettingPoint()
	{
		State mockState = new MockState();
		mockState.setPoint(0.071);
		
		assertEquals(1, mockState.getSign());
		assertEquals(0, mockState.getValue(), 0.0001);
		assertEquals(0.071f, mockState.getPoint(), 0.0001);
	}
}
