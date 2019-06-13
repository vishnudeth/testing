package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {

	
		//Read Properties File
		FileInputStream fs = new FileInputStream("/Users/Deth/Desktop/Selenium/testing/prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/Deth/Desktop/Selenium/SeleniumJars/geckodriver");
			FirefoxDriver driver = new FirefoxDriver();
		} else {
				System.setProperty("webdriver.chrome.driver","/Users/Deth/Desktop/Selenium/SeleniumJars/chromedriver");
				 ChromeDriver driver = new ChromeDriver();
		} 
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("environment"));
		
		//Write Properties File
		
		prop.setProperty("first name", "Vishnu");
		System.out.println(prop.getProperty("first name"));
		
		prop.setProperty("last name", "Deth");
		System.out.println(prop.getProperty("last name"));
		
		FileOutputStream fo = new FileOutputStream("/Users/Deth/Desktop/Selenium/testing/prop.properties");
		prop.store(fo, "Adding to File");
		
		
		
	}

}
