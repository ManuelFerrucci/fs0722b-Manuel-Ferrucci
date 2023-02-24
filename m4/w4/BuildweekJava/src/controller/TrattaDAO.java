package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tratta;

public class TrattaDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");

	public static void salvaTratta(Tratta tratta) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(tratta);
			em.getTransaction().commit();
			System.out.println("Tratta aggiunta nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Tratta getByIdTratta(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Tratta tratta = em.find(Tratta.class, id);
			em.getTransaction().commit();
			System.out.println("Biglietto trovato " + tratta);
			return tratta;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaTratta(Tratta tratta) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(tratta);
			em.getTransaction().commit();
			System.out.println("Tratta modificata nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaTratta(int idTratta) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Tratta tratta = em.find(Tratta.class, idTratta);
			em.remove(tratta);
			em.getTransaction().commit();
			System.out.println("Tratta eliminata dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
