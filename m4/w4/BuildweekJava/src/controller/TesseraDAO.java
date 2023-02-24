package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tessera;

public class TesseraDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");
	
	public static void salvaTessera(Tessera tessera) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(tessera);
			em.getTransaction().commit();
			System.out.println("Tessera aggiunta nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Tessera getByIdTessera(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Tessera tessera = em.find(Tessera.class, id);
			em.getTransaction().commit();
			System.out.println("Tessera trovata " + tessera);
			return tessera;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}
	
	public static void modificaTessera(Tessera tessera) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(tessera);
			em.getTransaction().commit();
			System.out.println("Tessera modificata nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaTessera(int idTessera) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Tessera tessera = em.find(Tessera.class, idTessera);
			em.remove(tessera);
			em.getTransaction().commit();
			System.out.println("Tessera eliminata dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}
