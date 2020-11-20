package hybread_package;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Connection_class {
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String path = "Testdata\\";

	public static void excelconnection_class(String filename, String sheetname) {
		try {

			FileInputStream fi = new FileInputStream(path + filename);
			book = new XSSFWorkbook(fi);
			sht = book.getSheet(sheetname);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static String Excel_row(int col, int row) {
		return sht.getRow(row).getCell(col).getStringCellValue();
	}

}
