package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Utente;

public class UtenteDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");

	public static void salvaUtente(Utente utente) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(utente);
			em.getTransaction().commit();
			System.out.println("Utente aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Utente getByIdUtente(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Utente utente = em.find(Utente.class, id);
			em.getTransaction().commit();
			System.out.println("Utente trovato " + utente);
			return utente;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaUtente(Utente utente) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(utente);
			em.getTransaction().commit();
			System.out.println("Utente modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaUtente(int idUtente) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Utente utente = em.find(Utente.class, idUtente);
			em.remove(utente);
			em.getTransaction().commit();
			System.out.println("Utente eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
