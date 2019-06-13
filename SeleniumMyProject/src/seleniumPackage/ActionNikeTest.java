package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionNikeTest {

	public static void main(String[] args) throws InterruptedException {

		// May 4th 2019
		
		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.linkText("MEN"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(3000);
		
		WebElement nikeMen = driver.findElement(By.xpath("(//div[@class='nav-menu-column prl4-sm va-sm-t d-sm-tc has-left-border is-header'])[1]/a"));
		List<WebElement> nikeShoes = nikeMen.findElements(By.xpath("(//div[@class='nav-menu-column prl4-sm va-sm-t d-sm-tc has-left-border is-header'])[1]/a"));
		System.out.println(nikeShoes.size());
		
		for(WebElement a: nikeShoes) {
			System.out.println(a.getText());
		}
		
		
		
		
	}

}
