package linear_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Linear_Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();

		// Admin Login
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='login']")).click();

		// Branches
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.xpath("//input[@id='BtnNewBR']")).click();

		driver.findElement(By.xpath("//input[@id='txtbName']")).sendKeys("DSNRHYD1");
		driver.findElement(By.xpath("//input[@id='txtAdd1']")).sendKeys("Address-1");
		driver.findElement(By.xpath("//input[@id='Txtadd2']")).sendKeys("Address-2");
		driver.findElement(By.xpath("//input[@id='txtadd3']")).sendKeys("Address-3");
		driver.findElement(By.xpath("//input[@id='txtArea']")).sendKeys("xyz-area");

		driver.findElement(By.xpath("//input[@id='txtZip']")).sendKeys("50008");
		new Select(driver.findElement(By.xpath("//select[@id='lst_counrtyU']"))).selectByValue("INDIA");
		new Select(driver.findElement(By.xpath("//select[@id='lst_stateI']"))).selectByValue("Andhra Pradesh");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath("//select[@id='lst_cityI']"))).selectByValue("Hyderabad");

		driver.findElement(By.xpath("//input[@id='btn_insert']")).click();

		driver.switchTo().alert().accept();

		// Roles
		driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
		driver.findElement(By.xpath("//input[@id='btnRoles']")).click();

		driver.findElement(By.xpath("//input[@id='txtRname']")).sendKeys("Role name");
		driver.findElement(By.xpath("//input[@id='txtRDesc']")).sendKeys("Role desc");
		Thread.sleep(3000);

		new Select(driver.findElement(By.xpath("//select[@id='lstRtypeN']"))).selectByValue("E");
		driver.findElement(By.xpath("//input[@id='btninsert']")).click();
		driver.switchTo().alert().accept();

//		//Users
//		driver.findElement(By.xpath("//img[@src='images/Users_but.jpg']")).click();
//		driver.findElement(By.xpath("//input[@id='Btnuser']")).click();
//		new Select(driver.findElement(By.xpath("//select[@id='lst_Roles']"))).selectByValue("icustomer");
//		new Select(driver.findElement(By.xpath("//select[@id='lst_Branch']"))).selectByValue("12345");
//		new Select(driver.findElement(By.xpath("//select[@id='DrCName']"))).selectByValue("");
//		
//		driver.findElement(By.xpath("//input[@id='Lbc_name']")).sendKeys("RAHUL");
//		driver.findElement(By.xpath("//input[@id='txtUname']")).sendKeys("AJAY");
//		driver.findElement(By.xpath("//input[@id='txtLpwd']")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@id='txtTpwd']")).sendKeys("654321");
//		driver.findElement(By.xpath("//input[@id='BtnSubmit']")).click();

		// Employee
		driver.findElement(By.xpath("//img[@src='images/emp_btn.jpg']")).click();
		driver.findElement(By.xpath("//input[@id='BtnNew']")).click();

		driver.findElement(By.xpath("//input[@id='txtUname']")).sendKeys("Pranay");
		driver.findElement(By.xpath("//input[@id='txtLpwd']")).sendKeys("123456");
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath("//select[@id='lst_Roles']"))).selectByValue("Nishyandhi");
		new Select(driver.findElement(By.xpath("//select[@id='lst_Branch']"))).selectByValue("12345");
		driver.findElement(By.xpath("//input[@id='BtnSubmit']")).click();
		driver.switchTo().alert().accept();

	}

}
