package com.pageobjectbank;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr411640";
	public String password = "emegAra";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		 logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
