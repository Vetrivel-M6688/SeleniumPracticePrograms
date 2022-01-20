package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//h5[text()='Radio Button']//parent::a")).click();
		
		//1. Answering the 1st question by selecting yes
		driver.findElement(By.id("yes")).click();
		
		//2. Checking the radio button selected or not
		WebElement checked = driver.findElement(By.xpath("(//input[@type=\"radio\" and @name=\"news\"])[1]"));
		System.out.println(checked.isSelected());
		
		WebElement unChecked = driver.findElement(By.xpath("(//input[@type=\"radio\" and @name=\"news\"])[2]"));
		System.out.println(unChecked.isSelected());
		
		//3. Selecting the unselected radio button
		driver.findElement(By.xpath("//input[@name=\"age\" and @value=\"0\"]")).click();
		driver.quit();
	}

}
