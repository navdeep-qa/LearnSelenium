package LearnJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://oca-mel-test:8300/login.aspx");
  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bpo.admin@yopmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dell@123");
        driver.findElement(By.xpath("//a[@class='btn btn-block btn-login']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//a[text()='Easy Print Manager']")).click();


	}

}
