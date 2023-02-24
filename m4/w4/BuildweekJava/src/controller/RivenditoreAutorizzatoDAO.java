package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.RivenditoreAutorizzato;

public class RivenditoreAutorizzatoDAO {
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");
	
	public static void salvaRivenditoreAutorizzato(RivenditoreAutorizzato rivenditore) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(rivenditore);
			em.getTransaction().commit();
			System.out.println("Rivenditore Autorizzato aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static RivenditoreAutorizzato getByIdRivenditoreAutorizzato(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			RivenditoreAutorizzato rivenditore = em.find(RivenditoreAutorizzato.class, id);
			em.getTransaction().commit();
			System.out.println("Rivenditore Autorizzato trovato " + rivenditore);
			return rivenditore;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}
	
	public static void modificaRivenditoreAutorizzato(RivenditoreAutorizzato rivenditore) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(rivenditore);
			em.getTransaction().commit();
			System.out.println("Rivenditore Autorizzato modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaRivenditoreAutorizzato(int idRivenditoreAutorizzato) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			RivenditoreAutorizzato rivenditore = em.find(RivenditoreAutorizzato.class, idRivenditoreAutorizzato);
			em.remove(rivenditore);
			em.getTransaction().commit();
			System.out.println("Rivenditore Autorizzato eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
