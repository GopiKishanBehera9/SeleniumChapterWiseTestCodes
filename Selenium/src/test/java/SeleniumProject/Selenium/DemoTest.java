package SeleniumProject.Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("D:\\TEST.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow currentrow = sheet.getRow(i);	//focussed on current row
			
			for(int j=0;j<colcount;j++) {
				String value = currentrow.getCell(j).toString();
				System.out.println(" " +value);
			}
			System.out.println();
		}
	}

}
