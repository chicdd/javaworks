package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

		private static String driverClass = "oracle.jdbc.OracleDriver";
		private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private static String username = "system";
		private static String password = "dodo0220";
				
				
	
		public static void main(String[] args) {
			Connection conn = null;

			try {
				Class.forName(driverClass);
				conn = DriverManager.getConnection(url, username, password);
				System.out.println(conn + " DB연결 성공!!");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
