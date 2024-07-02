package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable {

		FileInputStream fis1 = new FileInputStream("./src\\test\\resources\\ExcelTextData.xlsx");

		Workbook book = WorkbookFactory.create(fis1);

		// step3:-get the control of the Sheet
		Sheet sheet = book.getSheet(sheetName);

		// step4:- get control of the row
		Row row1 = sheet.getRow(rowNum);

		// step5:- get control of the cell
		Cell cell1 = row1.getCell(cellNum);

		String ExcelData = cell1.getStringCellValue();

		return ExcelData;

	}

	public String readExcelDataUsingDataFormatter(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis2 = new FileInputStream("./src\\test\\resources\\ExcelTextData.xlsx");

		// step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis2);

		// step3:-get the control of the Sheet
		Sheet sheet = book.getSheet(sheetName);

		// step4:- get control of the row
		Row row = sheet.getRow(rowNum);

		// step5:- get control of the cell
		Cell cell = row.getCell(cellNum);

		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cell);
		return ExcelData;
	}

	public Object[][] readDataUsingDataProvider(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\ExcelTextData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum() + 1;
		int lastCell = sheet.getRow(0).getLastCellNum();

		Object[][] objArr = new Object[lastRow][lastCell];

		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < lastCell; j++) {
				objArr[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return objArr;

	}

}
