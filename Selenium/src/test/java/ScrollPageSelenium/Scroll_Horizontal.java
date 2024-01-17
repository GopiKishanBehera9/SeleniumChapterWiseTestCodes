package ScrollPageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Horizontal {

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
		
		//WebElement element = driver.findElement(By.id("a7"));
		//js.executeScript("arguments[0].scrollIntoView();",element);)
	}

}
