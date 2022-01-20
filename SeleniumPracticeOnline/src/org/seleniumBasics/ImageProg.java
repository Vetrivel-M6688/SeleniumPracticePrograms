package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageProg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();

		driver.navigate().back();

		WebElement brokenImg = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		// naturalHeight/naturalWidth attribute given here by finding it on CSS properties page, If img is not broken then it has 
		//some values.
		if (brokenImg.getAttribute("naturalHeight").equals("0")) {
			System.out.println("It is a Broken Image!!!");
		} else {
			System.out.println("It is not a broken Image!!!");
		}
		
		driver.quit();
	}

}
