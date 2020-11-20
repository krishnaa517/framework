package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Js_Runntimecimd {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//js.executeScript("return alert('Execution Completed')");
		js.executeScript("return alert('good')");
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		String page_title=js.executeScript("return document.title").toString();
		System.out.println(page_title);
		
		//Enter text into  text box
		js.executeScript("document.getElementById('email').value='krishna'");
		//dropdown
		
		js.executeScript("document.getElementById('month').selectedIndex='7'");
		
		// webelement
		WebElement pass=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value='krishna'", pass);
		
		// Hide elemnet
		
		WebElement surname=driver.findElement(By.name("lastname"));
		js.executeAsyncScript("arguments[0].style.display='none'", surname);
		
		Thread.sleep(2000);
		//scroll page
		
		
		//alert
		
		//Thread.sleep(3000);
		//Identify element
//		WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
//		
//		//Highlight text using jsexecutor
//		js.executeScript("arguments[0].style.backgroundColor = 'yellow'",text);
//		
		//Set outline for text
//		js.executeScript("arguments[0].style.outline = 'red solid 2px'",text);
//		Thread.sleep(5000);
//		
	}

}
