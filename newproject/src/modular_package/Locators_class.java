package modular_package;

import org.openqa.selenium.By;

public class Locators_class {

	public static By A_username = By.xpath("//input[@id='txtuId']");
	public static By A_password = By.xpath("//input[@id='txtPword']");
	public static By A_login = By.xpath("//input[@name='login']");

	// Branches
	public static By Branches_button = By.xpath("//img[@src='images/Branches_but.jpg']");
	public static By New_Branch_button = By.xpath("//input[@id='BtnNewBR']");
	public static By B_Name = By.xpath("//input[@id='txtbName']");
	public static By B_add1 = By.xpath("//input[@id='txtAdd1']");
	public static By B_add2 = By.xpath("//input[@id='Txtadd2']");
	public static By B_add3 = By.xpath("//input[@id='txtadd3']");
	public static By B_area = By.xpath("//input[@id='txtArea']");
	public static By B_zip_code = By.xpath("//input[@id='txtZip']");
	public static By B_Country = By.xpath("//select[@id='lst_counrtyU']");
	public static By B_State = By.xpath("//select[@id='lst_stateI']");
	public static By B_City = By.xpath("//select[@id='lst_cityI']");

	public static By B_Submit = By.xpath("//input[@id='btn_insert']");

	public static By B_Reset = By.xpath("//input[@id='Btn_Reset']");
	public static By B_cancel = By.xpath("Btn_cancel");
	// Roles
	public static By Roles_button = By.xpath("//img[@src='images/Roles_but.jpg']");
	public static By New_Role_button = By.xpath("//input[@id='btnRoles']");
	public static By R_name = By.xpath("//input[@id='txtRname']");
	public static By R_Desc = By.xpath("//input[@id='txtRDesc']");
	public static By R_Type = By.xpath("//select[@id='lstRtypeN']");

	public static By R_submit = By.xpath("//input[@id='btninsert']");

	// Employees
	public static By Employee_button = By.xpath("//img[@src='images/emp_btn.jpg']");
	public static By New_Employee_button = By.xpath("//input[@id='BtnNew']");
	public static By E_name = By.xpath("//input[@id='txtUname']");
	public static By E_login_pwd = By.xpath("//input[@id='txtLpwd']");
	public static By E_Role = By.xpath("//select[@id='lst_Roles']");
	public static By E_Branch = By.xpath("//select[@id='lst_Branch']");

	public static By E_submit = By.xpath("//input[@id='BtnSubmit']");

}
