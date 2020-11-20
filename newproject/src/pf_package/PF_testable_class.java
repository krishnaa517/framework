package pf_package;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import modular_package.Inputdata_class;
import pom_package.POM_CLass;

public class PF_testable_class {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get(Inputdata_class.App_url);
		driver.manage().window().maximize();
		POM_CLass.capturescreen(driver, "RHP_001");

		PageFactory.initElements(driver, PF_CLASS.class);

		PF_CLASS.A_username.sendKeys(Inputdata_class.A_uid);
		PF_CLASS.A_password.sendKeys(Inputdata_class.A_pwd);
		PF_CLASS.A_login.click();
		POM_CLass.capturescreen(driver, "RHP_Admin_002");

		// Branches

		PF_CLASS.B_Branchbutton.click();
		PF_CLASS.B_Newbranchbutton.click();
		PF_CLASS.B_branchname.sendKeys(Inputdata_class.B_Name);
		PF_CLASS.B_Address1.sendKeys(Inputdata_class.B_Add1);
		PF_CLASS.B_Address2.sendKeys(Inputdata_class.B_Add2);
		PF_CLASS.B_Address3.sendKeys(Inputdata_class.B_Add3);
		PF_CLASS.B_Area.sendKeys(Inputdata_class.B_Area);
		PF_CLASS.B_zip.sendKeys(Inputdata_class.B_Zip_Code);
		new Select(PF_CLASS.Br_country).selectByVisibleText(Inputdata_class.B_Country);
		new Select(PF_CLASS.B_State).selectByVisibleText(Inputdata_class.B_State);
		new Select(PF_CLASS.B_City).selectByVisibleText(Inputdata_class.B_City);
		PF_CLASS.B_Submit.click();
		driver.switchTo().alert().accept();
		POM_CLass.capturescreen(driver, "RHP_Branch_003");

		// Roles

		PF_CLASS.R_Rolesbutton.click();
		PF_CLASS.R_Newolebutton.click();
		PF_CLASS.R_Rolename.sendKeys(Inputdata_class.R_name);
		PF_CLASS.R_Roledesc.sendKeys(Inputdata_class.R_Desc);
		PF_CLASS.R_Roletype.sendKeys(Inputdata_class.R_Type);
		PF_CLASS.R_Submit.click();
		driver.switchTo().alert().accept();
		POM_CLass.capturescreen(driver, "RHP_Roles_004");

		// Employee

		PF_CLASS.E_Employeebutton.click();
		PF_CLASS.E_Newmployeebutton.click();
		PF_CLASS.E_Employeename.sendKeys(Inputdata_class.E_name);
		PF_CLASS.E_Loginpwd.sendKeys(Inputdata_class.E_login_pwd);
		PF_CLASS.E_Role.sendKeys(Inputdata_class.E_Role);
		PF_CLASS.E_Branch.sendKeys(Inputdata_class.E_Branch);
		PF_CLASS.E_Submit.click();

		driver.switchTo().alert().accept();
		POM_CLass.capturescreen(driver, "RHP_Employee_005");

	}

}
