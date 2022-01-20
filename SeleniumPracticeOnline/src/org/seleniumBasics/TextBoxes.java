package org.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		

		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();

		// 1. Entering mail
		driver.findElement(By.id("email")).sendKeys("user@gmail.com");

		// 2. Append the text with existing text
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("text");

		// 3. Get the entered text in the box
		WebElement getTextBox = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]"));
		String defaultText = getTextBox.getAttribute("value");
		System.out.println(defaultText);

		// 4. Clear the text exist in the box
		driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]")).clear();

		// 5. Check the box Disbled or not
		boolean result = driver.findElement(By.xpath("//input[@disabled=\"true\"]")).isEnabled();
		System.out.println(result);
	}

}
