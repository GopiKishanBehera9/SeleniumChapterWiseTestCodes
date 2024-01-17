package HandlingOfDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement element = driver.findElement(By.id("Skills"));
		
		Select dropdown = new Select(element);
		
		dropdown.selectByVisibleText("CSS");
		
		if(dropdown.isMultiple()) {
			System.out.println("Drop down is multiple");
		}else {
			System.out.println("Drop Drown is not multiple");
		}
		
		List <WebElement> alldropdownoptions = dropdown.getOptions();
		
		System.out.println("Total option:" + alldropdownoptions.size());
		for(WebElement el:alldropdownoptions) {
			System.out.println(el.getText());
		}
		
		driver.close();
	}

}
