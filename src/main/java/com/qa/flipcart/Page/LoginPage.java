package com.qa.flipcart.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.flipcart.base.BasePage;

public class LoginPage extends BasePage{
	
	//locators
	private By Logo=By.xpath("//img[@title='Flipkart']");
	private By username=By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']");
	private By password=By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']");
	private By forgotPass=By.xpath("//a[@class='_2QKxJ- _2_DUc_']/span");
	private By loginbtn=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	//constructor
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// PageActions

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean getLoginPageLOGO() {
		return driver.findElement(Logo).isDisplayed();
	}
	
	public boolean isForgotLinkExist() {
		return driver.findElement(forgotPass).isDisplayed();
	}
	
	public void doLoginMethod(String user, String Pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(Pass);
		driver.findElement(loginbtn).click();
	}
	
}
