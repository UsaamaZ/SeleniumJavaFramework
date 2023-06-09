package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usama Butt\\eclipse-workspace\\SeleniunFrameWork\\drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.filemail.com/share/upload-file");
	driver.findElement(By.name("Add Files")).click();
	
	Runtime.getRuntime().exec("D:\\fileuploadscript.exe");
	
	Thread.sleep(3000);
	}

}
