package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableProg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int listSize = list.size();
		System.out.println(listSize);
		Actions action = new Actions(driver);

		// Selecting first 3 elements
		for(int i=0; i<3; i++)
		{
			action.clickAndHold(list.get(i)).build().perform();
		}
		action.release().build().perform();

		driver.quit();
	}

}
