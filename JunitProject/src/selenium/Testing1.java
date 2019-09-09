package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//First class of Junit

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("Login");
		System.out.println("Performs before every test cases");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("Performs before after test cases");
		System.out.println("Logout");
	}

	@Test
	public void test1() {
		System.out.println("test case 1");  //Writes selenium code for any code to run
	}
	
	@Test
	public void test2() {
		System.out.println("test case 2");
	}
	
	@Test
	public void test3() {
		System.out.println("test case 3");
	}

}


// There are mainly 2 main anotations
