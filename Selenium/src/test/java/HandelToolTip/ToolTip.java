package HandelToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Maximise Browser
		driver.manage().window().maximize();
		
		//OPEN URL
		driver.get("https://practicetestautomation.com/");
		
		//Find Web Element age input box
		String actualTooltip = driver.findElement(By.xpath("//input[@id='form_email_7']")).getAttribute("title");
		
		String expectedTooltip = "Email Address";
		
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
	}

}
