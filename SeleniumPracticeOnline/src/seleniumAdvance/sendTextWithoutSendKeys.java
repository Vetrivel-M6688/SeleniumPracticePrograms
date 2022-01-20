package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendTextWithoutSendKeys {

	static WebDriver driver;
	static JavascriptExecutor executor;

	public static void main(String[] args) {

		sendTextWithoutSendKeys object = new sendTextWithoutSendKeys();
		// object.jsExecutor1();
		// object.jsExecutor2();
	}

	public void driverMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		executor = (JavascriptExecutor) driver;
	}

	public void jsExecutor1() {
		driverMethod();
		executor.executeScript("document.getElementsByName('q')[0].value='Chennai'", "");
	}

	public void jsExecutor2() {
		driverMethod();
		WebElement searchBox = driver.findElement(By.name("q"));
		executor.executeScript("arguments[0].value='Chennai'", searchBox);
	}

}
