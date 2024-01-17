package SeleniumSeries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch Chrome Web Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Launch Google webpage
		driver.get("http://google.com/");
		
		//Capture title of WebPage and print
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		
		//Capture url of the webpage
		System.out.println("URL : " + driver.getCurrentUrl());
		
		//Capture Page Source
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
