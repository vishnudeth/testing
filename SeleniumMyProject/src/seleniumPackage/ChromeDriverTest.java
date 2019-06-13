package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/Deth/Desktop/Selenium/SeleniumJars/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //To open the facebook browser
		driver.findElement(By.id("email")).sendKeys("asseasss"); //Finding the email login text and giving the value
		driver.findElement(By.id("pass")).sendKeys("sadasdadasd"); // Finding the password text and giving the value
		driver.findElement(By.id("loginbutton")).click(); // Clicking the fb login button
	}

}
