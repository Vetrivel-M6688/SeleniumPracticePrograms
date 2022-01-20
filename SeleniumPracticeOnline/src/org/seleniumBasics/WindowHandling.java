package org.seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		// get the Parent window for the later use
		String parentWindow = driver.getWindowHandle();//to check what the parent window value is
		System.out.println(parentWindow);
		driver.findElement(By.id("home")).click();

		// switch control to child window and click edit button
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindow : allWindows) {
			driver.switchTo().window(childWindow);
		}
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5")).click();
		driver.close();

		// back to parent window
		driver.switchTo().window(parentWindow);

		WebElement multiWin = driver.findElement(By.xpath("//button[text()=\"Open Multiple Windows\"]"));
		multiWin.click();
		Set<String> totalWindows = driver.getWindowHandles();

		// counting the no of windows opened and close the child windows only
		int noOfWins = driver.getWindowHandles().size();
		System.out.println("Total No.Of Windows opened: " + noOfWins);

		for (String smallWin : totalWindows) {
			if (!smallWin.equals(parentWindow)) {
				driver.switchTo().window(smallWin);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("color")).click();

		// opening multiple windows and close them all except parent window

		Set<String> moreWindow = driver.getWindowHandles();
		for (String handles : moreWindow) {
			if (!handles.equals(parentWindow)) {
				driver.switchTo().window(handles);
				driver.close();
			}
		}
	}

}
