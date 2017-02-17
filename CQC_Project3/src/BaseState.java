/**
 * @author Drew Rife and Jordan Long
 *
 * A state abstract class that all children state class inherit
 */
public abstract class BaseState implements State 
{
	protected int sign;
	protected double value;
	protected double point;

	/**
	 * Initialize sign, value, point according to project values 
	 */
	public BaseState() 
	{
		sign = 1;
		value = 0;
		point = 1.0;
	}

	/**
	 * @param sign
	 */
	@Override
	public void setSign(int sign) 
	{
		this.sign = sign;
	}

	/**
	 * @return the sign
	 */
	@Override
	public int getSign() 
	{
		return sign;
	}

	/**
	 * @param value
	 */
	@Override
	public void setValue(double value) 
	{
		this.value = value;
	}

	/**
	 * @return the value
	 */
	@Override
	public double getValue() 
	{
		return value;
	}

	/**
	 * @param point
	 */
	@Override
	public void setPoint(double point) 
	{
		this.point = point;
	}

	/**
	 * @return point
	 */
	@Override
	public double getPoint() 
	{
		return point;
	}
}
