package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert = new SoftAssert();
	
  @Test(priority=1, groups = "smoke")
  public void homeTest() {
	  System.out.println("I'm in home test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(4>3, "Is 4 greater than 3");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test(priority=2, dependsOnMethods= {"homeTest"}, groups = {"smoke", "sanity"})
  public void mainTest() {
	  System.out.println("I'm in main test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2>3, "Is 4 greater than 3");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc1");
	  softAssert.assertAll();
  }
  
  @Test(priority=3, dependsOnMethods= {"mainTest"}, groups = "xyz")
  public void endTest() {
	  System.out.println("I'm in end test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(4>3, "Is 4 greater than 3");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
	  System.out.println("After second Assertion");
	  softAssert.assertAll();
  }
}
