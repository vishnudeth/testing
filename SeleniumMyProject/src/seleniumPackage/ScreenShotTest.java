package seleniumPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE); // This is for FirefoxDriver
		//File scrFile = ((TakesScreenshot)driver)getScreenshotAs(OutputType.FILE); // This is for WebDriver
		FileUtils.copyFile(scrFile, new File("/Users/Deth/Desktop/Selenium/testing/screenshot.png"));
		
	}

}
