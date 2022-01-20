package seleniumAdvance;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGetandNavigate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("window.location='https://www.google.co.in'");
	}

}
