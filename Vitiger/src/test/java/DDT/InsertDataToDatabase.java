package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataToDatabase {

	public static void main(String[] args) throws Throwable {


		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders", "root", "admin");
		Statement state=con.createStatement();
		
		String query ="insert into student(first_name,last_name,address)values('radha','sharma','delhi')";
		int result = state.executeUpdate(query);
		
		if(result==1) {
			System.out.println("data updated");
		}else
			System.out.println("data not updated");
		con.close();
	}

}
