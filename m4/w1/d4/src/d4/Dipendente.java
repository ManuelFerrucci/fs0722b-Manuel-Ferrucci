package d4;

import d4.Dipartimento.xDipartimento;
import d4.Livello.xLivello;

public class Dipendente {

	private String nome;
	public static double stipendioBase = 1000;
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private xLivello liv;
	private xDipartimento dip;

	public static void main(String[] args) {
		Dipendente marioRossi = new Dipendente("Mario Rossi", 1, xDipartimento.PRODUZIONE);
		Dipendente marcoVerdi = new Dipendente("Marco Verdi", 2, xDipartimento.PRODUZIONE);
		Dipendente massimoGialli = new Dipendente("Massimo Gialli", 3, stipendioBase * 1.2, xLivello.IMPIEGATO,
				xDipartimento.AMMINISTRAZIONE);
		Dipendente lucaBianchi = new Dipendente("Luca Bianchi", 4, stipendioBase * 2, xLivello.DIRIGENTE,
				xDipartimento.VENDITE);

		marcoVerdi.promuovi();
		System.out.println("---------------------------------------"); // separatore
		massimoGialli.promuovi();
		System.out.println("---------------------------------------"); // separatore

		marioRossi.stampaDatiDipendente();
		marcoVerdi.stampaDatiDipendente();
		massimoGialli.stampaDatiDipendente();
		lucaBianchi.stampaDatiDipendente();

		double stipendiTotali = (calcolaPaga(marioRossi) + calcolaPagaStraord(marioRossi, 5))
				+ (calcolaPaga(marcoVerdi) + calcolaPagaStraord(marcoVerdi, 5))
				+ (calcolaPaga(massimoGialli) + calcolaPagaStraord(massimoGialli, 5))
				+ (calcolaPaga(lucaBianchi) + calcolaPagaStraord(lucaBianchi, 5));

		System.out.println("Gli stipendi dovuti dall'azienda, comprensivo di straordinari, ammonta a " + stipendiTotali
				+ " euro!");

	}

	public Dipendente(String nome, int matricola, double stipendio, xLivello liv, xDipartimento dip) {
		this.nome = nome;
		this.stipendio = stipendio;
		this.matricola = matricola;
		this.liv = liv;
		this.dip = dip;
	}

	public Dipendente(String nome, int matricola, xDipartimento dip) {
		this.nome = nome;
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.liv = xLivello.OPERAIO;
		this.dip = dip;

	}

	public void stampaDatiDipendente() {
		System.out.println("Dati dipendente:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricola: " + this.matricola);
		System.out.println("Stipendio: " + this.stipendio + " euro");
		System.out.println("Livello: " + this.liv);
		System.out.println("Dipartimento: " + this.dip);
		System.out.println("---------------------------------------"); // separatore
	}

	public void promuovi() {
		if (this.liv == xLivello.OPERAIO) {
			this.liv = xLivello.IMPIEGATO;
			this.dip = xDipartimento.AMMINISTRAZIONE;
			this.stipendio = stipendioBase * 1.2;
			System.out.println(this.nome + " ha avuto una promozione!");
		} else if (this.liv == xLivello.IMPIEGATO) {
			this.liv = xLivello.QUADRO;
			this.dip = xDipartimento.AMMINISTRAZIONE;
			this.stipendio = stipendioBase * 1.5;
			System.out.println(this.nome + " ha avuto una promozione!");
		} else if (this.liv == xLivello.QUADRO) {
			this.liv = xLivello.DIRIGENTE;
			this.dip = xDipartimento.VENDITE;
			this.stipendio = stipendioBase * 2;
			System.out.println(this.nome + " ha avuto una promozione!");
		} else if (this.liv == xLivello.DIRIGENTE) {
			this.liv = xLivello.DIRIGENTE;
			System.out.println("Il dirigente è il massimo livello raggiungibile!");
		}
	}

	public static double calcolaPaga(Dipendente x) {
		// System.out.println("Lo stipendio di " + x.nome + " ammonta a " + x.stipendio
		// + " euro!");
		return x.stipendio;
	}

	public static double calcolaPagaStraord(Dipendente x, int ore) {
		double importoStraordinari = x.importoOrarioStraordinario * ore;
		if (ore != 0) {
			// System.out.println("Importo straordinari maturati da " + x.nome + ": " +
			// importoStraordinari + " euro!");
		} else {
			System.out.println("Non sono presenti straordinari maturati");
		}
		return (importoStraordinari);
	}

}
