package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

//	public void onStart(ITestContext context) {
//	   System.out.println("Test execution started..");
//	  }
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}

//	public void onTestSuccess(ITestResult result) {
//		 System.out.println("Test successful ");
//	  }
//	public void onTestFailure(ITestResult result) {
//		 System.out.println("Test failed");
//	  }
//	public void onTestSkipped(ITestResult result) {
//		 System.out.println("Test skipped");
//	  }
	public void onFinish(ITestContext context) {
		System.out.println("Test finished");
	}
}

/*
 * Integrate Listener class into TC class by using 2 approaches - either
   testng.xml OR Just specify @Listener(Listener class name) annotationn in the
   TC class 
  - xml approach is better as there is no necessity to specify @Listener
   annotation to every TC class,its applicable to all classes in a project
  - Throughout project only one Listener class is available as post actions(start,success,fail,finish..)are same for all TCs 
 */

/*
 * TC class + Listener class + testng.xml Create Test case class n Listener
 * class n then integrate these classes using xml. Create Test Case Create
 * Listener Class Create xml file n include both TC and Listener Class
 */
