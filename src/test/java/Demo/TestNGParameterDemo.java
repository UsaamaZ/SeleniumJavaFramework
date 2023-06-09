package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
	
	
	@Test
	@Parameters({"My Project"})
	public void test(@Optional("usama") String  name) {
		
		System.out.println("My project is :" +name);
	}

}
