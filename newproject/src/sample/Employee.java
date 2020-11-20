package sample;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Employee {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();


		File file=((TakesScreenshot)driver)).getScreenShotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("location.png"));
	}

}
