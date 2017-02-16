import enums.State_Enum;

/**
 * @author Drew Rife and Jordan Long
 * 
 * interface of States
 */
public interface State 
{
	/**
	 * @param sign to be set
	 */
	void setSign(int sign);
	
	/**
	 * @return the sign
	 */
	int getSign();
	
	/**
	 * @param value to be set
	 */
	void setValue(double value);
	
	/**
	 * @return the value
	 */
	double getValue();
	
	/**
	 * @param point
	 */
	void setPoint(double point);
	
	/**
	 * @return point
	 */
	double getPoint();
	
	State_Enum evaluate(char input);
}
