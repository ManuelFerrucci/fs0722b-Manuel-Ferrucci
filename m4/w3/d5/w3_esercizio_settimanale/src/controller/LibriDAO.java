package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Libri;

public class LibriDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d5");
	static EntityManager em = emf.createEntityManager();

	public static void salvaLibro(Libri libro) {
		try {
			em.getTransaction().begin();
			em.persist(libro);
			em.getTransaction().commit();
			System.out.println("Libro aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Libri getByIdLibro(int id) {
		try {
			em.getTransaction().begin();
			Libri libro = em.find(Libri.class, id);
			em.getTransaction().commit();
			System.out.println("Libro trovato " + libro);
			return libro;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void eliminaLibro(Libri libro) {
		try {
			em.getTransaction().begin();
			em.remove(em.contains(libro) ? libro : em.merge(libro));
			em.getTransaction().commit();
			System.out.println("Libro eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
