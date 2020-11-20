package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Js_executer {

	public static void main(String[] args) throws Throwable {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			//write text into text box using java script executor
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("document.getElementById('email').value='krishna@gmail.com'");
			
			js.executeScript("document.getElementById('pass').value='hello'");
			
			//dropdown
			js.executeScript("document.getElementById('day').value='6'");
			js.executeScript("document.getElementById('year').value='1985'");
			js.executeScript("document.getElementById('month').selectedIndex='7'");
			
					
			//select drop down values
			WebElement female_btn=driver.findElement(By.name("sex"));
			js.executeScript("arguments[0].checked=true",female_btn);
			Thread.sleep(3000);
			
			WebElement male_btn=driver.findElement(By.name("sex"));
			js.executeScript("arguments[0].click()",male_btn);
			
			
			
			
			
	}

}
