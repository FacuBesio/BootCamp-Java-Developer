/*
 Cuando utilizamos estas Clases estamos aplicando un patron Data Access Object. Básicamente este patron consiste en centralizar los 
 procesos de acceso a la Base de Datos evitando inconsistencias y posibles problemáticas cuando esto se realiza a lo largo de la app. 
Con este patron independizamos la lógica de negocio de la lógica de acceso a datos, obteniendo mayor organización y flexibilidad en 
nuestro sistema.
Se va encargar de relacionar nuestras Entidades con la Tablas de la Base de Datos. 
*/

package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.datebase.ConexionBaseDatos;
import com.educacionit.entities.Auto;
import com.educacionit.exceptions.PersonaInexistenteException;

public class AutoDAO {
	
//• INSERTAR
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
	
	
//• BUSCAR
		public Auto buscarAuto(int id) {
			ConexionBaseDatos conexion_BBDD = new ConexionBaseDatos(); 
			Auto auto = new Auto(); 
			boolean existe = false;
			try {
				
				PreparedStatement consulta = conexion_BBDD.getConnection().prepareStatement("SELECT * FROM autos WHERE id_auto = ?");
				consulta.setInt(1, id); 
				
				ResultSet resultado = consulta.executeQuery();
				
				while (resultado.next()){													// indica si hay resultado.
					existe = true;
					auto.setId_auto(Integer.parseInt(resultado.getString("id_auto")));
					auto.setMarca(resultado.getString("marca"));
					auto.setModelo(resultado.getString("modelo"));
					auto.setColor(resultado.getString("color"));
					auto.setPatente(resultado.getString("patente"));
				}
				
				resultado.close();
				consulta.close();
				conexion_BBDD.desconectar_Connection();
			
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Error no se logro obtener el dato con id = "+id+". Intente nuevamente." );
				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e);
			}
			
			if (existe) {
			
				return auto; 
			} else {
				
				return null;
			}
		}
	
	
//• MODIFICAR
	public void modificarAuto(Auto auto) {
		ConexionBaseDatos conexion_BBDD = new ConexionBaseDatos();
		
		try {
			String query = "UPDATE autos SET marca= ?, modelo= ?, color= ?, patente= ? WHERE id_auto= ?";
			PreparedStatement consulta_prepStatement = conexion_BBDD.getConnection().prepareStatement(query);
			consulta_prepStatement.setString(1, auto.getMarca());
			consulta_prepStatement.setString(2, auto.getModelo());
			consulta_prepStatement.setString(3, auto.getColor());
			consulta_prepStatement.setString(4, auto.getPatente());
			consulta_prepStatement.setInt(5, auto.getId_auto());
			consulta_prepStatement.execute();
			consulta_prepStatement.close();
			conexion_BBDD.desconectar_Connection();
			JOptionPane.showMessageDialog(null, "Se edito correctamente el registro: " + auto.getId_auto());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
//• ELIMNAR
	public void eliminarAuto(int id) {
		
		ConexionBaseDatos conexion_BBDD = new ConexionBaseDatos();
		Auto auto = buscarAuto(id);
		try {
			if (auto != null) {
			Statement estatuto = conexion_BBDD.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM autos WHERE id_auto= '"+ id +"'");
			JOptionPane.showMessageDialog(null, "Se elimino correctamente el registro: " + id);
			estatuto.close();
			conexion_BBDD.desconectar_Connection();
			}else {
				throw new PersonaInexistenteException();
			}
			
		} catch (PersonaInexistenteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se logro Eliminar el dato con id = "+id+". Intente nuevamente." );
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	

}
