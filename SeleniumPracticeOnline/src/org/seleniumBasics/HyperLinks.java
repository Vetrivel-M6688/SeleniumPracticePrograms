package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement homePage = driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();
		
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String where = whereToGo.getAttribute("href");
		System.out.println("Link Goes to: "+where);
		
		WebElement verifyLink = driver.findElement(By.linkText("Verify am I broken?"));
		verifyLink.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("It is a Broken Link");
		}
		
		driver.navigate().back();
		
		WebElement homePageAgain = driver.findElement(By.linkText("Go to Home Page"));
		homePageAgain.click();
		
		driver.navigate().back();
		
		List<WebElement> noOfLinks =  driver.findElements(By.tagName("a"));
		int linksCount = noOfLinks.size();
		System.out.println("No of links in this page :"+linksCount);
		driver.quit();
		
	}

}