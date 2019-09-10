package Zoopla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortPrices {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
             
		driver.get("https://www.zoopla.co.uk");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-input-location")).sendKeys("London");
		Thread.sleep(2000);
		driver.findElement(By.id("search-input-location")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search-submit")).click();
		
		Thread.sleep(5000);
		List <WebElement> price = driver.findElements(By.xpath("//div[@class='listing-results-right clearfix']/a[1]"));
		List <Integer> priceText = new ArrayList<Integer>();
		for(WebElement E: price)
		{
			String s = E.getText();
			String s1 = s.replaceAll("[^0-9]", "");
			//System.out.println(s1);
			Integer priceVal= Integer.valueOf(s1);
		   priceText.add(priceVal);
		
		
		}
		
		//Collections.sort(priceText);
		Collections.sort(priceText, Collections.reverseOrder());
		Iterator<Integer> itr = priceText.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());

	}

}
