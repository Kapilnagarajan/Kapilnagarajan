package com.pageobjectbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUsername;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPass;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement txtLogin;

	public void setUser(String uname) {
		txtUsername.sendKeys(uname);
	}

	public void setPwd(String pwd) {
		txtPass.sendKeys(pwd);
	}

	public void setLog() {
		txtLogin.click();
	}

}
