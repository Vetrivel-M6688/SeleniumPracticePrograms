package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("chennai");
		Thread.sleep(3000);
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		searchBtn.click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Port of Chennai | Port of Chennai")).click();
	}

}
