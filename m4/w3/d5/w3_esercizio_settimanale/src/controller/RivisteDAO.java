package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Riviste;

public class RivisteDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d5");
	static EntityManager em = emf.createEntityManager();

	public static void salvaRivista(Riviste rivista) {
		try {
			em.getTransaction().begin();
			em.persist(rivista);
			em.getTransaction().commit();
			System.out.println("Rivista aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Riviste getByIdRivista(int id) {
		try {
			em.getTransaction().begin();
			Riviste libro = em.find(Riviste.class, id);
			em.getTransaction().commit();
			System.out.println("Rivista trovato " + libro);
			return libro;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void eliminaRivista(Riviste rivista) {
		try {
			em.getTransaction().begin();
			em.remove(em.contains(rivista) ? rivista : em.merge(rivista));
			em.getTransaction().commit();
			System.out.println("Rivista eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
