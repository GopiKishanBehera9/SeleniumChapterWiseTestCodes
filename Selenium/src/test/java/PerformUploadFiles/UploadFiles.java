package PerformUploadFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFiles {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//open URL
		driver.get("https://demoqa.com/upload-download");
		
		//Find webelement choose file
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("D:\\TEST.xlsx");
		
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("D:\\TEST.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
 	}

}
