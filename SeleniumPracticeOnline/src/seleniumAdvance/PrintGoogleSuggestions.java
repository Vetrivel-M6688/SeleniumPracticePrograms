package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Game of Thrones");
		Thread.sleep(3000);
		
		List<WebElement> suggetionList = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for (WebElement element : suggetionList) {
			System.out.println(element.getText());
		}
		
		driver.close();
	}

}
