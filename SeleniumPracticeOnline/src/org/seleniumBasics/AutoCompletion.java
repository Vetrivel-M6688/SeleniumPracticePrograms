package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		driver.findElement(By.id("tags")).sendKeys("s");
		
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		for (WebElement webElement : elements) {
			String elementText = webElement.getText();
			if(elementText.equals("Rest API"))
			{
				webElement.click();
				break;
			}
			
		}
	}

}
