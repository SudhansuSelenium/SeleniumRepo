package com.magento.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver ;

	public static Properties propertiesFile;

	@Before
	public static void setup() throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
	
System.out.println("Test statred...");
		FileInputStream fis = new FileInputStream(
				"D:\\JavaProject\\SeleniumProjects\\MangentoAutomation\\src\\main\\java\\com\\magento\\config\\config.properties");

		propertiesFile = new Properties();
		propertiesFile.load(fis);

		String URL = propertiesFile.getProperty("url");
		System.setProperty("webdriver.gecko.driver", "D:\\Seleniumjar\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(URL);
		fis.close();

	}

}
