package HandleAlertPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAlert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		//find Prompt button
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		//alert type name and accept
		driver.switchTo().alert().sendKeys("Swapna");
		driver.switchTo().alert().accept();
		
	}

}
