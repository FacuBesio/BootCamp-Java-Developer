package com.educacionit.dao;

import com.educacionit.entities.Auto;

public class Test_AutoDao {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto("Toyota","Etios","Blanco", "JAV 123");
		Auto auto2 = new Auto("Renault","Clio","Gris", "JAV 456");
		Auto auto3 = new Auto("Volkswagen","Fox","Negro", "JAV 789");
		
		AutoDAO auto_DAO = new AutoDAO();
		
		System.out.println("• INSERTAR: ");
		//auto_DAO.insertar_auto(auto1);
		//auto_DAO.insertar_auto(auto2);
		//auto_DAO.insertar_auto(auto3);
		
		System.out.println("");
		System.out.println("• BUSCAR: ");
		System.out.println(auto_DAO.buscarAuto(2));
		//System.out.println(auto_DAO.buscarAuto(100));
		
		System.out.println("");
		System.out.println("• ELIMINAR: ");
		//auto_DAO.eliminarAuto(1);
		//System.out.println(auto_DAO.buscarAuto(1));
		//auto_DAO.eliminarAuto(60);
		//System.out.println(auto_DAO.buscarAuto(100));
		
		
		System.out.println("");
		System.out.println("• UPDATE: ");
		Auto auto_update = auto_DAO.buscarAuto(2);
		auto_update.setMarca("Prueba");
		auto_update.setModelo("Prueba");
		auto_update.setColor("Prueba");
		auto_update.setPatente("Prueba");
		auto_DAO.modificarAuto(auto_update);
		
	}

}
