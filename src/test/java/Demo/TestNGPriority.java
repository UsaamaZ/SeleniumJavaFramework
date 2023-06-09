package Demo;

import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority = 1000)
	public void test1() {
		System.out.println("Rehan number 1");


	}
	@Test(priority = 77)
	public void test2() {
		System.out.println("Rehan number 2");


	}

	@Test (priority = 64)
	public void test3() {

		System.out.println("Rehan number 3");

	}
}

