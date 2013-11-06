package edu.iiitb.test.mergesort;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import edu.iiitb.basicjunit.RegressionTest;
import edu.iiitb.basicjunit.StandAloneSuiteTest;

/**
 * Test Suite used to test the regression test cases only. This test suite runs
 * with {@link org.junit.experimental.categories.Categories} instead of the
 * default {@link org.junit.runners.Suite}. The categories allow to specify
 * which kind of test cases are to be tested as part of this suite of test
 * cases.
 * 
 */
@RunWith(Categories.class)
@SuiteClasses(MergeSortJunitTest.class)
@ExcludeCategory(StandAloneSuiteTest.class)
public class MergeSortRegressionTestSuite {

}
