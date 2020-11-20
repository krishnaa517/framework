package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Js_runtime {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		//Select Dropdown
				WebElement Open_account=driver.findElement(By.id("open_account"));
				//Use New Selector to get single option
				new Select(Open_account).selectByVisibleText("Corporate Account");
						
				//Target Webelement
				WebElement Open_my_account_btn=driver.findElement(By.xpath("//input[@value='Open my Account']"));
				Open_my_account_btn.click();
				Thread.sleep(10000);
				
				
				WebElement others=driver.findElement(By.name("FML_USR_ADDRSS_CTY_OTHERS"));
				((JavascriptExecutor)driver).executeScript("arguments[0].value='HYD'",others);
				
				((JavascriptExecutor)driver).executeScript("arguments[0].style.display='none'",others);
				
				
				
				
				
				

				
				

	}

}
