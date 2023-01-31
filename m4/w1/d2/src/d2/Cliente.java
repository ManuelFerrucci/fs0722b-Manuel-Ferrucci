package d2;

public class Cliente {
	int codiceCliente;
	String nomeCognome;
	String email;
	String dataIscrizione;

	public Cliente(int codiceCliente, String nomeCognome, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nomeCognome = nomeCognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
}
