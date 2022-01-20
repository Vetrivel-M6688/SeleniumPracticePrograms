package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleSuggetionList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Game of Thrones");

		Thread.sleep(2000);
		int position = 0;
		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for (WebElement elements : suggestionList) {
			// 1. by taking search term to click the suggestion option from the list
			/*
			 * String text = elements.getText(); if(text.contains("season 1")) {
			 * elements.click(); break; }
			 */

			// 2. by taking position of the element in the list
			position++;
			if (position == 3) {
				elements.click();
				break;
			}
		}
	}

}
