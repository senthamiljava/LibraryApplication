package com.senthamil.bookapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModelConnection {

	public static Connection getConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://139.59.29.57:3306/sen_db", "dev_user",
				"dev_pwd");
		return con;

	}
}
