package FileUpload_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_WithAutoIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.file.io/");
		
		//Find choose file web element
		WebElement button = driver.findElement(By.xpath("//label[@class='css-zpjtsm e12cce780']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\beher\\OneDrive\\Desktop\\AutoItFolderScript\\UploadFile.exe"+" "+"D:\\TestData.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
