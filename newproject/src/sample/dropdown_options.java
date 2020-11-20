package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class dropdown_options {

	public static void main(String[] args) throws Throwable  {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//keywords
		driver.findElement(By.xpath("//div[@id='kwdsugg']/div/div/input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//div[@id='kwdsugg']/div//div/input[@name='keyskills']")).sendKeys("Selenium,",Keys.ESCAPE);
		Thread.sleep(2000);
		
		//Locaton
		driver.findElement(By.xpath("//div[@id='locsugg']/div/div/input[@name='location']")).clear();
		driver.findElement(By.xpath("//div[@id='locsugg']/div/div/input[@name='location']")).sendKeys("HYD");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='sugDrp_locsugg']/ul/li/div")).click();
		
		
		driver.findElement(By.xpath("//input[@id='cjaExp']")).click();
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath("//li[@id='~4']")).click();
		
		//Target Element
		driver.findElement(By.xpath("//div[@id='minsal_dd_cja']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='minsal_dd_cja']//li[@id='~6']")).click();
	}
	
}
	
	
		
