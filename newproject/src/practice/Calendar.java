package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		//Identify datepicker
		WebElement DptDate=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		DptDate.click();
		Thread.sleep(1000);
		for(int i=0;i<4;i++)
		{
		//Identify table
		WebElement DatePicker_table=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]"));
		List<WebElement> All_clickable_Dates=DatePicker_table.findElements(By.tagName("a"));
		System.out.println("All clickable dates size =" +All_clickable_Dates.size());
		//Iterate for number of links
		for(int j=0;j<All_clickable_Dates.size();j++)
		{
			//select each date
			WebElement Eachlink=All_clickable_Dates.get(j);
			Eachlink.click();
			Thread.sleep(1000);
			
			DptDate.click();
			Thread.sleep(1000);
			DatePicker_table=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]"));
			All_clickable_Dates=DatePicker_table.findElements(By.tagName("a"));
			
		}
			DptDate.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Next']")).click();
			Thread.sleep(1000);
		}

		
	}

}
