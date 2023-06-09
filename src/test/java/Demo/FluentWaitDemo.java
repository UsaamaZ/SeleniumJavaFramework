package Demo;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
	public static void main(String[] args) throws Exception{ 
		Test();
	}

	public static void Test() throws Exception {

		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Usama Butt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		//driver.findElement(By.linkText("CODM Top Up | Buy CODM Garena Shells")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement = driver.findElement(By.linkText("ABCD Institute | DePaul University, Chicago"));

				if (linkElement.isEnabled()){ 
					System.out.println("Element Found");
				}
				return linkElement;
			}
		});

		element.click();


		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}


}
