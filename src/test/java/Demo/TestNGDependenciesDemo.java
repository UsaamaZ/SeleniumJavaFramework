package Demo;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {

	@Test(dependsOnGroups = {"sanity1.* "})
	public void test1() {
		
		System.out.println("im in test 1");
	}
	
	@Test(groups= {"sanity1"})
	public void test2() {
		
		System.out.println("im in test 2");
	}
	
	@Test (groups = {"sanity2"})
	public void test3() {
		
	System.out.println("im in test 3");
	}
}
