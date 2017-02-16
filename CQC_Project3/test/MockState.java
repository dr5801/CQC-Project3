import enums.State_Enum;

/**
 * @author Drew Rife and Jordan Long
 *
 * A MockState of BaseState used for testing
 */
public class MockState extends Base_State 
{
	/**
	 * Decides what new state to return based on the character input
	 * 
	 * @param input
	 * @return the new state
	 */
	@Override
	public State_Enum evaluate(char input) 
	{
		return null;
	}
}