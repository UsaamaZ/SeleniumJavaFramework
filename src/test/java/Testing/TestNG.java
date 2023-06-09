package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import congif.PropertiesFile;

public class TestNG {

	WebDriver driver = null;
	public static String browserName=null;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void setUp() {
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chromedriver.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.gecko.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\GeckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}


		htmlReporter = new ExtentSparkReporter("extent.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Test
	public void test() {

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		driver.get("https://google.com");
		test.pass("Navigated to google.com");

		test.log(Status.INFO, "This step shows usage of log(status, details)");

		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

		driver.findElement(By.name("q")).sendKeys("dont lose hope, and try hard for your future");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@AfterSuite
	public void tearDown() {


		//driver.close();
		//driver.quit();

		extent.flush();


	}
}
