package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DistributoreAutomatico;

public class DistributoreAutomaticoDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");
	
	public static void salvaDistributoreAutomatico(DistributoreAutomatico distributore) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(distributore);
			em.getTransaction().commit();
			System.out.println("Distributore Automatico aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static DistributoreAutomatico getByIdDistributoreAutomatico(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			DistributoreAutomatico distributore = em.find(DistributoreAutomatico.class, id);
			em.getTransaction().commit();
			System.out.println("Distributore Automatico trovato " + distributore);
			return distributore;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}
	
	public static void modificaDistributoreAutomatico(DistributoreAutomatico distributore) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(distributore);
			em.getTransaction().commit();
			System.out.println("Distributore Automatico modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaDistributoreAutomatico(int idDistributoreAutomatico) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			DistributoreAutomatico distributore = em.find(DistributoreAutomatico.class, idDistributoreAutomatico);
			em.remove(distributore);
			em.getTransaction().commit();
			System.out.println("Distributore Automatico eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
