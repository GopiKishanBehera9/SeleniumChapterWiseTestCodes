package HandleWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("D:\\WebTable2.html");
		
		//Find second cell in Web table and print second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		//Find total rows in Webtable
		List<WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Rows: " + rowList.size());
		
		//Find total columns in Webtable
		List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Columns: "+columnList.size());
		
		for(int r = 2; r<=rowList.size();r++) {
			for(int c=1;c<=columnList.size();c++) {
				String data = driver.findElement(By.xpath("//table/tbody/tr[" +r +"]/td[" + c + "]")).getText();
				System.out.println(data);
			}
		}
	}

}
