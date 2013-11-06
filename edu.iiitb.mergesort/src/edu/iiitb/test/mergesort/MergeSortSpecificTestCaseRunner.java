package edu.iiitb.test.mergesort;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MergeSortSpecificTestCaseRunner {

	public static void main(String[] args) {
		System.out.println("Runing Junit Test Suite");
		JUnitCore jUnitCore = new JUnitCore();
		Request request = Request.method(MergeSortJunitTest.class,
				"regressionTestMergeSort");
		for (int count = 0; count < 4; count++) {
			Result result = jUnitCore.run(request);
			// Result result = JUnitCore.runClasses(MergeSortJunit.class);
			if (result.wasSuccessful()) {
				System.out.println("Run Success");
			} else {
				System.out.println("Run Failed");
				for (Failure failure : result.getFailures()) {
					System.out.println(failure.toString());
				}
			}
		}
	}

}
