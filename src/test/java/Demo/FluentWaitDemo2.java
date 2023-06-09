package Demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo2 {
    public static void main(String[] args) {
        Test();
    }

    public static void Test() {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\Usama Butt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\GeckoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("ABCD");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        FluentWait<WebDriver> wait = null;
		wait.until(ExpectedConditions.titleIs("ABCD - Google Search"));

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement linkElement = driver.findElement(By.linkText("ABCD Institute | DePaul University, Chicago"));

                if (linkElement.isEnabled()) {
                    System.out.println("Element Found");
                }
                return linkElement;
            }
        });

        element.click();
    }
}
