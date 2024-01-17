package Frame_Iframe_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Iframe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Maximise browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//driver.switchTo().frame("iframeResult");
		
		//driver.switchTo().frame(1);
		
		//find total iframes
		int Noiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total iframes: " + Noiframes);
		
		WebElement iframe = driver.findElement(By.xpath("//iFrame[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Alpha");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
