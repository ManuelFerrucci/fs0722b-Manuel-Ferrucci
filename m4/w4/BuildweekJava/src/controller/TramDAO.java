package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tram;

public class TramDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");

	public static void salvaTram(Tram tram) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(tram);
			em.getTransaction().commit();
			System.out.println("Tram aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Tram getByIdTram(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Tram tram = em.find(Tram.class, id);
			em.getTransaction().commit();
			System.out.println("Tram trovato " + tram);
			return tram;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaTram(Tram tram) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(tram);
			em.getTransaction().commit();
			System.out.println("Tram modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaTram(int idTram) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Tram tram = em.find(Tram.class, idTram);
			em.remove(tram);
			em.getTransaction().commit();
			System.out.println("Tram eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	// prima occorre fare getbyid ad autobus da passare come parametro
	public static void scendeUnUtente(Tram tram) {
		if (tram.getPostiUtilizzatiMezzoDiTrasporto() > 0) {
			tram.setPostiUtilizzatiMezzoDiTrasporto(tram.getPostiUtilizzatiMezzoDiTrasporto() - 1);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(tram);
				em.getTransaction().commit();
				System.out.println("Dal tram con ID " + tram.getIdMezzoDiTrasporto() + " scende un utente!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println("Sul tram non viaggia alcun utente!");
		}
	}

	// prima occorre fare getbyid ad autobus da passare come parametro
	public static void scendonoTuttiGliUtenti(Tram tram) {
		if (tram.getPostiUtilizzatiMezzoDiTrasporto() > 0) {
			tram.setPostiUtilizzatiMezzoDiTrasporto(0);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(tram);
				em.getTransaction().commit();
				System.out.println("Dal tram con ID " + tram.getIdMezzoDiTrasporto() + " sono scesi tutti gli utenti!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println("Sul tram non viaggia alcun utente!");
		}
	}
}
