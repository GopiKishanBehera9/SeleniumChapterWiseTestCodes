package MouseOperationsDragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ebay.in/");
		
		WebElement element = driver.findElement(By.linkText("Payments & Fees"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform(); //moveToElement() for mouse over action
		
	}

}
