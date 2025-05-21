package com.parameter_CBT_parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String br) {

		if (br.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/");
	}

	@Test
	public void testm1() {
		System.out.println("I am in testm1 method");
	}

	@Test
	public void gettitle() {

		String title = driver.getTitle();
		Assert.assertNotEquals(title, "amazon.in");
		System.out.println(title);
	}
}

//Cross Browser Testing - Same TC will get executed on multiple browsers at a time.
//One project may have multiple  testng.xml files
// In testNG - Install testng from eclipse MarketPlace AND put the dependency in pom.xml
//In testng.xml : groups,parameters - are written above <class>


