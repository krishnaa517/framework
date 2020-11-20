package testng;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {
	

	  @Test
	  public void tc004() 
	  {
		 Reporter.log("tc004  Executed",true);
	  }
	  
	  @Test
	  public void tc005() 
	  {
		  Reporter.log("tc005  Executed",true);
	  }
	  
	  
	  @Test
	  public void tc006() 
	  {
		 
		  Reporter.log("Tc006 executed",true);
	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("Pretest before firefox launch ");
	  }
	

}
