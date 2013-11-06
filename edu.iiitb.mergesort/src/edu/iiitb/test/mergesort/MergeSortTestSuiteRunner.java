package edu.iiitb.test.mergesort;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This runner executes the suitable test suite.
 * 
 */
public class MergeSortTestSuiteRunner {

	private static String REG = "Regression";

	private static String STAND_ALONE = "StandAlone";

	public static void main(String[] args) {
		String testCategory = STAND_ALONE;
		if (testCategory.equals(REG)) {
			regressionTest();
		} else {
			standAloneTest();
		}

	}

	/**
	 * Runs the regression test suite
	 */
	public static void regressionTest() {
		for (int i = 0; i < 5; i++) {
			Result result = JUnitCore
					.runClasses(MergeSortRegressionTestSuite.class);

			for (Failure failure : result.getFailures()) {
				// This one failure representation. Later may use more specific
				// details to pin point to errors or display the entire stack
				// trace.
				System.out.println(failure.toString());
			}
		}
	}

	/**
	 * Runs the stand alone test cases suite.
	 */
	public static void standAloneTest() {
		Result result = JUnitCore
				.runClasses(MergeSortStandAloneTestSuite.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Test suite success = " + result.wasSuccessful());
	}

}
