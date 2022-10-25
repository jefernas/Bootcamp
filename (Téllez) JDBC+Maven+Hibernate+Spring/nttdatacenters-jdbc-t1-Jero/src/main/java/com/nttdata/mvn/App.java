package com.nttdata.mvn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {


			        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/nttdata_jdbc_ex";
		String username = "root";
		String pass = "rootroot";
		String tablaJugador = "nttdata_mysql_soccer_player";
		String tablaEquipo = "nttdata_mysql_soccer_team";
		
		try {
			Connection con = DriverManager.getConnection(url, username, pass);
			Statement st = con.createStatement();
			String consulta = "select * from "+tablaJugador;
			ResultSet rs = st.executeQuery(consulta);
			
			while (rs.next()) {
				//obtenemos los strings de la columna 2 para que muestre el nombre de los jugadores
				System.out.println("Nombre del jugador: " + rs.getString("name"));
			}
			
			//Cierre de conexión
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
