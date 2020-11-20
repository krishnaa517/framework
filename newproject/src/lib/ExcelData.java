package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	XSSFWorkbook book;
	XSSFSheet sht;
	
	public ExcelData(String path) {
		
		try {
			File src=new File(path);
			FileInputStream fi=new FileInputStream(src);
			book=new XSSFWorkbook(fi);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
