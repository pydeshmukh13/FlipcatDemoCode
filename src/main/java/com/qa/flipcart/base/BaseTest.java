package com.qa.flipcart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.flipcart.Page.LoginPage;

public class BaseTest {

	public BasePage basePage;
	public Properties prop;
	public WebDriver driver;
	public LoginPage loginPage;

	@BeforeTest
	public void setUp() {
		basePage=new BasePage();
		prop=basePage.init_properties();
		driver=basePage.init_driver(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		loginPage=new LoginPage(driver);
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
