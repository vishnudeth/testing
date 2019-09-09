package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@id='identifierId' and @type = 'email']")).sendKeys("test55");
		driver.findElement(By.xpath("(//div[@id = 'identifierNext'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password' and @type = 'password']")).sendKeys("asdasdasd");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		String ExpectedErr = "Wrong password. Try again or click Forgot password to reset it.";
		
		String ActualErr = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
	
		if(ExpectedErr.equals(ActualErr)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	
	}

}
