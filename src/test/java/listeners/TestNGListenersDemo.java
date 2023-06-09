package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersDemo {

	@Test
	public void test1() {

		System.out.println("Inside Test one");

	}

	@Test
	public void test2() {

		System.out.println("Inside Test two");

		System.setProperty("Webdriver.chromedriver.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Vague Codm");
		driver.findElement(By.name("q")).sendKeys("djskdhka");
	}
	@Test
	public void test3() {

		System.out.println("Inside Test three");
		throw new SkipException("This is Test Skipped");

	}

}
