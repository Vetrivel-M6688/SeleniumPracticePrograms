package seleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		//Type 1: We can Handle this type of pop-up by using 3rd party apps like Sikuli and AutoIt.
		//Type 2: we are using http://userName:Password@RL.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	}

}
