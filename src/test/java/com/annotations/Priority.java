package com.annotations;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
	public void m1() {
		System.out.println("I am m1");
	}

	@Test(priority = 2)
	public void m2() {
		System.out.println("I am m2");
	}

	@Test(priority = -1)
	public void m3() {
		System.out.println("I am m3");
	}

}
