package modular_package;

import org.testng.annotations.Test;

public class Modular_testable_class {
	@Test(priority = 0)
	public void Application() {
		Repo_class.Application_luanch();
		Repo_class.captureScreen("RHP_App");
	}

	@Test(priority = 1)
	public void Admin_login() {
		Repo_class.Admin_login();
		Repo_class.captureScreen("RHP_AdminLogin");

	}

	@Test(priority = 2)
	public void Branch_creation() {

		Repo_class.Branch_btn();
		Repo_class.captureScreen("RHP_Branchbutton");

		Repo_class.new_Branch_btn();
		Repo_class.captureScreen("RHP_new_Branchcreation");

		Repo_class.Branch_creation();
		Repo_class.captureScreen("RHP_Branchcreation");

		Repo_class.B_Submit();
		Repo_class.captureScreen("RHP_BranchSubmit");

	}

	@Test(priority = 3)
	public void Roles() {
		Repo_class.Roles_btn();
		;
		Repo_class.captureScreen("RHP_Roles button");

		Repo_class.new_role_button();
		Repo_class.captureScreen("RHP_New_Roles button");

		Repo_class.R_creation();
		Repo_class.captureScreen("RHP_Roles creatin");

		Repo_class.R_submit();
		Repo_class.Alert_handel();

	}

	@Test(priority = 4)
	public void Employees() {
		Repo_class.Employees_button();
		Repo_class.captureScreen("RHP_Employee button");

		Repo_class.New_employee_button();
		Repo_class.captureScreen("RHP_New_Employee button");

		Repo_class.E_Creation();
		Repo_class.captureScreen("RHP_Employee Creation");

		Repo_class.E_Submit();
		Repo_class.Alert_handel();
	}

}
