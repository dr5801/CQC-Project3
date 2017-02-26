import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Drew Rife and Jordan Long
 * 
 * Runs system
 */
public class Runner 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number :");
		String input = scanner.nextLine();
		
		StateManager stateManager = new StateManager();
		stateManager.execute(input);
		
		double result = stateManager.getResult();
		
		NumberFormat formatter = new DecimalFormat("#0.000");
		System.out.println(formatter.format(result));
	}
}
