package seleniumAdvance;

import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement searchTerm = driver.findElement(By.name("q"));
		searchTerm.sendKeys("Angry Man 12 \n");

		// 1. Printing all the main links
		/*
		 * List<WebElement> linkElements = driver
		 * .findElements(By.xpath("//*[@id='rso']//following::h3//following::div/cite"))
		 * ; for (WebElement links : linkElements) {
		 * System.out.println(links.getText()); }
		 */

		// 2. Printing all the links present in the page

		/*
		 * List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]")); for
		 * (WebElement totLinks : allLinks) { System.out.println(totLinks.getText()); }
		 */

		// 3. Printing all the HREF links
		List<WebElement> aLinks = driver.findElements(By.xpath("//a"));
		for (WebElement hrefLinks : aLinks) {
			System.out.println(hrefLinks.getAttribute("href"));
		}
		driver.close();

	}

}
