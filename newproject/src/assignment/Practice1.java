package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		
		// Target Element 
		driver.findElement(By.xpath("//input[@id='search-input-location']")).clear();
		driver.findElement(By.xpath("//input[@id='search-input-location']")).sendKeys("London");
		driver.findElement(By.linkText("London")).click();
		//click search button
		driver.findElement(By.id("search-submit")).click();
		
        
		List actproperties =new ArrayList();
		//store all Property price
         List<WebElement> allproperties = driver.findElements(By.xpath("//*[starts-with(@id,'listing_')]/div/div[2]/a"));
         
	     // Iterate  values
	    for(WebElement e:allproperties)
	    {
	    	actproperties.add(e.getText()) ;
	    }
	   //Sorting descending order
	    Collections.sort(actproperties,Collections.reverseOrder());
	    System.out.println( actproperties );
	    try {
			for(int i=0;i<allproperties.size();i++)
			{
				allproperties.get(4).click();
			}
		} catch (Exception e1) {
			
		}
	    //Target agent name
	    driver.findElement(By.xpath("//*[@id='dp-sticky-element']/div/div[1]/a/div[2]/h4")).click();
	    
	}
	

}
