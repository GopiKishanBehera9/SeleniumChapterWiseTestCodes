package CountHyperLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Launch web page https://www.calculator.net/
		driver.get("https://www.calculator.net/");
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on Webpage: " + linkElements.size());
		
		for(WebElement el:linkElements) {
			System.out.println(el.getText());
		}
		driver.close();
	}

}
