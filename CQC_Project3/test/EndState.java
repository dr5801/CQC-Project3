import enums.State_Enum;

public class EndState extends BaseState
{
	public EndState() {}

	/**
	 * There is no other state to transition to
	 */
	@Override
	public State_Enum evaluate(char input) 
	{
		State_Enum nextState = State_Enum.END;
		value = 0;
		return nextState;
	}

}
