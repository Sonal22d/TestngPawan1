package com.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {  // This can be run through xml file also.Just create xml file n run as testngSuite
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test
	public void login() {
		//LoginPage page = new LoginPage(driver);             // Without PageFactory Approach
		
		LoginPagefactory page = new LoginPagefactory(driver); //PageFactory Approach - @FindBy
		
		page.setusername("Sonal");
		page.setpassword("Sonal@123");
		page.loginbutton();
	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}
}
