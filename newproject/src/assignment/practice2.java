package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
				
		//Target flights link
		driver.findElement(By.xpath("//a[@class='active makeFlex hrtlCenter column']")).click();
		//Target round trip radio button
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
		//Target from location
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Delhi",Keys.ENTER);
		//Target to Location
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Bangalore",Keys.ENTER);
		
		//Target departure date 
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Jun 25 2019']")).click();
		
		//Target return date
		driver.findElement(By.xpath("//input[@id='return']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Jul 02 2019']")).click();
		
		//Target search button
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
	}

}
