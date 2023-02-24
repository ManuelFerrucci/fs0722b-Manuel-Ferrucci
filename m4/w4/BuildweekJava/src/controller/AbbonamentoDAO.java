package controller;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import enums.StatoBiglietto;
import model.Abbonamento;
import model.Autobus;
import model.Biglietto;
import model.Tram;

public class AbbonamentoDAO {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BuildweekJava");

	public static void salvaAbbonamento(Abbonamento abb) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(abb);
			em.getTransaction().commit();
			System.out.println("Abbonamento aggiunto nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static Abbonamento getByIdAbbonamento(int id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Abbonamento abb = em.find(Abbonamento.class, id);
			em.getTransaction().commit();
			System.out.println("Abbonamento trovato " + abb);
			return abb;
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
		return null;
	}

	public static void modificaAbbonamento(Abbonamento abb) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(abb);
			em.getTransaction().commit();
			System.out.println("Abbonamento modificato nel DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static void eliminaAbbonamento(int idAbb) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Abbonamento abb = em.find(Abbonamento.class, idAbb);
			em.remove(abb);
			em.getTransaction().commit();
			System.out.println("Utente eliminato dal DB!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}

	// prima occorre fare getbyid ad autobus e abbonamento da passare come parametri
	public static void vidimaAbbonamentoAutobus(Autobus autobus, Abbonamento abbonamento) {
		Calendar current = Calendar.getInstance();
		if (autobus.getPostiUtilizzatiMezzoDiTrasporto() < autobus.getCapienzaMassimaAutobus()
				&& abbonamento.getDataFineAbbonamento().compareTo(current.getTime()) > 0) {
			autobus.setPostiUtilizzatiMezzoDiTrasporto(autobus.getPostiUtilizzatiMezzoDiTrasporto() + 1);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(autobus);
				em.getTransaction().commit();
				System.out.println("Abbonamento con ID " + abbonamento.getIdTitoloDiViaggio() + " rilevato!");
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

	// prima occorre fare getbyid ad tram e abbonamento da passare come parametri
	public static void vidimaAbbonamentoTram(Tram tram, Abbonamento abbonamento) {
		Calendar current = Calendar.getInstance();
		if (tram.getPostiUtilizzatiMezzoDiTrasporto() < tram.getCapienzaMassimaTram()
				&& (abbonamento.getDataFineAbbonamento().compareTo(current.getTime())) > 0) {
			tram.setPostiUtilizzatiMezzoDiTrasporto(tram.getPostiUtilizzatiMezzoDiTrasporto() + 1);
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(tram);
				em.getTransaction().commit();
				System.out.println("Abbonamento con ID " + abbonamento.getIdTitoloDiViaggio() + " rilevato!");
				System.out.println("Tram con ID " + tram.getIdMezzoDiTrasporto() + " ha accolto un nuovo utente!");
			} catch (Exception ec) {
				em.getTransaction().rollback();
				System.out.println(ec.getMessage());
			} finally {
				em.close();
			}
		} else {
			System.out.println(
					"Non possibile salire sul tram, probabilmente il tuo abbonamento risulta scaduto oppure il tram ha raggiunto la capienza massima.");
		}
	}
}
