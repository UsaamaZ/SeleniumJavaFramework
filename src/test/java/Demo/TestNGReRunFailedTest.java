package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGReRunFailedTest {

	@Test
	public void test1() {

		System.out.println("Inside Test 1");
	}
	@Test
	public void test2() {

		System.out.println("Inside Test 2");
		//int i=1/0;
	}
	@Test(retryAnalyzer = Demo.RetryAutomation.class)
	public void test3() {

		System.out.println("Inside Test 3");
		Assert.assertTrue(0>1);
	}
}
