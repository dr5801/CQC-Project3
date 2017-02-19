import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Drew Rife and Jordan Long
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
			TestIntegerState.class,
			TestStartState.class,
			TestBaseState.class
		})
public class RunAllTests {}
