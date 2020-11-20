package hybread_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_class {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");

		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login'] ")).click();

	}

}
