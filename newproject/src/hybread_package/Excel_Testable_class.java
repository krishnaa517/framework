package hybread_package;

import org.testng.annotations.Test;

public class Excel_Testable_class {
	@Test(priority = 0)
	public void Application() {
		Excel_Helper_class.excel_helperclass("Excel_inputdata1.xlsx", "URL");

	}

	@Test(priority = 1)
	public void Admin_login() {

		Excel_Helper_class.Excelhelper_class1("Excel_inputdata1.xlsx", "Admin");
	}

}
