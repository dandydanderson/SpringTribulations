package com.revature.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	private String username;
	private String password;
	private String url;
	private static ConnectionFactory connectionFactory;
	private static final String SCHEMA = "public";

	public static Connection getConnection() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory.createConnection();
	}
	
	private ConnectionFactory() {
		username = System.getenv("POSTGRES_USERNAME");
		password = System.getenv("AWS_POSTGRES_PASSWORD");
		url = "jdbc:postgresql://" + System.getenv("AWS_POSTGRES_URL") + ":5432/postgres?";
		//private constructor helps make this a singleton
		//we want to grab all of the environment variables 
//		 url =System.getenv("POSTGRES_URL");
//		 url = "jdbc:postgresql://"+url+":5000/trucker?";
//		 username=System.getenv("POSTGRES_USERNAME");
//		password=System.getenv("POSTGRES_PASSWORD");
	}
	
	private Connection createConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load PostgresSQL Driver");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, username, password);
			conn.setSchema(SCHEMA);
		} catch (SQLException e) {
			System.out.println("Problem create DB connection");
			e.printStackTrace();
		}
		return conn;
	}

}
