package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Evento;

public class EventoDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d2");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		Evento evento1 = new Evento();
		evento1.setTitolo("Evento bellissimo");
		evento1.setData_evento("12/3/2023");
		evento1.setTipo_evento("PRIVATO");
		evento1.setNumero_massimo_partecipanti(50);
		
		Evento evento2 = new Evento();
		evento2.setTitolo("Evento bruttissimo");
		evento2.setData_evento("23/5/2024");
		evento2.setTipo_evento("PUBBLICO");
		evento2.setNumero_massimo_partecipanti(300);
		
		// save(evento1);
		// save(evento2);

	}

	public static void save(Evento ev) {
		em.getTransaction().begin();
		em.persist(ev);
		em.getTransaction().commit();
		System.out.println("Evento aggiunto ne DB!");
	}

	public static Evento getById(int id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static void refresh(Evento ev) {
		em.getTransaction().begin();
		em.merge(ev);
		em.getTransaction().commit();
		System.out.println("Evento modificato ne DB!");
	}

	public static void delete(Evento ev) {
		em.getTransaction().begin();
		em.remove(ev);
		em.getTransaction().commit();
		System.out.println("Evento eliminato ne DB!");
	}
}
