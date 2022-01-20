package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class EnterKeyWays {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//1. Using key enum within the sendKeys method
		//searchBox.sendKeys("Chennai"+Keys.ENTER);
		
		//2. Using submit method
		/*
		 * searchBox.sendKeys("Chennai"); 
		 * searchBox.submit();
		 */		
		//3. Using "\n"
		searchBox.sendKeys("Chennai \n");
		
		//4. Using ROBOT class also we can enter the search term
		driver.close();
		
	}

}
