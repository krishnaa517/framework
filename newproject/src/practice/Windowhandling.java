package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		//click PNR status link
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		//Iterator
		Iterator<String> it=handles.iterator();
		
		String parentwindowid=it.next();
		System.out.println(parentwindowid);
		
		String childwindowid= it.next();
		System.out.println(childwindowid);
		
		driver.switchTo().window(parentwindowid);
		
		//click Trains availability calendar link
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
				
		
		
	}

}
