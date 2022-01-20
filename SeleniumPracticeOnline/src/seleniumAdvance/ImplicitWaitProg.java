package seleniumAdvance;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitProg {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.phptravels.net/");
		
		WebElement userName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
		password.sendKeys("demoagent");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")));
		
		loginBtn.click();
	}
	

}
