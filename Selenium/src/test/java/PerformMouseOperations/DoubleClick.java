package PerformMouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://demoqa.com/buttons");
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform(); //Double click
	}

}
