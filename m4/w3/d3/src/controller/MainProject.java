package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Evento;

public class MainProject {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("w3_d3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		Evento evento1 = new Evento();
		evento1.setTitolo_evento("Ciao");
		evento1.setDataEvento("2023-03-25");
		evento1.setDescrizione_evento("Evento bellissimo");
		evento1.setTipoEv("PUBBLICO");
		evento1.setNumeroMassimoPartecipanti_evento(50);
		evento1.setLuogoEvento("Roma");
		
		save(evento1);
		
	}

	public static void save(Evento evento) {
		em.getTransaction().begin();
		em.persist(evento);
		em.getTransaction().commit();
		System.out.println("Evento aggiunto nel DB!");
	}
}
