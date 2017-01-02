package com.senthamil.bookapp.connection;

import java.sql.Connection;

import com.senthamil.bookapp.connection.ModelConnection;;

public class ConnectionTest {
	public static void main(String[] args) throws Exception {

		Connection connection = ModelConnection.getConnection();
		System.out.println(connection);

	}
}
