import enums.State_Enum;

public class DecimalState extends BaseState 
{
	public DecimalState() {}

	/**
	 * Evaluates a given input
	 * 
	 * DIGIT   -> DECIMAL STATE
	 * '\0'    -> END STATE
	 * invalid -> END STATE
	 */
	@Override
	public State_Enum evaluate(char input) 
	{
		State_Enum nextState = null;
		if(Character.isDigit(input))
		{
			value += point * Character.getNumericValue(input);
			point /= 10;
			nextState = State_Enum.DECIMAL;
		}
		else if(input == '\0')
		{
			value *= sign;
			nextState = State_Enum.END;
		}
		else
		{
			value = 0;
			nextState = State_Enum.END;
		}
		
		return nextState;
	}

}
