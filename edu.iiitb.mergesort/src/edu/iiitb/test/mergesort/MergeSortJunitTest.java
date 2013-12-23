package edu.iiitb.test.mergesort;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import edu.iiitb.basicjunit.BasicJunit;
import edu.iiitb.basicjunit.RegressionTest;
import edu.iiitb.basicjunit.StandAloneSuiteTest;
import edu.iiitb.mergesort.MergeSort;

/**
 * This tests the Merge sort.
 * Check git hub
 * 
 */
public class MergeSortJunitTest extends BasicJunit {

	private static int num = 0;

	/**
	 * This is a stand alone test case to sort a given set of input data.
	 * testing
	 */
	@Test
	@Category(StandAloneSuiteTest.class)
	public void testMergeSort() {
		String testCase = new String("MergeSort.");
		MergeSort mergeSort = new MergeSort(getIntValues(testCase + "values"));
		System.out.println(mergeSort.getDataString());
		mergeSort.sort();
		System.out.println(mergeSort.getDataString());
		Assert.assertArrayEquals(getIntValues(testCase + "expectedoutput"),
				mergeSort.getData());

	}

	/**
	 * This is a regression test case unit. It tests the sorting of various sets
	 * of data.
	 */
	@Test
	@Category(RegressionTest.class)
	public void regressionTestMergeSort() {
		num++;
		String testCase = new String("regressionTestMergeSort.");
		System.out.println("Test case :" + num);
		MergeSort mergeSort = new MergeSort(getIntValues(testCase + "values"
				+ num));
		System.out.println(mergeSort.getDataString());
		mergeSort.sort();

		System.out.println(mergeSort.getDataString());
		Assert.assertArrayEquals(
				getIntValues(testCase + "expectedoutput" + num),
				mergeSort.getData());

	}
}
