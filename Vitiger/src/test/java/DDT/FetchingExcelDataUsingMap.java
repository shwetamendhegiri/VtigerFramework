package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelDataUsingMap {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\ExcelTestData.xlsx");
        Workbook book = WorkbookFactory.create(fis);
        Sheet sheet = book.getSheet("Sheet1");
        int rows=sheet.getLastRowNum();
        System.out.println(rows);
        
        LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
        
	}

}
