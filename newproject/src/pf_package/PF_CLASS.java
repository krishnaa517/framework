package pf_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PF_CLASS {

	// Admin

	@FindBy(how = How.XPATH, using = "//input[@id='txtuId']")
	public static WebElement A_username;

	@FindBy(how = How.XPATH, using = "//input[@id='txtPword']")
	public static WebElement A_password;

	@FindBy(how = How.XPATH, using = "//input[@id='login']")
	public static WebElement A_login;

	@FindBy(how = How.XPATH, using = "//select[@id='lst_counrtyU']")
	public static WebElement Br_country;

	// Branches

	@FindBy(how = How.XPATH, using = "//img[@src='images/Branches_but.jpg']")
	public static WebElement B_Branchbutton;

	@FindBy(how = How.XPATH, using = "//input[@src='images/NewBranch.jpg']")
	public static WebElement B_Newbranchbutton;

	@FindBy(how = How.XPATH, using = "//input[@id='txtbName']")
	public static WebElement B_branchname;

	@FindBy(how = How.XPATH, using = "//input[@id='txtAdd1']")
	public static WebElement B_Address1;

	@FindBy(how = How.XPATH, using = "//input[@id='Txtadd2']")
	public static WebElement B_Address2;

	@FindBy(how = How.XPATH, using = "//input[@id='txtadd3']")
	public static WebElement B_Address3;

	@FindBy(how = How.XPATH, using = "//input[@id='txtArea']")
	public static WebElement B_Area;

	@FindBy(how = How.XPATH, using = "//input[@id='txtZip']")
	public static WebElement B_zip;

	@FindBy(how = How.XPATH, using = "//select[@id='lst_counrtyU']")
	public static WebElement B_Country;

	@FindBy(how = How.XPATH, using = "//select[@id='lst_stateI']")
	public static WebElement B_State;

	@FindBy(how = How.XPATH, using = "//select[@id='lst_cityI']")
	public static WebElement B_City;

	@FindBy(how = How.XPATH, using = "//input[@id='btn_insert']")
	public static WebElement B_Submit;

	// Roles

	@FindBy(how = How.XPATH, using = "//img[@src='images/Roles_but.jpg']")
	public static WebElement R_Rolesbutton;

	@FindBy(how = How.XPATH, using = "//input[@id='btnRoles']")
	public static WebElement R_Newolebutton;

	@FindBy(how = How.XPATH, using = "//input[@id='txtRname']")
	public static WebElement R_Rolename;

	@FindBy(how = How.XPATH, using = "//input[@id='txtRDesc']")
	public static WebElement R_Roledesc;

	@FindBy(how = How.XPATH, using = "//select[@id='lstRtypeN']")
	public static WebElement R_Roletype;

	@FindBy(how = How.XPATH, using = "//input[@id='btninsert']")
	public static WebElement R_Submit;

	// Employee

	@FindBy(how = How.XPATH, using = "//img[@src='images/emp_btn.jpg']")
	public static WebElement E_Employeebutton;

	@FindBy(how = How.XPATH, using = "//input[@id='BtnNew']")
	public static WebElement E_Newmployeebutton;

	@FindBy(how = How.XPATH, using = "//input[@id='txtUname']")
	public static WebElement E_Employeename;

	@FindBy(how = How.XPATH, using = "//input[@id='txtLpwd']")
	public static WebElement E_Loginpwd;

	@FindBy(how = How.XPATH, using = "//select[@id='lst_Roles']")
	public static WebElement E_Role;

	@FindBy(how = How.XPATH, using = "//select[@id='lst_Branch']")
	public static WebElement E_Branch;

	@FindBy(how = How.XPATH, using = "//input[@id='BtnSubmit']")
	public static WebElement E_Submit;

	{

	}
}
