package CaputeScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//OpenURL
//		driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://www.hugedomains.com/domain_profile.cfm?d=uitestpractice.com");
		
		
		//capture full page screenshot
		//step-1: convert webdriver object to TakesScreenshot interface
		//TakesScreenshot screenshot = ((TakesScreenshot)driver); //Full page
		//WebElement section = driver.findElement(By.xpath("//div[@class='ss-block-inner-new']")); //crope Action
		WebElement section = driver.findElement(By.xpath("//button[@class='search-btn']")); //Buttons
		
		
		//Step2: Call getScreenshotAs method to create image file
		File src = section.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\Screenshot\\Buttonss.png");
		
		//step3: Copy image file to destination
		FileUtils.copyFile(src, dest);
	}

}
