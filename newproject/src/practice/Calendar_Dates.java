package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Dates {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		//Identify datepicker
		WebElement DpdDate=driver.findElement(By.id("dpt_date"));
		DpdDate.click();
		Thread.sleep(3000);
		
		for(int i=0;i<3;i++)
		{
			//Identify table
			WebElement DatePicker_table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
			
			//Get all clicakble links at datepicker
			List<WebElement> All_clickable_Dates=DatePicker_table.findElements(By.tagName("a"));
			System.out.println("All clickable dates size =" +All_clickable_Dates.size());
			//Iterate for number of links
			for(int j=0;j<All_clickable_Dates.size();j++)
			{
				//select each date
				WebElement Eachlink=All_clickable_Dates.get(j);
				Eachlink.click();
				Thread.sleep(1000);
				
			DpdDate.click();
			Thread.sleep(2000);
			DatePicker_table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			All_clickable_Dates=DatePicker_table.findElements(By.tagName("a"));
			
		}
			//DpdDate.click();
			Thread.sleep(2000);
			driver.findElement(By.id("cal_showNextMonth")).click();
			Thread.sleep(2000);
		}

	}

}
