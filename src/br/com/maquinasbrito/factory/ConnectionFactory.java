package br.com.maquinasbrito.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection searchConnection() throws SQLException {
		return DriverManager
				.getConnection
				("jdbc:mysql://localhost/maquinasbrito",
						"root", "");
	}
}
