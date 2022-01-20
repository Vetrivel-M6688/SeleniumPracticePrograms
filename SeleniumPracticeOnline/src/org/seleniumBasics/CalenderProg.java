package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderProg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calenderBox = driver.findElement(By.id("datepicker"));
		calenderBox.click();
		
		WebElement nextBtn = driver.findElement(By.xpath("//a[@title='Next']"));
		nextBtn.click();
		
		WebElement dateSelect = driver.findElement(By.xpath("//a[contains(text(), 10)]"));
		dateSelect.click();
		
		driver.close();
	}

}
