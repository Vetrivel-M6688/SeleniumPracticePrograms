package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWays {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Type :1 Get Current URL Method
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("vetri");
		//driver.get(driver.getCurrentUrl());
		
		//Type :2 Using Refresh command
		/*driver.navigate().refresh(); */
		
		//Type :3 JavaScript Executor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("history.go(0)");//location.reload()
		
		//Type :4 Using Robot class as well to refresh the page
		
	}

}
