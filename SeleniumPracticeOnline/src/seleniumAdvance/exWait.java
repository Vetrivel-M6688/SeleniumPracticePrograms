package seleniumAdvance;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");
		
		WebDriverWait hold = new WebDriverWait(driver, Duration.ofSeconds(20));
		hold.until(ExpectedConditions.invisibilityOfElementWithText(By.id("btn"),
				"I'm going to disappear. Keep looking at me!!"));

		WebElement postText = driver.findElement(By.xpath("//*[contains(text(),'I know you can do it!')]"));
		System.out.println(postText.getText());

		driver.quit();
	}

}
