package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {

	public static final String USERNAME = "oauth-usamahalo117-ba642";
	public static final String ACCESS_KEY = "9dc64741-ac08-47ca-8e34-1e1be754cd0e";
	public static final String URL = "https://" +USERNAME + ":" + ACCESS_KEY +"@ondemand.saucelabs.com";

	public static void main(String[] args) throws Exception {


		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		
		
//		DesiredCapabilities caps = DesiredCapabilities.chrome();
//		caps.setCapability("platform", "Windows 10");
//		caps.setCapability("version", "latest");
//		caps.setCapability("build", "US" );
//		caps.setCapability("name", "Purpose");
		
		options.setCapability("platform", "Windows 10");
		options.setCapability("version", "latest");
		options.setCapability("build", "US");
		options.setCapability("name", "Purpose");

		
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), options);

		driver  = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usama Butt\\git\\SeleniumJavaFramework\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
		driver.get("http:google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());

		driver.quit();
		System.out.println("Test Completed");
	}
}