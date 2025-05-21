package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagefactory {
	// Constructor

	WebDriver driver;

	LoginPagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Locators
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement txt_username;
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement txt_password;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement btn_login;

	// Action Methods

	public void setusername(String name) {
		txt_username.sendKeys(name);

	}

	public void setpassword(String pwd) {
		txt_password.sendKeys(pwd);

	}

	public void loginbutton() {
		btn_login.click();

	}

}
