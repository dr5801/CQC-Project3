import enums.State_Enum;

public class StateManager 
{
	/* states */
	private StartState startState;
	private DecimalState decimalState;
	private IntegerState integerState;
	private EndState endState;
	private State currentState;
	
	/**
	 * set the defaults
	 */
	public StateManager()
	{
		startState = new StartState();
		decimalState = new DecimalState();
		integerState = new IntegerState();
		endState = new EndState();
		currentState = startState;
	}

	/**
	 * executes the state machine 
	 * @param input
	 */
	public void execute(String input) 
	{
		String text = input + '\0';
		
		for(char character : text.toCharArray())
		{
			State_Enum state = currentState.evaluate(character);
			State nextState;
			
			if(state == State_Enum.INTEGER)
			{
				nextState = integerState;
			}
			else if(state == State_Enum.DECIMAL)
			{
				nextState = decimalState;
			}
			else
			{
				nextState = endState;
			}
			
			nextState.setValue(currentState.getValue());
			nextState.setSign(currentState.getSign());
			nextState.setPoint(currentState.getPoint());
			
			currentState = nextState;
		}
	}
	
	/**
	 * @return the result of the state machine
	 */
	public double getResult()
	{
		return currentState.getValue();
	}

}
