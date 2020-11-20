package hybread_package;

import org.openqa.selenium.By;

public class Excel_locators_class {

	public static By Excel_locators(String propvalue, String Propname) {
		By obj = null;
		switch (Propname) {
		case "xpath":

			obj = By.xpath(propvalue);
			break;
		case "id":
			obj = By.id(propvalue);
			break;
		case "name":
			obj = By.name(propvalue);
			break;
		case "Linktext":
			obj = By.linkText(propvalue);
			break;
		default:
			break;
		}
		return obj;
	}

}
