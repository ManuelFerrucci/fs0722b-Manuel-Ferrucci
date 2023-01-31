package d2;

public class Rettangolo {
	double base;
	double altezza;

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double calcolaPerimetroRettangolo() {
		return (this.base + this.altezza) * 2;
	}

	public double calcolaAreaRettangolo() {
		return (this.base * this.altezza) / 2;
	}
}
