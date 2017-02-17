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
			
		}
		else
		{
			nextState = State_Enum.END;
		}
		
		return State_Enum.INTEGER;
	}

}
