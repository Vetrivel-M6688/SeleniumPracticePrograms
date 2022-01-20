package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyUnderline {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		WebElement youtubeLive = driver.findElement(By.xpath("//a[contains(text(),'Interactive experience')]"));

		String beforeHover = youtubeLive.getCssValue("text-decoration");
		System.out.println("Before Hovering: " + beforeHover);

		Actions actions = new Actions(driver);
		actions.moveToElement(youtubeLive).build().perform();

		String afterHover = youtubeLive.getCssValue("text-decoration");
		System.out.println("After Hovering : " + afterHover);

		if (afterHover.equals(youtubeLive.getCssValue("text-decoration"))) {
			System.out.println("Text is Underlined");
		}
		driver.close();
	}

}
