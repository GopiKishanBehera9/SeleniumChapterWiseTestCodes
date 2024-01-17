package ClickImageLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		//find web element image link open cart
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		
		//Verifiy title of the current page with expected
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
		
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//browser close
		driver.close();
		
		
	}

}
