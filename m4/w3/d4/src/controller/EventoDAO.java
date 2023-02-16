package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Evento;

public class EventoDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d3_nuovo");
	static EntityManager em = emf.createEntityManager();
	
	public static void saveEv(Evento ev) {
		em.getTransaction().begin();
		em.persist(ev);
		em.getTransaction().commit();
		System.out.println("Evento aggiunto nel DB!");
	}

	public static Evento getByIdEv(int id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static void refreshEv(Evento ev) {
		em.getTransaction().begin();
		em.merge(ev);
		em.getTransaction().commit();
		System.out.println("Evento modificato nel DB!");
	}

	public static void deleteEv(Evento ev) {
		em.getTransaction().begin();
		em.remove(ev);
		em.getTransaction().commit();
		System.out.println("Evento eliminato dal DB!");
	}
}
