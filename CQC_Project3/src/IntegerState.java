import enums.State_Enum;

/**
 * 
 * @author Drew Rife and Jordan Long
 *
 */
public class IntegerState extends BaseState
{
	public IntegerState() {}
	
	/**
	 * Decides on which state to switch to based on the @param input
	 * 
	 * Digit  -> INTEGER
	 *   '.'  -> DECIMAL
	 *   '\0' -> End
	 *  Else  -> END
	 */
	public State_Enum evaluate(char input)
	{
		State_Enum nextState = null;
		
		if(Character.isDigit(input))
		{
			value *= 10;
			value += Character.getNumericValue(input);
		}
		else if(input == '.')
		{
			point = .1;
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
