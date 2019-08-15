package com.ce.sel;

import java.sql.*;
//import java.sql.DriverManager;

public class DBTest {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:Project");
			Statement st = conn.createStatement();
			String sql = "Select * from Employee";
			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println(rs.getString(0));
			}
			
			conn.close();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
