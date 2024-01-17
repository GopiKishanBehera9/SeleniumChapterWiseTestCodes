package HandleAlertPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		//Find alert button and perform click action
	//	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//Here OK  /   Cancel
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		
		//switch to alert window and accept the alert
		//driver.switchTo().alert().sendKeys("Swapna");
		driver.switchTo().alert().accept();//  Ok button is clicked
		 
	}

}
