package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		// Click the "Button" button
		driver.findElement(By.xpath("(//a[@class=\"wp-categories-link maxheight\"])[2]")).click();

		// 1.Finding X,Y coordinations
		WebElement BtnPos = driver.findElement(By.id("position"));
		Point xyLocation = BtnPos.getLocation();
		int xValue = xyLocation.getX();
		int yValue = xyLocation.getY();
		System.out.println("X value :" + xValue + " Y value :" + yValue);

		// 2.Finding the color
		String Color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Background color :" + Color);

		// 3.Finding Size of the button
		Dimension boxSize = driver.findElement(By.id("size")).getSize();
		int boxHeight = boxSize.getHeight();
		int boxWidth = boxSize.getWidth();
		System.out.println(boxHeight);
		System.out.println(boxWidth);

		// 4.back to Homepage
		driver.findElement(By.id("home")).click();

		// 5.Checking we are at the homepage
		String textElement = driver.findElement(By.xpath("//h1[@itemprop=\"name\"]")).getText();
		if (textElement.startsWith("Locators")) {
			System.out.println("we are at the Homepage");
		} else {
			System.out.println("this is not our home page");
		}

	}

}
