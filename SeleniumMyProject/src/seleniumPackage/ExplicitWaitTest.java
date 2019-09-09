package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 100); //declaring object for WebElementWait class
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@id='identifierId' and @type = 'email']")).sendKeys("test55");
		driver.findElement(By.xpath("(//div[@id = 'identifierNext'])[1]")).click();
		//Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.xpath("//input[@name='password' and @type = 'password']")).sendKeys("asdasdasd");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//Thread.sleep(5000);
		
		String ExpectedErr = "Wrong password. Try again or click Forgot password to reset it.";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='GQ8Pzc']"), "Wrong password. Try again or click Forgot password to reset it."));
		String ActualErr = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
		

		if(ExpectedErr.equals(ActualErr)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	

	}

}
