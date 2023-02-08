package w2_d3;

public class Ese1 extends Thread {
	private String message;

	public Ese1(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Test_thread - Messaggio numero " + (i + 1) + " : " + message);
			try {
				Thread.sleep(1000); // sleep per ritardare un processo
			} catch (InterruptedException e) {
				System.out.println("ERRORE DI INTERRUZIONE");
			}
		}
	}
}
