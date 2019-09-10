package BrowserLaunchPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Firefox Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://oca-mel-test:8300");

	}

}
