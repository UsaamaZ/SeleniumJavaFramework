package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Google {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {

		System.setProperty("Webdriver.chromedriver.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {

		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys("dont lose hope, and try hard for your future");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@AfterTest
	public void tearDown() {

		//driver.close();
		//driver.quit();
	}
}
