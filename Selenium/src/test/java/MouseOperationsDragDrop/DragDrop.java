package MouseOperationsDragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		//find source and target web element
		WebElement source = driver.findElement(By.id("box6")); //rome
		WebElement target = driver.findElement(By.id("box106")); //Italy
		
		Actions act = new Actions(driver);
		
		
		
		//dragAndDrop(SourceElement, targetElement)
		act.dragAndDrop(source, target).perform();
		
	}

}
