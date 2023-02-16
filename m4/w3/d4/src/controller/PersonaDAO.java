package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Persona;

public class PersonaDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d3_nuovo");
	static EntityManager em = emf.createEntityManager();

	public static void savePers(Persona pers) {
		em.getTransaction().begin();
		em.persist(pers);
		em.getTransaction().commit();
		System.out.println("Persona aggiunto nel DB!");
	}

	public static Persona getByIdPers(int id) {
		em.getTransaction().begin();
		Persona pers = em.find(Persona.class, id);
		em.getTransaction().commit();
		return pers;
	}

	public static void refreshPers(Persona pers) {
		em.getTransaction().begin();
		em.merge(pers);
		em.getTransaction().commit();
		System.out.println("Persona modificato nel DB!");
	}

	public static void deletePers(Persona pers) {
		em.getTransaction().begin();
		em.remove(pers);
		em.getTransaction().commit();
		System.out.println("Persona eliminato dal DB!");
	}
}
