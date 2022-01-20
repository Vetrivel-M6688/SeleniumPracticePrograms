package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");

		driver.findElement(By.xpath("(//a[@class=\"wp-categories-link maxheight\"])[5]")).click();

		// Select by Index value
		WebElement indexVal = driver.findElement(By.id("dropdown1"));
		Select byIndex = new Select(indexVal);
		Thread.sleep(3000);
		byIndex.selectByIndex(1);

		// Select by visible text
		WebElement textVal = driver.findElement(By.name("dropdown2"));
		Select byVisible = new Select(textVal);
		Thread.sleep(3000);
		byVisible.selectByVisibleText("UFT/QTP");

		// Select by value
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select byValue = new Select(value);
		Thread.sleep(3000);
		byValue.selectByValue("2");

		// Print the no.of elements in dropdown
		WebElement no_Options = driver.findElement(By.xpath("//select[@class=\"dropdown\"]"));
		Select options = new Select(no_Options);
		List<WebElement> elements = options.getOptions();
		int totalElements = elements.size();
		System.out.println(totalElements);
		Thread.sleep(3000);

		// Select by using sendKeys
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Loadrunner");

		// Selecting the options we want
		WebElement selectall = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select allOp = new Select(selectall);
		Thread.sleep(3000);
		allOp.selectByIndex(2);
		allOp.selectByIndex(1);
		allOp.selectByIndex(3);
		allOp.selectByIndex(4);

		// Counting total selected options
		List<WebElement> selectedOptions = allOp.getAllSelectedOptions();
		int no_ofSelected = selectedOptions.size();
		System.out.println(no_ofSelected);

	}

}
