import enums.State_Enum;

/**
 * 
 * @author Drew Rife and Jordan Long
 *
 */
public class EndState extends BaseState 
{
	public EndState() {}

	@Override
	public State_Enum evaluate(char input) 
	{
		State_Enum nextState = State_Enum.END;
		value = 0;
		return nextState;
	}
}