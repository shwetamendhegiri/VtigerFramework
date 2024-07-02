import Generic_Utilities.Excel_Utility;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {
		Excel_Utility elib = new Excel_Utility();
		String data = elib.readExcelDataUsingDataFormatter("Sheet1", 0, 0);
		System.out.println(data);
	}

}
