/*
 Cuando utilizamos estas Clases estamos aplicando un patron Data Access Object. Básicamente este patron consiste en centralizar los 
 procesos de acceso a la Base de Datos evitando inconsistencias y posibles problemáticas cuando esto se realiza a lo largo de la app. 
Con este patron independizamos la lógica de negocio de la lógica de acceso a datos, obteniendo mayor organización y flexibilidad en 
nuestro sistema.
Se va encargar de relacionar nuestras Entidades con la Tablas de la Base de Datos. 
*/

package com.educacionit.dao;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.datebase.ConexionBaseDatos;
import com.educacionit.entities.Auto;

public class AutoDAO {
	
	
	public void insertar_auto (Auto auto_VO) {
		
		ConexionBaseDatos conexion_BBDD = new ConexionBaseDatos();
		
		try {
			
			Statement estatuto = conexion_BBDD.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO autos (marca, modelo, color, patente) VALUES ("
																							+ "'"+auto_VO.getMarca()+"', "
																							+ "'"+auto_VO.getModelo()+"', "
																							+ "'"+auto_VO.getColor()+"', "
																							+ "'"+auto_VO.getPatente()+"');");
			JOptionPane.showConfirmDialog(null, "Se registro exitosamente el auto " + auto_VO.getMarca() + " "+ auto_VO.getModelo()+"!");
			estatuto.close();
			conexion_BBDD.desconectar_Connection();
			
		} catch (SQLException e) {
			System.out.println(e);
			JOptionPane.showConfirmDialog(null, "No se registro correctamente el auto " + auto_VO.getMarca() + " "+ auto_VO.getModelo());
		} catch (Exception e) {	
			System.out.println(e);
		}
	}
	
	
	
	

}
