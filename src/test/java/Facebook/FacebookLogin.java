package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chromedriver.driver", "C:\\Users\\UsamaButt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("3224063447");
		driver.findElement(By.name("login")).sendKeys(Keys.RETURN);
	}

}
