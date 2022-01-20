package org.seleniumBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");

		driver.findElement(By.linkText("Download Excel")).click();

		Thread.sleep(4000);
		File myFile = new File("C:\\Users\\Welcome\\Downloads");
		File[] allFiles = myFile.listFiles();
		for (File file : allFiles) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("I found my file got downloaded");
			}
		}

		driver.quit();
	}

}
