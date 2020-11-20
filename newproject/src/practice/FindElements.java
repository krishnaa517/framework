package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx");
		driver.manage().window().maximize();
		
		
		//Identify location
		WebElement EmployeeType=driver.findElement(By.id("ddlIncome"));
		
		//Identify Group options under element
		List<WebElement> AllOptions=EmployeeType.findElements(By.tagName("option"));
		
		//Single option to Select usng index number
		AllOptions.get(1).click();
		Thread.sleep(4000);
		
		//Iterate for number of options
		for (int i = 0; i < AllOptions.size(); i++) 
		{
			
			
			FileInputStream fi=new FileInputStream("E:\\04-09-2018\\newproject\\Testdata\\InputData.xlsx");
			System.out.println("File located");
			
			//Target workbook
			XSSFWorkbook book=new XSSFWorkbook(fi);
			//Target sheet of above workbook
			XSSFSheet sht=book.getSheet("config");
			
			//Create row
			sht.getRow(2).createCell(0).setCellValue(AllOptions.get(i));
			
			//select Each option under Dropdown
			WebElement Eachoption=AllOptions.get(i);
			Eachoption.click();
			
			Thread.sleep(4000);
			
			
		}
		

	}

}
