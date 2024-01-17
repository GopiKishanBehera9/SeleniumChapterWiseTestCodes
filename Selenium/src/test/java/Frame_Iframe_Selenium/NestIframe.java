package Frame_Iframe_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1"); //parent frame/outer frame
		driver.switchTo().frame("frame3"); //child frame/inner frame
		
		//find Element checkbox
		driver.findElement(By.id("a")).click();
		
		//Switch to parent frame
		driver.switchTo().parentFrame();
		
		//Find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("This is Text msg");
		
		//Switch to default content/main page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		//find webelement animal dropdown
		WebElement dropDownElement = driver.findElement(By.id("animals"));
		Select dropDown = new Select(dropDownElement);
		dropDown.selectByVisibleText("Avatar");
	
	}

}
