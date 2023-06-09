package Demo;

import org.testng.annotations.Test;

public class TestNGGroupDemo {

	@Test(groups = {"sanity"})
	public void Test1() {

		System.out.println("This is Test 1");
	}
	@Test(groups= {"regression", " smoke"})
	public void Test2() {

		System.out.println("This is Test 2");
	}
	@Test(groups= {"sanity", "regression"})
	public void Test3() {

		System.out.println("This is Test 3");
	}
	@Test(groups= {"sanity","smoke"})
	public void Test4() {

		System.out.println("This is Test 4");
	}
}
