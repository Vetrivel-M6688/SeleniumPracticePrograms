package seleniumAdvance;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWays {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//Type 1: Using window maximize
		//driver.manage().window().maximize();
		
		//Type 2: Using FullScreen 
		//driver.manage().window().fullscreen();
		
		//Type 3: Using Dimensions
		Dimension dimension =  new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
		
		//Type 4: Using Chrome Options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver1 = new ChromeDriver(chromeOptions);
	}

}
