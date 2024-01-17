package JSExecutorSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutor_FlashElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3B_ylt%3DAwrKA45mUqFlqjcWth.7HAx.%3B_ylu%3DY29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Ny");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//WebElement NEXT Button
		WebElement element = driver.findElement(By.xpath("//input[@value='Next']"));
		
		//Flash webelement
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i < 100; i++) {
			js.executeScript("arguments[0].style.backgroundColor = '#000000'",element);
			try {
				Thread.sleep(20); //20ms
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			js.executeScript("arguments[0].style.backgroundColor = '"+ bgcolor+"'",element);
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
