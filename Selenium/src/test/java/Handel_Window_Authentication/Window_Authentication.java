package Handel_Window_Authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
