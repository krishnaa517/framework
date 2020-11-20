package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Writedata {
	public static void main(String[] args) throws IOException {
				
				//Target file location
				FileInputStream fi=new FileInputStream("E:\\04-09-2018\\newproject\\Testdata\\Book1.xlsx");
				System.out.println("file located");
				
				//Access Workbook using fileinput stream
				XSSFWorkbook book=new XSSFWorkbook(fi);
				System.out.println("book accessed");
				
				XSSFSheet sht=book.getSheet("Sheet1");
				
				int rcount=sht.getLastRowNum();
				for(int i=11;i<rcount;i++) {
					//Targe row and write cell data
					sht.getRow(i).getCell(1).setc
					
					//Create output file using runtime data
					book.write(new FileOutputStream("TestData\\Output.xlsx"));
					book.close();
				}
					
				}
				
				
				
				
				
				
		
		
		
	
	}
			
		}
			
	


