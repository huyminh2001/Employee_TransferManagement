package dbConnect;

import java.sql.*;

public class ConnectDB {

	private static Connection connection;

	public static Connection connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetransfer2", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			connection = null;
		}
		return connection;
	}

	public static void disconnect() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}