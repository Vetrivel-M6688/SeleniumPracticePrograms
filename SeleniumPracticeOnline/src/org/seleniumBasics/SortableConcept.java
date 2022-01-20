package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		int elementSize = elements.size();
		System.out.println(elementSize);

		Actions action = new Actions(driver);
		// action.dragAndDrop(fromItem7, toItem1).build().perform();
		WebElement toItem1 = null;
		WebElement fromItem7 = null;
		for (int i = 0; i <= elementSize - 1; i++) {
			fromItem7 = elements.get(i);
			for (int j = elementSize - 1; j >= 0; j--) {
				toItem1 = elements.get(j);
			}
			action.dragAndDrop(fromItem7, toItem1).build().perform();
		}

		Thread.sleep(3000);
		WebElement againItem1 = elements.get(6);
		WebElement againItemTo1Position = elements.get(0);
		action.dragAndDrop(againItemTo1Position, againItem1).build().perform();

	}

}
