package com.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test(groups="sanity")
	public void m1() {
		System.out.println("I am Test - m1 ");
	}

	@BeforeClass
	public void mclass() {
		System.out.println("Before Class");
	}

	@BeforeSuite
	public void msuit() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void mtest() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void m2() {
		System.out.println("Before Method");
	}

	@Test
	public void m3() {
		System.out.println("I am Test - m3");
	}

	@AfterMethod
	public void m4() {
		System.out.println("After Method");
	}

}

//Asserts Types -(Hard n Soft -Both asserts have same methods)

//Assert.assertEquals(abc,abc); -PASS
//Assert.assertNotEquals(abc,abc); - FAIL
//Assert,assertTrue(True); - PASS
//Assert.assertFalse(False); - PASS
//Assert.assertFalse(True); - FAIL
//Assert.assertTrue(False); - FAIL

//1) Hard Assert - Static class so Assert.assertEquals(abc,abc)
//    If Test fails,it will not allow further execution in the same Test case.

//2) Soft Assert - Instance class so create object.
//   SoftAssert sa = new SoftAssert();
//   sa.assertEquals(abc,abc);
//   sa.assertAll();

//Although Test fails,further execution in the same TC will takes place.

//Assert.assertTrue(True); - Expected is True n actual is also True so result is PASS
//Assert.assertFalse(True);- Expected is False n actual is True so result is FAIL

// Assert.fail(); - Used to fail the Test case/method deliberately

// By default priority is 0.
//0 n negative no.s have highest priority. eg. -1,0,1...
// If priority is not set,TCs executes in alphabetic manner.
