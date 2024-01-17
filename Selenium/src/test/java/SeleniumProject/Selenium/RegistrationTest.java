package SeleniumProject.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		//Getting Data from EXCEL Sheet
		FileInputStream file = new FileInputStream("D:\\Registration.xlsx");
		
		//Get the workbook instance for XLS File
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//Get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//Get First row from the sheet
		int noOfRows = sheet.getLastRowNum();
		
		System.out.println("No. of Records in the Excel Sheet: "+ noOfRows);
		
		for(int row = 1; row <= noOfRows; row++) {
			XSSFRow current_row = sheet.getRow(row);
			
			String First_Name = current_row.getCell(0).getStringCellValue();
			String Last_Name = current_row.getCell(1).getStringCellValue();
			String Phone = current_row.getCell(2).getStringCellValue();
			String Email = current_row.getCell(3).getStringCellValue();
			String Address = current_row.getCell(4).getStringCellValue();
			String City = current_row.getCell(5).getStringCellValue();
			String State = current_row.getCell(6).getStringCellValue();
			String PinCode = current_row.getCell(7).getStringCellValue();
			String Country = current_row.getCell(8).getStringCellValue();
			String UserName = current_row.getCell(9).getStringCellValue();
			String Password = current_row.getCell(10).getStringCellValue();
			
			//Registration Process
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Entering Contact Information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//Entering mailing information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("address2")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(PinCode);
			
			//Country selection
			Select dropcountry = new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			//Entering User Information
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//Submitting form
			driver.findElement(By.name("register")).click();
			
			if(driver.getPageSource().contains("Thank you for registering")) {
				System.out.println("Registration completed for "+ row + " record");
			}
			else {
				System.out.println("Registration Failed for "+ row + "record");
			}
		}
	}

}
