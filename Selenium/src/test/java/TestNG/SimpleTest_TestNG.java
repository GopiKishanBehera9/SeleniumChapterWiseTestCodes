package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SimpleTest_TestNG {

	@Test
	public void verifyPageTitle() {
		//Launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}

}
