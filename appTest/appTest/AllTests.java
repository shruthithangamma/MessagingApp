package appTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MessageAppDayTest.class, MessageAppTest.class,
		MessageAppTextareaLengthTest.class })
public class AllTests {

}
