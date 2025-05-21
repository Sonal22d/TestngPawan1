package com.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = { "sanity"})
	public void m1() {
		System.out.println("I am m1");

	}

	@Test(groups = { "sanity" })
	public void m2() {
		System.out.println("I am m2");
		//Assert.fail();

	}

	@Test(groups = { "regression" })
	public void m3() {
		System.out.println("I am m3");

	}

}





