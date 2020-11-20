package hybread_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel_Helper_class {

	public static WebDriver driver;

	public static void excel_helperclass(String Filename, String sheetname) {
		Excel_Connection_class.excelconnection_class(Filename, sheetname);
		String App_url = Excel_Connection_class.sht.getRow(1).getCell(0).getStringCellValue();

		// Application
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(App_url);
		driver.manage().window().maximize();

	}

	public static void Excelhelper_class1(String Filename, String Shtname) {
		Excel_Connection_class.excelconnection_class(Filename, Shtname);
		// Row count in current excel sheet
		int rc = Excel_Connection_class.sht.getLastRowNum();

		for (int i = 1; i < rc; i++) {
			String propname = Excel_Connection_class.sht.getRow(i).getCell(1).getStringCellValue();
			String propvalue = Excel_Connection_class.sht.getRow(i).getCell(2).getStringCellValue();
			String Actions = Excel_Connection_class.sht.getRow(i).getCell(3).getStringCellValue();
			String inputdata = Excel_Connection_class.sht.getRow(i).getCell(4).getStringCellValue();

			switch (Actions) {

			case "Link":
				WebElement ele1 = driver.findElement(Excel_locators_class.Excel_locators(propvalue, propname));
				ele1.click();
				break;
			case "Textbox":
				WebElement ele = driver.findElement(Excel_locators_class.Excel_locators(propvalue, propname));
				ele.clear();
				ele.sendKeys(inputdata);
				break;
			case "Button":
				WebElement ele2 = driver.findElement(Excel_locators_class.Excel_locators(propvalue, propname));
				ele2.sendKeys(Keys.ENTER);
				break;
			case "Alert":
				driver.switchTo().alert().accept();
				break;

			}
		}

	}

}
