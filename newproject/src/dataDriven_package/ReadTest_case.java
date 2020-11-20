package dataDriven_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTest_case {

	public static void main(String[] args) throws IOException {
		// Target file location
		FileInputStream fi = new FileInputStream("Testdata\\InputData1.xlsx");
		System.out.println("file located");

		// Get Workbook using above location
		XSSFWorkbook book = new XSSFWorkbook(fi);
		// Target sheet using above book
		XSSFSheet sht = book.getSheet("Login");
		// Target row using above sheet
		XSSFRow row = sht.getRow(1);

		// Get Cell data
		String url = row.getCell(1).getStringCellValue();
		// launch browser and load webpage
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// Get Next button xpath
		String Signin_btn_locator = row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Signin_btn_locator)).click();

		// Get Email locator and EmailInput
		String email_locator = row.getCell(3).getStringCellValue();
		String email_input = row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(email_locator)).clear();
		driver.findElement(By.xpath(email_locator)).sendKeys(email_input);

		// Get Next button
		String Next_btn = row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Next_btn)).click();

	}

}
