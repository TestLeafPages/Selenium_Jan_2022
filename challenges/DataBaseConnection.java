package challenges;

import java.sql.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataBaseConnection {

	public String lead_id;

	@BeforeMethod
	public void getData() throws ClassNotFoundException, SQLException {
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/sys";
		
		String username = "root";
		String password = "India739!";
		
		//Step1: Register the driver
		Class.forName(jdbc_driver);
		
		//Step2: Connect to the database
		Connection connection = DriverManager.getConnection(jdbc_url,username,password);
		
		//Step3: To execute query
		Statement stmt = connection.createStatement();
		String sql = "select * from leads where lead_id=10355";
		ResultSet executeQuery = stmt.executeQuery(sql);
		
		while(executeQuery.next()) {
			lead_id = executeQuery.getString(1);
			String lead_name = executeQuery.getString("lead_name");
			String lead_address = executeQuery.getString(3);
			System.out.println(lead_id+" "+lead_name+" "+lead_address);
		}
		
	}
	
	@Test
	public void findLead() {
		System.out.println(lead_id);

	}


}
