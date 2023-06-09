package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebDemo {
	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.firefox.driver", projectPath+"drivers\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("falakash.netlify.com");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("//a/h3")));
		
		driver.findElement(By.name("ABCD")).click();
		driver.close();
	}

}
