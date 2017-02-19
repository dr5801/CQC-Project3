import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Drew Rife and Jordan Long
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
			TestBaseState.class,
			TestStartState.class,
			TestIntegerState.class,
			TestDecimalState.class
		})
public class RunAllTests {}
