package selenium;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

//First day of Junit

public class Testing3 {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();

	@Test
	public void test6() {
		System.out.println("I am in TestAssert");
		String actualMessage = "abcd";
		String expectMessage = "abcde";
		Assert.assertEquals(expectMessage, actualMessage);
		System.out.println("after 1st Assert");
		Assert.assertTrue("Verifying if 2>3", 2>3);
		System.out.println("after 2nd Assert");
		
	}
	
	@Test
	public void test7() {
		System.out.println("I am in TestAssert");
		String actualMessage = "abcd";
		String expectMessage = "abcd";
		try {
		Assert.assertEquals(expectMessage, actualMessage);
		} catch (Throwable t) {
			System.out.println("Catch 1");
			errCol.addError(t);
		}
		System.out.println("after 1st Assert");
		try {
		Assert.assertTrue("Verifying if 2>3", 2>3);
		} catch(Throwable t) {
		System.out.println("Catch 2");
		errCol.addError(t);
		}
		System.out.println("after 2nd Assert");
		
	}
	

}
/*If the first assertion condition fails then it will never be going to the next line for execution
 WE can comment the annotations to prevent running the test cases. Eg: //@test
 If we use ErrorCollector class we can report whether the test has passed or not
 Without ErrorCollector class we cannot identify whether the test is a failure or not
 Test will always show as passed when we use Assertion inside the try and catch is an exception statement
 */
