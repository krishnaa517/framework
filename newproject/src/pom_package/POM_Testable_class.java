package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class POM_Testable_class {
	public static WebDriver driver;

	@Test(priority = 0)

	public void RHP_Application() {
		driver = new FirefoxDriver();
		driver.get(Inputdata_class.App_url);
		driver.manage().window().maximize();
		POM_CLass.capturescreen(driver, "RHP_001");
	}

	@Test(priority = 1)
	public void RHP_Adminlogin() {
		POM_CLass.A_username_xpath(driver).sendKeys(Inputdata_class.A_uid);
		POM_CLass.A_Password_xpath(driver).sendKeys(Inputdata_class.A_pwd);
		POM_CLass.A_login_xpath(driver).click();
		POM_CLass.capturescreen(driver, "RHP_Admin_002");

	}

	@Test(priority = 2)
	public void RHP_Branch() {
		POM_CLass.br_branchbtn_Xpath(driver).click();
		POM_CLass.br_new_branch_btn(driver).click();
		POM_CLass.br_name_xpath(driver).sendKeys(Inputdata_class.B_Name);
		POM_CLass.br_address1_xpath(driver).sendKeys(Inputdata_class.B_Add1);
		POM_CLass.br_address2_xpath(driver).sendKeys(Inputdata_class.B_Add2);
		POM_CLass.br_address3_xpath(driver).sendKeys(Inputdata_class.B_Add3);
		POM_CLass.br_area_xpath(driver).sendKeys(Inputdata_class.B_Area);
		POM_CLass.br_zipcode_xpath(driver).sendKeys(Inputdata_class.B_Zip_Code);
		POM_CLass.br_country_xpath(driver).selectByVisibleText(Inputdata_class.B_Country);
		POM_CLass.br_state_xpath(driver).selectByVisibleText(Inputdata_class.B_State);
		POM_CLass.br_city_xpath(driver).selectByVisibleText(Inputdata_class.B_City);
		POM_CLass.br_submit_xpath(driver).click();
		POM_CLass.Alert_handel(driver);
		POM_CLass.capturescreen(driver, "RHP_Branch_003");
	}

	@Test(priority = 3)
	public void RHP_Roles() {
		POM_CLass.Roles_but(driver).click();
		POM_CLass.Roles_newroles_btn(driver).click();
		POM_CLass.R_Name(driver).sendKeys(Inputdata_class.R_name);
		POM_CLass.R_Desc(driver).sendKeys(Inputdata_class.R_Desc);
		POM_CLass.R_Type(driver).selectByVisibleText(Inputdata_class.R_Type);
		POM_CLass.R_submit(driver).click();
		POM_CLass.Alert_handel(driver);
		POM_CLass.capturescreen(driver, "RHP_Roles_004");
	}

	@Test(priority = 4)
	public void RHP_Employee() {
		POM_CLass.Employee_btn(driver).click();
		POM_CLass.NewEmployee_Btn(driver).click();
		POM_CLass.E_Name(driver).sendKeys(Inputdata_class.E_name);
		POM_CLass.E_Login_pwd(driver).sendKeys(Inputdata_class.E_login_pwd);
		POM_CLass.E_Role(driver).selectByVisibleText(Inputdata_class.E_Role);
		POM_CLass.E_Branch(driver).selectByVisibleText(Inputdata_class.E_Branch);
		POM_CLass.E_submit(driver).click();
		POM_CLass.Alert_handel(driver);
		POM_CLass.capturescreen(driver, "RHP_Employee_005");
	}

}
