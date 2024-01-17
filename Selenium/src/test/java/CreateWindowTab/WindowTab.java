package CreateWindowTab;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://www.google.com/");
		System.out.println("First page: " + driver.getTitle());
		
		//Open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		System.out.println("Second tab: "+ driver.getTitle());
		
		//get Window handels of open windows
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0)); //switch to google
		System.out.println("First page " + driver.getTitle());
		
		driver.quit();
	}

}
