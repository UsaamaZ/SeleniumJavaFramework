package congif;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.testng.TestNG;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");


	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {
		try {

			InputStream input = new FileInputStream(projectPath+ "/src/test/java/congif/config.Properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Testing.TestNG.browserName=browser;
		} 
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}
	static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectPath+ "/src/test/java/congif/config.Properties");
			prop.setProperty("result", "Pass");
			prop.store(output, null);
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}	
}