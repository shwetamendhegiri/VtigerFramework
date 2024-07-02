package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromDatabase {

	public static void main(String[] args) throws Throwable {
				
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
			
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders", "root", "admin");
        
        Statement state = con.createStatement();
	    String query = "select * from student";
	
	    ResultSet result = state.executeQuery(query);
	
	    while (result.next())
	    {
	    	System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4));
		}	     
	    con.close();		
	}

}
