package modular_package;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Repo_class {

	public static WebDriver driver;

	public static void Application_luanch() {
		driver = new FirefoxDriver();
		driver.get(Inputdata_class.App_url);
		driver.manage().window().maximize();
	}

	// //Admin login

	public static void Admin_login() {
		driver.findElement(Locators_class.A_username).sendKeys(Inputdata_class.A_uid);
		driver.findElement(Locators_class.A_password).sendKeys(Inputdata_class.A_pwd);
		driver.findElement(Locators_class.A_login).click();

	}

	// Branch button
	public static void Branch_btn() {
		driver.findElement(Locators_class.Branches_button).click();
	}

	// new branch button
	public static void new_Branch_btn() {
		driver.findElement(Locators_class.New_Branch_button).click();
	}

	// Branch creation
	public static void Branch_creation() {
		driver.findElement(Locators_class.B_Name).sendKeys(Inputdata_class.B_Name);
		driver.findElement(Locators_class.B_add1).sendKeys(Inputdata_class.B_Add1);
		driver.findElement(Locators_class.B_add2).sendKeys(Inputdata_class.B_Add2);
		driver.findElement(Locators_class.B_add3).sendKeys(Inputdata_class.B_Add3);
		driver.findElement(Locators_class.B_area).sendKeys(Inputdata_class.B_Area);
		driver.findElement(Locators_class.B_zip_code).sendKeys(Inputdata_class.B_Zip_Code);
		new Select(driver.findElement(Locators_class.B_Country)).selectByVisibleText(Inputdata_class.B_Country);
		new Select(driver.findElement(Locators_class.B_State)).selectByVisibleText(Inputdata_class.B_State);
		new Select(driver.findElement(Locators_class.B_City)).selectByVisibleText(Inputdata_class.B_City);

	}

	// Branch submit
	public static void B_Submit() {
		driver.findElement(Locators_class.B_Submit).click();
	}

	// Branch cancel
	public static void B_cancel() {
		driver.findElement(Locators_class.B_cancel).click();
	}

	// Branch Reset
	public static void B_Reset() {
		driver.findElement(Locators_class.B_Reset).click();
	}

	// Roles
	public static void Roles_btn() {
		driver.findElement(Locators_class.Roles_button).click();
	}

	// New Rolebutton
	public static void new_role_button() {
		driver.findElement(Locators_class.New_Role_button).click();
	}

	// Role creation
	public static void R_creation() {
		driver.findElement(Locators_class.R_name).sendKeys(Inputdata_class.R_name);
		driver.findElement(Locators_class.R_Desc).sendKeys(Inputdata_class.R_Desc);
		new Select(driver.findElement(Locators_class.R_Type)).selectByVisibleText(Inputdata_class.R_Type);
	}

	// Roles submit
	public static void R_submit() {
		driver.findElement(Locators_class.R_submit).click();

	}

	// Employees
	public static void Employees_button() {

		driver.findElement(Locators_class.Employee_button).click();
	}

	// New Employee button
	public static void New_employee_button() {
		driver.findElement(Locators_class.New_Employee_button).click();
	}

	// Employee Creation
	public static void E_Creation() {
		driver.findElement(Locators_class.E_name).sendKeys(Inputdata_class.E_name);
		driver.findElement(Locators_class.E_login_pwd).sendKeys(Inputdata_class.E_login_pwd);
		new Select(driver.findElement(Locators_class.E_Role)).selectByVisibleText(Inputdata_class.E_Role);
		new Select(driver.findElement(Locators_class.E_Branch)).selectByVisibleText(Inputdata_class.E_Branch);
	}

	// Employee submit
	public static void E_Submit() {
		driver.findElement(Locators_class.E_submit).click();

	}

	// Alert
	public static void Alert_handel() {
		driver.switchTo().alert().accept();
	}
	// Capture screen

	public static void captureScreen(String imagename) {
		try {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("Screens\\" + imagename + ".png"));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
