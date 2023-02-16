package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Partecipazione;

public class PartecipazioneDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d3_nuovo");
	static EntityManager em = emf.createEntityManager();

	public static void savePartec(Partecipazione partec) {
		em.getTransaction().begin();
		em.persist(partec);
		em.getTransaction().commit();
		System.out.println("Partecipazione aggiunto nel DB!");
	}

	public static Partecipazione getByIdPartec(int id) {
		em.getTransaction().begin();
		Partecipazione partec = em.find(Partecipazione.class, id);
		em.getTransaction().commit();
		return partec;
	}

	public static void refreshPartec(Partecipazione partec) {
		em.getTransaction().begin();
		em.merge(partec);
		em.getTransaction().commit();
		System.out.println("Partecipazione modificato nel DB!");
	}

	public static void deletePartec(Partecipazione partec) {
		em.getTransaction().begin();
		em.remove(partec);
		em.getTransaction().commit();
		System.out.println("Partecipazione eliminato dal DB!");
	}
}
