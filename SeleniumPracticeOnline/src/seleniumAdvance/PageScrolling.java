package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrolling {
	
	static WebDriver driver;
	static JavascriptExecutor executor;

	public static void main(String[] args) throws InterruptedException {

		PageScrolling scroll = new PageScrolling();
		// scroll.scrollPosition();
		// scroll.scrollToBottom();
		scroll.scrollToElement();
	}

	public void driverMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		executor = (JavascriptExecutor) driver;
	}

	public void scrollPosition() throws InterruptedException {
		driverMethod();
		executor.executeScript("window.scrollBy(0,3050)", "");
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,-3050)", "");
	}

	public void scrollToBottom() throws InterruptedException {
		driverMethod();
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		Thread.sleep(2000);
		executor.executeScript("window.scrollTo(0,0)", "");
	}

	public void scrollToElement() throws InterruptedException {
		driverMethod();
		WebElement android = driver.findElement(By.xpath("(//a[@href='android-tutorial'])[2]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", android);
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,0)", "");
	}

}
