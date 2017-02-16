import enums.State_Enum;

/**
 * @author Drew Rife and Jordan Long
 *
 */
public abstract class Base_State implements State {

	/**
	 * 
	 */
	public Base_State() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see State#setSign(int)
	 */
	@Override
	public void setSign(int sign) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see State#getSign()
	 */
	@Override
	public int getSign() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see State#setValue(double)
	 */
	@Override
	public void setValue(double value) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see State#getValue()
	 */
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see State#setPoint(double)
	 */
	@Override
	public void setPoint(double point) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see State#getPoint()
	 */
	@Override
	public double getPoint() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see State#evaluate(char)
	 */
	@Override
	public State_Enum evaluate(char input) {
		// TODO Auto-generated method stub
		return null;
	}

}
