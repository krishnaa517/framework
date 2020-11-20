package parameter_pckage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom_package.POM_CLass;

public class Parameter_class {
	public static WebDriver driver;

	@Parameters({ "browser" })
	@Test(priority = 0)
	public void Application(String Url) {
		driver = new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();

	}

	@Parameters({ "username,password" })
	@Test(priority = 1)
	public void Admin_login(String Uid, String Pwd) {
		POM_CLass.A_username_xpath(driver).sendKeys(Uid);
		POM_CLass.A_Password_xpath(driver).sendKeys(Pwd);
		POM_CLass.A_login_xpath(driver).click();

	}
}
