package edgetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edge {

	public static void main(String[] args) {

		//String projectPath = System.getProperty("user.dir");

		//System.out.println(projectPath);

		try {


			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usama Butt\\eclipse-workspace\\SeleniunFrameWorkdrivers\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.com");
		}
		catch (Exception exp) {

			System.out.println("now there will be no error");
			System.out.println("Message is:" +exp.getMessage());
			System.out.println("cause is :" +exp.getMessage());
			exp.printStackTrace();


		}
	}
}
