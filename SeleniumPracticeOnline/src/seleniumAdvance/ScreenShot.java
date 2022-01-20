package seleniumAdvance;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");

		//Type: 1  (Type 2: we can use Robot class to take full size screenshot)
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File imageFile = screenShot.getScreenshotAs(OutputType.FILE);
		File folderName = new File("C:\\Users\\Welcome\\Pictures\\img.png");

		// Using "FileHandler" we don't need to add Common IO jar to our project
		FileHandler.copy(imageFile, folderName);

		// Using "FileUtills" also we can take screenshot but jar must be configured/added to our project

		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	
		// Takesscreenshot will not work before we handle Alert in a page, throws "UnHandledAlertException"

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		
	}

}
