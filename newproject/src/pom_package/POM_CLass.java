package pom_package;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class POM_CLass {

	public static WebElement A_username_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.A_username);
	}

	public static WebElement A_Password_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.A_password);
	}

	public static WebElement A_login_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.A_login);
	}

	// Branch
	public static WebElement br_branchbtn_Xpath(WebDriver driver) {
		return driver.findElement(Locators_class.Branches_button);
	}

	public static WebElement br_new_branch_btn(WebDriver driver) {
		return driver.findElement(Locators_class.New_Branch_button);
	}

	public static WebElement br_name_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_Name);
	}

	public static WebElement br_address1_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_add1);
	}

	public static WebElement br_address2_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_add2);
	}

	public static WebElement br_address3_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_add3);
	}

	public static WebElement br_area_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_area);
	}

	public static WebElement br_zipcode_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_zip_code);
	}

	public static Select br_country_xpath(WebDriver driver) {
		return new Select(driver.findElement(Locators_class.B_Country));
	}

	public static Select br_state_xpath(WebDriver driver) {
		return new Select(driver.findElement(Locators_class.B_State));
	}

	public static Select br_city_xpath(WebDriver driver) {
		return new Select(driver.findElement(Locators_class.B_City));
	}

	public static WebElement br_submit_xpath(WebDriver driver) {
		return driver.findElement(Locators_class.B_Submit);
	}

	public static WebElement br_reset(WebDriver driver) {
		return driver.findElement(Locators_class.B_Reset);
	}

	public static WebElement br_cancel(WebDriver driver) {
		return driver.findElement(Locators_class.B_cancel);
	}

	// Roles
	public static WebElement Roles_but(WebDriver driver) {
		return driver.findElement(Locators_class.Roles_button);
	}

	public static WebElement Roles_newroles_btn(WebDriver driver) {
		return driver.findElement(Locators_class.New_Role_button);
	}

	public static WebElement R_Name(WebDriver driver) {
		return driver.findElement(Locators_class.R_name);
	}

	public static WebElement R_Desc(WebDriver driver) {
		return driver.findElement(Locators_class.R_Desc);
	}

	public static Select R_Type(WebDriver driver) {
		return new Select(driver.findElement(Locators_class.R_Type));
	}

	public static WebElement R_submit(WebDriver driver) {
		return driver.findElement(Locators_class.R_submit);
	}

	// Employee
	public static WebElement Employee_btn(WebDriver driver) {
		return driver.findElement(Locators_class.Employee_button);
	}

	public static WebElement NewEmployee_Btn(WebDriver driver) {
		return driver.findElement(Locators_class.New_Employee_button);
	}

	public static WebElement E_Name(WebDriver driver) {
		return driver.findElement(Locators_class.E_name);
	}

	public static WebElement E_Login_pwd(WebDriver driver) {
		return driver.findElement(Locators_class.E_login_pwd);
	}

	public static Select E_Role(WebDriver driver) {
		return new Select(driver.findElement(Locators_class.E_Role));
	}

	public static Select E_Branch(WebDriver driver) {
		return new Select(driver.findElement(Locators_class.E_Branch));
	}

	public static WebElement E_submit(WebDriver driver) {
		return driver.findElement(Locators_class.E_submit);
	}

	public static void Alert_handel(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public static void capturescreen(WebDriver driver, String imagename) {
		try {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("Screens\\" + imagename + ".png"));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
