package org.seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");

		driver.findElement(By.xpath("(//a[@class=\"wp-categories-link maxheight\"])[9]")).click();

		// Clicking simple Alert
		driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();

		// Handling Simple Alert 
		Alert alrt = driver.switchTo().alert();
		alrt.accept();

		// Clicking Confirm Alert
		driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();

		// Handling Confirm Alert 
		alrt.dismiss();

		// Clicking Prompt alert box
		driver.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();

		// Handling Prompt Alert 
		alrt.sendKeys("Institute"); 
		alrt.accept();

		// File Up loader concept instead of handling windows file explorer
		/*
		 * driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.name("userfile")).sendKeys(
		 * "C:\\Users\\Welcome\\Documents\\PrepGuide.txt");
		 */
	}

}
