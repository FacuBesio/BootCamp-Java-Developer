package com.educacionit.datebase;

public class Test_Connection {

	public static void main(String[] args) {
		
		ConexionBaseDatos Conexion_MySql = new ConexionBaseDatos();
		
		Conexion_MySql.getConnection();
		
		Conexion_MySql.desconectar_Connection();
	}
	
}
