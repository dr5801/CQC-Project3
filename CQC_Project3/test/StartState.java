import enums.State_Enum;

public class StartState extends BaseState 
{
	public StartState(){}
	
	/**
	 * Decides on which state to switch to based on the @param input
	 */
	@Override
	public State_Enum evaluate(char input) 
	{
		State_Enum nextState = null;
		
		if(Character.isDigit(input))
		{
			value = Character.getNumericValue(input);
			nextState = State_Enum.INTEGER;
		}
		else
		{
			nextState = State_Enum.END;
		}
		
		return State_Enum.INTEGER;
	}

}
