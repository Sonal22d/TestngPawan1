package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage { // Page Object Class

	// constructor
	WebDriver driver;

	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators

	By txt_username_loc = By.xpath("//input[@name=\"username\"]");
	By txt_password_loc = By.xpath("//input[@type=\"password\"]");
	By txt_loginbutton_loc = By.xpath("//button[@type=\"submit\"]");

	// Action Methods

	public void setusername(String name) {
		driver.findElement(txt_username_loc).sendKeys(name);
	}

	public void setpassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void loginbutton() {
		driver.findElement(txt_loginbutton_loc).click();
	}

}
//