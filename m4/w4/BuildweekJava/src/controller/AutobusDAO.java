package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Autobus;

public class AutobusDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");

	public static void salvaAutobus(Autobus autobus) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(autobus);
			em.getTransaction().commit();
			System.out.println("Autobus aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Autobus getByIdAutobus(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Autobus autobus = em.find(Autobus.class, id);
			em.getTransaction().commit();
			System.out.println("Autobus trovato " + autobus);
			return autobus;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaAutobus(Autobus autobus) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(autobus);
			em.getTransaction().commit();
			System.out.println("Autobus modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaAutobus(int idAutobus) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Autobus autobus = em.find(Autobus.class, idAutobus);
			em.remove(autobus);
			em.getTransaction().commit();
			System.out.println("Autobus eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	// prima occorre fare getbyid ad autobus da passare come parametro
	public static void scendeUnUtente(Autobus autobus) {
		if (autobus.getPostiUtilizzatiMezzoDiTrasporto() > 0) {
			autobus.setPostiUtilizzatiMezzoDiTrasporto(autobus.getPostiUtilizzatiMezzoDiTrasporto() - 1);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(autobus);
				em.getTransaction().commit();
				System.out.println("Dall'autobus con ID " + autobus.getIdMezzoDiTrasporto() + " scende un utente!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println("Sull'autobus non viaggia alcun utente!");
		}
	}

	// prima occorre fare getbyid ad autobus da passare come parametro
	public static void scendonoTuttiGliUtenti(Autobus autobus) {
		if (autobus.getPostiUtilizzatiMezzoDiTrasporto() > 0) {
			autobus.setPostiUtilizzatiMezzoDiTrasporto(0);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(autobus);
				em.getTransaction().commit();
				System.out.println(
						"Dall'autobus con ID " + autobus.getIdMezzoDiTrasporto() + " sono scesi tutti gli utenti!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println("Sull'autobus non viaggia alcun utente!");
		}
	}
}
