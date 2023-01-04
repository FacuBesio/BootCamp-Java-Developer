package com.educacionit.dao;

import com.educacionit.entities.Auto;

public class Test_AutoDao {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto("Toyota","Etios","Blanco", "JAV 123");
		Auto auto2 = new Auto("Renault","Clio","Gris", "JAV 456");
		Auto auto3 = new Auto("Volkswagen","Fox","Negro", "JAV 789");
		
		AutoDAO auto_DAO = new AutoDAO();
		auto_DAO.insertar_auto(auto1);
		auto_DAO.insertar_auto(auto2);
		auto_DAO.insertar_auto(auto3);

	}

}
