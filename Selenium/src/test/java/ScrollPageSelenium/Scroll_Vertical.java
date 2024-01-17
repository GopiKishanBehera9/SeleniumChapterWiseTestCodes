package ScrollPageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Vertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.calculator.net/");
		
		//Initialize JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scroll Vertically down by 500 pixels
		//js.executeScript("window.scrollBy(0,500)");
		
	
	}

}
