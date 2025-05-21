package com.dataprovider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderDemo {
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(3,null);
	}

	@Test(dataProvider = "dp")
	public void m1(String email, String pwd) throws InterruptedException {
		System.out.println("I am in m1");

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(email);

		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();

	}

	@DataProvider(name = "dp")
	public Object dpmethod() {
		Object data[][] = { { "Shital@gmail.com", "Shital123" }, { "Sonal@gmail.com", "Sonal123" },
				{ "Riya@gmail.com", "Riya123" } };
		return data;
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}