package com.utn.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectioMySql {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/utn","root","");
		
		return c;
	}
}
