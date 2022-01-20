package seleniumAdvance;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");

		WebElement button = driver.findElement(By.id("btn"));

		WebDriverWait hold = new WebDriverWait(driver, Duration.ofSeconds(20));
		Boolean conditions = hold.until(ExpectedConditions.textToBePresentInElementLocated(By.id("btn"), "Click ME!"));
		button.click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.quit();

	}

}
