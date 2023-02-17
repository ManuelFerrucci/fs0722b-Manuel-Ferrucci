package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Prestiti;

public class PrestitiDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d5");
	static EntityManager em = emf.createEntityManager();

	public static void salvaPrestito(Prestiti prestito) {
		try {
			em.getTransaction().begin();
			em.persist(prestito);
			em.getTransaction().commit();
			System.out.println("Prestito aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Prestiti getByIdPrestito(int id) {
		try {
			em.getTransaction().begin();
			Prestiti prestito = em.find(Prestiti.class, id);
			em.getTransaction().commit();
			System.out.println("Prestito trovato " + prestito);
			return prestito;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaPrestito(Prestiti prestito) {
		try {
			em.getTransaction().begin();
			em.merge(prestito);
			em.getTransaction().commit();
			System.out.println("Prestito modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaPrestito(Prestiti prestito) {
		try {
			em.getTransaction().begin();
			em.remove(em.contains(prestito) ? prestito : em.merge(prestito));
			em.getTransaction().commit();
			System.out.println("Prestito eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
