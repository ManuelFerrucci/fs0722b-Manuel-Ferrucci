package controller;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import enums.StatoBiglietto;
import model.Autobus;
import model.Biglietto;
import model.Tram;

public class BigliettoDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");

	public static void salvaBiglietto(Biglietto biglietto) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(biglietto);
			em.getTransaction().commit();
			System.out.println("Biglietto aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Biglietto getByIdBiglietto(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Biglietto biglietto = em.find(Biglietto.class, id);
			em.getTransaction().commit();
			System.out.println("Biglietto trovato " + biglietto);
			return biglietto;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaBiglietto(Biglietto biglietto) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(biglietto);
			em.getTransaction().commit();
			System.out.println("Biglietto modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaBiglietto(int idBiglietto) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Biglietto biglietto = em.find(Biglietto.class, idBiglietto);
			em.remove(biglietto);
			em.getTransaction().commit();
			System.out.println("Biglietto eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	// prima occorre fare getbyid ad autobus e biglietto da passare come parametri
	public static void vidimaBigliettoAutobus(Autobus autobus, Biglietto biglietto) {
		Calendar current = Calendar.getInstance();
		if (autobus.getPostiUtilizzatiMezzoDiTrasporto() < autobus.getCapienzaMassimaAutobus()
				&& biglietto.getStatoBiglietto().equals(StatoBiglietto.Attivo)) {
			biglietto.setDataVidimazioneBiglietto(current.getTime());
			biglietto.setStatoBiglietto(StatoBiglietto.GiaUtilizzato);
			autobus.setPostiUtilizzatiMezzoDiTrasporto(autobus.getPostiUtilizzatiMezzoDiTrasporto() + 1);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(biglietto);
				em.merge(autobus);
				em.getTransaction().commit();
				System.out.println("Biglietto con ID " + biglietto.getIdTitoloDiViaggio() + " vidimato!");
				System.out
						.println("Autobus con ID " + autobus.getIdMezzoDiTrasporto() + " ha accolto un nuovo utente!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println(
					"Non possibile salire sull'autobus, probabilmente il tuo biglietto risulta vidimato oppure l'autobus ha raggiunto la capienza massima.");
		}
	}

	// prima occorre fare getbyid ad tram e biglietto da passare come parametri
	public static void vidimaBigliettoTram(Tram tram, Biglietto biglietto) {
		Calendar current = Calendar.getInstance();
		if (tram.getPostiUtilizzatiMezzoDiTrasporto() < tram.getCapienzaMassimaTram()
				&& biglietto.getStatoBiglietto().equals(StatoBiglietto.Attivo)) {
			biglietto.setStatoBiglietto(StatoBiglietto.GiaUtilizzato);
			biglietto.setDataVidimazioneBiglietto(current.getTime());
			tram.setPostiUtilizzatiMezzoDiTrasporto(tram.getPostiUtilizzatiMezzoDiTrasporto() + 1);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(biglietto);
				em.merge(tram);
				em.getTransaction().commit();
				System.out.println("Biglietto con ID " + biglietto.getIdTitoloDiViaggio() + " vidimato!");
				System.out.println("Tram con ID " + tram.getIdMezzoDiTrasporto() + " ha accolto un nuovo utente!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println(
					"Non possibile salire sul tram, probabilmente il tuo biglietto risulta vidimato oppure il tram ha raggiunto la capienza massima.");
		}
	}
}
