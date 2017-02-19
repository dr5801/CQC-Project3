import enums.State_Enum;

public class DecimalState extends BaseState {

	@Override
	public State_Enum evaluate(char input) 
	{
		if(Character.isDigit(input))
		{
			value += point * Character.getNumericValue(input);
			point /= 10;
		}
		// TODO Auto-generated method stub
		return null;
	}

}
