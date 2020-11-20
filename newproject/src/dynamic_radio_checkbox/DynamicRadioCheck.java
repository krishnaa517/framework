package dynamic_radio_checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadioCheck {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='sex']"));
		
		for(WebElement ele:radio)
		{
			String radio_value=ele.getAttribute("value");
			System.out.println("value=  :"+radio_value);
			
			if(radio_value.equals("2")) {
				
				ele.click();
				break;
			}
				
				
			
		}
		
		
		
	}

}
