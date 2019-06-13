package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//May 5th 2019
public class FrameTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sorta = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sorta.size());
		
		if(sorta.size()>0) {
			System.out.println("Element sortable Present");
		} else {
			System.out.println("Element sortable not present");
		}
		
		List<WebElement> drag = driver.findElements(By.id("draggable"));
		
		System.out.println(drag.size());
		
		if(drag.size()>0) {
			System.out.println("Drag me is Present");
		} else {
			System.out.println("Drag me is not present");
		}
		
		driver.switchTo().frame(0); // Drag me is in a frame which is outside the HTML code it is inside an iframe
		// We can use three ways to switch to an iframe via, integer, String and WebElement
		//driver.switchTo().frame("demo-frame"); // String has to an 'id'. In this case we cannot use it because we do not have an 'id' for iframe
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); This is using a webElement

		System.out.println("------------------------After Switchig to Frame--------------------------");
		sorta = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sorta.size());
		
		if(sorta.size()>0) {
			System.out.println("Element sortable Present");
		} else {
			System.out.println("Element sortable not present");
		}
		
		drag = driver.findElements(By.id("draggable"));
		
		System.out.println(drag.size());
		
		if(drag.size()>0) {
			System.out.println("Drag me is Present");
		} else {
			System.out.println("Drag me is not present");
		}
		
		driver.switchTo().defaultContent(); // Switching back to the main from Frame(iframe)

		System.out.println("------------------------After Switchig to Main--------------------------");
		
		
		sorta = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sorta.size());
		
		if(sorta.size()>0) {
			System.out.println("Element sortable Present");
		} else {
			System.out.println("Element sortable not present");
		}
		
		drag = driver.findElements(By.id("draggable"));
		
		System.out.println(drag.size());
		
		if(drag.size()>0) {
			System.out.println("Drag me is Present");
		} else {
			System.out.println("Drag me is not present");
		}
		
		
		//driver.switchTo().parentFrame()
		//The above code work when we have multiple frames inside one frame and we need to switch back to the parent frame
		
	}

}
