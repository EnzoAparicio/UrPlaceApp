package main;

import java.util.List;
import Model.userModel;
import jakarta.persistence.*;

public class Main {

	public static void main(String[] args) {
		DBConnection.obtenerConexion();
		String hql = "SELECT p FROM userModel p";
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("DBConnection");
		EntityManager entityManager = fabrica.createEntityManager();
		
		Query query = entityManager.createNamedQuery(hql);
		List<userModel> users = query.getResultList();
		for(userModel p: users) {
			System.out.println("Persona:" + p);
		}
	}

}