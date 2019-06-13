package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("lastname")).sendKeys("Test1");
		driver.findElement(By.name("reg_email__")).sendKeys("4161111111");
		driver.findElement(By.name("reg_passwd__")).sendKeys("asdasdasdasd");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select m = new Select(month);
		m.selectByIndex(5);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select d = new Select(day);
		d.selectByIndex(10);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select y = new Select(year);
		y.selectByVisibleText("1991");;
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='u_0_a']"));
		
		radio.click();
		
		driver.findElement(By.name("websubmit")).click();
			
		Thread.sleep(2000);
		
		String Expected = "What’s your name?";
		
		//String Actual = driver.findElement(By.xpath("//div[contains(text(),'What’s your name?')]")).getText();
		String Actual = driver.findElement(By.xpath("(//div[contains(@id, 'js_')])[2]")).getText();
		
		// When we have space in the class name we cannot directly call by by.className 
		
		System.out.println(Actual);
		
		if(Expected.equals(Actual)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");

		}
		
	}

}
