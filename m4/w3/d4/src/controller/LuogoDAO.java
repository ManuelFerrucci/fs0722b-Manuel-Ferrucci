package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Luogo;

public class LuogoDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d3_nuovo");
	static EntityManager em = emf.createEntityManager();

	public static void saveLu(Luogo lu) {
		em.getTransaction().begin();
		em.persist(lu);
		em.getTransaction().commit();
		System.out.println("Luogo aggiunto nel DB!");
	}

	public static Luogo getByIdLu(int id) {
		em.getTransaction().begin();
		Luogo lu = em.find(Luogo.class, id);
		em.getTransaction().commit();
		return lu;
	}

	public static void refreshLu(Luogo lu) {
		em.getTransaction().begin();
		em.merge(lu);
		em.getTransaction().commit();
		System.out.println("Luogo modificato nel DB!");
	}

	public static void deleteLu(Luogo lu) {
		em.getTransaction().begin();
		em.remove(lu);
		em.getTransaction().commit();
		System.out.println("Luogo eliminato dal DB!");
	}
}
