package org.seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/home.html");

		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a")).click();

		//1. Selecting the fav option
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();

		//2. Confirming the check box weather it is selected or not
		boolean status = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[6]")).isSelected();
		System.out.println(status);

		//3. De-selecting the checked box
		WebElement notSelected = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[7]"));
		boolean firstBox = notSelected.isSelected();
		System.out.println(firstBox);
		if(firstBox==true)
		{
			notSelected.click();
		}


		WebElement selected = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]"));
		if(selected.isSelected())
		{
			selected.click();
		}

		//4. Selecting Multiple check boxes at single time 
		List<WebElement> MultiCheckBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int totSize = MultiCheckBoxes.size();

		for(int i=9; i<totSize; i++)
		{
			MultiCheckBoxes.get(i).click();
		}
		
		driver.quit();
	}

}
