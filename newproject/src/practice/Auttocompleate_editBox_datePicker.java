package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auttocompleate_editBox_datePicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		//date
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Sun, 17 Mar, 2019");
		
		
		
		

	}

}
