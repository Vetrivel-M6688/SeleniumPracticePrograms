package org.seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetryWin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		String parenWin = driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Set<String> childWin = driver.getWindowHandles();
		for (String windows : childWin) {
			driver.switchTo().window(windows);
		}
		String text = driver.findElement(By.xpath("//h2[text()=\"Selenium Level Sponsors\"]")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().window(parenWin);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	}

}
