package ar.com.eduit.curso.java.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.eduit.curso.java.connectors.Connector;

public class Test_Connector {

	public static void main(String[] args) {
		
		try {
			ResultSet rs = 	Connector.
							conexion_bbdd().
							createStatement().
							executeQuery("select version ()");
			if (rs.next()) {
				System.out.println("Se realizo exitosamente la Conexión a la Base de Datos: " + Connector.getBase_de_datos() 
									+" ("+ rs.getString(1) + ")");
			} else {
				System.out.println("No se pudo establecer la Conexión con la Base de Datos.");
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	/*	ResulSet es un 'Conjunto de Registros'. Al ejecutar executeQuery("select version ()"), vamos a solicitar un 
        conjunto de registros, es por este motivo que debemos guardar el resultado final en una variable ResulSet, para que
        puede contener a ese Conjunto de Registros.
        Con 'rs.next()' preguntamos si rs tuvo algun tipo de resultado, lo que hace 'rs.next()'es posicionarse en el primer lugar 
        de la consulta. Si tiene un valor entonces se realizo la Conexión. Si la Conexion se logro relizar satisfactoriamente rs 
        va indicar el valor de la version a la estemos conectados.
    */
	}

}
