package seleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFindElementMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		// activeElement method works only, if the the cursor activated by default when we launch browser 
		driver.switchTo().activeElement().sendKeys("Chennai");
		driver.close();
	}

}
