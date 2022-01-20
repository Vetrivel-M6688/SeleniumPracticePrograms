package org.xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]//parent::div[@class=\"col-md-4 col-sm-6\"]//input[@placeholder=\"First Name\"]")).sendKeys("Vetrivel");
		
	}

}
