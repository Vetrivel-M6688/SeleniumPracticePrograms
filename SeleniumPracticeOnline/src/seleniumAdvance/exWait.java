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

		exWait ex = new exWait();
		ex.disappearText();
		//ex.appearText();
		ex.waitForAlert();

	}
	WebDriver driver;
	public void disappearText() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");

		WebDriverWait hold = new WebDriverWait(driver, Duration.ofSeconds(20));
		hold.until(ExpectedConditions.invisibilityOfElementWithText(By.id("btn"),
				"I'm going to disappear. Keep looking at me!!"));

		WebElement postText = driver.findElement(By.xpath("//*[contains(text(),'I know you can do it!')]"));
		System.out.println(postText.getText());

		driver.quit();
	}
	public void appearText() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");

		WebElement present = driver.findElement(By.id("btn"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(present, "Voila! I'm here Guys"));
		
		System.out.println(present.getText());
		driver.quit();
	}
	public void waitForAlert() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/alertappear.html");
		WebElement clickBtn = driver.findElement(By.id("alert"));
		clickBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al = driver.switchTo().alert();
		al.accept();
	}

}
