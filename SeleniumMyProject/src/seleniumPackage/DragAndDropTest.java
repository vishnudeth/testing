package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		builder.dragAndDrop(drag, drop).build().perform(); //dragAndDrop function used to perform the drag and drop functionality
		
				
		if(drop.getText().equals("Dropped!")) {	
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		
		
	}

}
