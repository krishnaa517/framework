package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Testcase {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Target file location
		
		FileInputStream fi= new FileInputStream("E:\\04-09-2018\\newproject\\Testdata\\InputData.xlsx");
		System.out.println("File Located");
		//Target work book
		XSSFWorkbook book =new XSSFWorkbook(fi);
		
		//Target sheet of workbook
		XSSFSheet sht= book.getSheet("Login");
		//Target Row
		XSSFRow row=sht.getRow(1);
		//Get cell data
		String url=row.getCell(1).getStringCellValue();
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		
		//Click on Signing button
		String Sign_in=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Sign_in)).click();
		//Email locator
		String Email_locator=row.getCell(3).getStringCellValue();
		driver.findElement(By.xpath(Email_locator)).clear();
		String Email_id=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Email_locator)).sendKeys(Email_id);
		
		// Get Next Button
		String Next_button = row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Next_button)).click();
		
		//password path
		String password_path=row.getCell(6).getStringCellValue();
		driver.findElement(By.xpath(password_path)).clear();
		String pwd=row.getCell(7).getStringCellValue();
		driver.findElement(By.xpath(password_path)).sendKeys(pwd);
		
		Thread.sleep(2000);
		
		//sign in button
		String signin=row.getCell(8).getStringCellValue();
		driver.findElement(By.xpath(signin)).click();
		
				
		
		
		
		
		
		
		
		
		
		

	}
}
