package CountRadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//OpenURL
		//driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		driver.get("https://www.calculator.net/");
		
		//Find radio button on webpage
		List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total no. of radio button on web page: " +radioButtonList.size());
		
		//close browser
		driver.close();
	}

}
