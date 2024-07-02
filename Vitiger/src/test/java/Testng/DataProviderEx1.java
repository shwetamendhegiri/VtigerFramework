package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {

	@Test(dataProvider = "dataProvider_bookTickets")
	public void bookTicketTest(String src, String dest, int numOfPpl) {
		System.out.println("Book tickets from " + src + " to " + dest + " " + numOfPpl);
	}

	@DataProvider
	public Object[][] dataProvider_bookTickets() {
		Object[][] objArr = new Object[3][3];

		objArr[0][0] = "Bangalore";
		objArr[0][1] = "Goa";
		objArr[0][2] = 2;

		objArr[1][0] = "Bangalore";
		objArr[1][1] = "Pune";
		objArr[1][2] = 3;

		objArr[2][0] = "Bangalore";
		objArr[2][1] = "Mysore";
		objArr[2][2] = 2;

		return objArr;
		//pull back

	}
}
