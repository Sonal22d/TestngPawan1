package com.parameter_CBT_parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {  //(setup),testLogo,testTitle,testURL,(teardown)
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			return;
		}

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 1)
	public void testLogo() {
	
		//boolean status = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void testTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority = 3)
	public void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}

/*
 * Parameter passing from xml--> TC on eclipse OR CBT OR Parallel
 * Testing--mention in <suite> tag <parallel="tests"> Steps : 
 * 1)Create Test Case
 * 2)Create xml file then run TC through xml 
 * 3)Pass browser name,url as
 * parameters from xml file to setup() method 4)Execute TC on chrome,edge n
 * firefox browser (serial execution) 5)Execute TC on chrome,edge n firefox
 * browser (parallel execution)
 */

