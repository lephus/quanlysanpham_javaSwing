package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class clsConnectDB {
		private static String DB_URL = "jdbc:mysql://localhost:3306/quanlysanpham";
		private static String USER_NAME = "root";
		private static String PASSWORD = "";
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            //CODE
	public static Connection getConnection(String dbURL, String userName, String password) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, userName, password);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}

	public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
			return rs;
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

		return null;
	}

//Thá»±c thi INSERT, DELETE, UPDATE
	public void ExcuteQueryUpdateDB(String cauTruyVanSQL) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(cauTruyVanSQL);
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
