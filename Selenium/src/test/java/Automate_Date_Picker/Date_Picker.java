package Automate_Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//14-Jan-2024
		String expectedDay = "20";
		String expectedMonth = "January";
		String expectedYear = "2026";
		
		
		
		//Launch Chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize page
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://jqueryui.com/datepicker/");
		
		//Switch to iframe
		driver.switchTo().frame(0);
		
		//Find date picker webelement to perform click action
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		while(true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(calenderMonth.equals(expectedMonth)&& calenderYear.equals(expectedYear)) {
				List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement e:dayList) {
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				
				break;
				
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
	}


}
