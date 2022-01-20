package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//1. Switch to 1st frame
		driver.switchTo().frame(0);
		WebElement click1Btn = driver.findElement(By.id("Click"));
		click1Btn.click();
		String text = click1Btn.getText();
		System.out.println(text);
		
		// Back to default content/ original html page
		driver.switchTo().defaultContent();
		
		//Switch to frame 1
		driver.switchTo().frame(1);
		//2. Switch to frame 2 which is inside the frame 1
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
		//back to default content page
		driver.switchTo().defaultContent();
		
		//3.Find out the no.of Frames
		List<WebElement> totFrames = driver.findElements(By.tagName("iframe"));
		int noOfFrames = totFrames.size();
		System.out.println(noOfFrames);
		
		driver.quit();
		
	}

}
