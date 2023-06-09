package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultiBrowserDemo {

	WebDriver driver=null;
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName) {
		
		System.out.println("Browser name is : " +BrowserName);
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("Webdriver.chromedriver.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("FireFox")) {
			
			System.setProperty("Webdriver.gecko.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\GeckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("MicroSoftEdge"));
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\MicroSoftEdgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	@Test
	public void Test() throws Exception {
		driver.get("http://google.com");  
		Thread.sleep(4000);

	}

	@AfterTest
	public void teardown() {
		
		driver.close();

		System.out.println("Test Completed");

	}
}
