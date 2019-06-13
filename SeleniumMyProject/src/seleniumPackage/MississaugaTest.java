package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MississaugaTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.mississauga.ca/portal/home");
		
		WebElement missi = driver.findElement(By.xpath("//img[@alt='City Hall']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(missi).build().perform();
		
		List<WebElement> cityHall = missi.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		System.out.println(cityHall.size());
		
		for(WebElement a: cityHall) {
			
			System.out.println(a.getText());
			
		}
		
		for(int i=0;i< cityHall.size(); i++) {
			
		cityHall.get(4).click();
		break;
			
		}
		
	}

}
