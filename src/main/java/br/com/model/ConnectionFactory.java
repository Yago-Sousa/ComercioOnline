package br.com.model;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {

	public Connection getConnection() {

		String url = "jdbc:mysql://127.0.0.1:3306/dbcomercio";
		String user = "root";
		String password = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			throw new RuntimeException("Erro"+ e);
		}

	}

}
