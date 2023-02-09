package w2_d4;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Negozio {

	public static void main(String[] args) {
		List<Product> listaProdottiGenerale = new ArrayList<Product>();
		List<Product> listaProdottiManuel = new ArrayList<Product>();
		List<Product> listaProdottiDamiano = new ArrayList<Product>();
		List<Product> listaProdottiStefano = new ArrayList<Product>();

		List<Order> listaOrdiniGenerale = new ArrayList<Order>();
		List<Order> listaOrdiniManuel = new ArrayList<Order>();
		List<Order> listaOrdiniDamiano = new ArrayList<Order>();
		List<Order> listaOrdiniStefano = new ArrayList<Order>();

		// CUSTOMER
		Customer manuel = new Customer(1L, "Manuel", 1);
		Customer damiano = new Customer(2L, "Damiano", 1);
		Customer stefano = new Customer(3L, "Francesco", 1);

		Product libro = new Product(1L, "il libro", "Books", 110.3);
		Product libro2 = new Product(2L, "il libro2", "Books", 9.4);
		Product libro3 = new Product(2L, "il libro3", "Books", 234.6);
		Product baby = new Product(3L, "il baby", "Baby", 156.7);
		Product baby2 = new Product(4L, "il baby2", "Baby", 354.4);
		Product boys = new Product(5L, "il boys", "Boys", 224.5);
		Product boys2 = new Product(6L, "il boys2", "Boys", 7.8);

		listaProdottiGenerale.add(libro);
		listaProdottiGenerale.add(libro2);
		listaProdottiGenerale.add(libro3);
		listaProdottiGenerale.add(baby);
		listaProdottiGenerale.add(baby2);
		listaProdottiGenerale.add(boys);
		listaProdottiGenerale.add(boys2);

		listaProdottiManuel.add(libro);
		listaProdottiManuel.add(baby);
		listaProdottiManuel.add(boys);

		listaProdottiDamiano.add(libro2);
		listaProdottiDamiano.add(baby2);
		listaProdottiDamiano.add(boys2);

		listaProdottiStefano.add(libro3);

		Order ordine1 = new Order(11L, "Ordinato", new Date(2021 - 03 - 23), new Date(2021 - 03 - 23),
				listaProdottiManuel, manuel);
		Order ordine2 = new Order(12L, "Ordinato", new Date(2021 - 03 - 23), new Date(2021 - 03 - 23),
				listaProdottiDamiano, damiano);
		Order ordine3 = new Order(13L, "Ordinato", new Date(2021 - 03 - 23), new Date(2021 - 03 - 23),
				listaProdottiStefano, stefano);
		Order ordine4 = new Order(14L, "Ordinato", new Date(2021 - 03 - 23), new Date(2021 - 03 - 23),
				listaProdottiManuel, manuel);
		Order ordine5 = new Order(15L, "Ordinato", new Date(2021 - 03 - 23), new Date(2021 - 03 - 23),
				listaProdottiDamiano, damiano);

		listaOrdiniGenerale.add(ordine1);
		listaOrdiniGenerale.add(ordine2);
		listaOrdiniGenerale.add(ordine3);
		listaOrdiniGenerale.add(ordine4);
		listaOrdiniGenerale.add(ordine5);

		listaOrdiniManuel.add(ordine1);
		listaOrdiniManuel.add(ordine4);
		listaOrdiniDamiano.add(ordine2);
		listaOrdiniDamiano.add(ordine5);
		listaOrdiniStefano.add(ordine3);

		
		
		// ESERCIZIO 1
		libriCostosi(listaProdottiGenerale);

		// ESERCIZIO 2
		prodottiBaby(listaProdottiGenerale);

		// ESERCIZIO 3
		prodottiBoysSconto(listaProdottiGenerale);

	}

	public static void libriCostosi(List<Product> listaPrimaria) {
		Stream<Product> listaBooksCostosi = listaPrimaria.stream()
				.filter(ele -> ele.getCategory().equalsIgnoreCase("Books") && ele.getPrice() > 100);

		List<Product> listaProdottiBooksCostosi = new ArrayList<Product>();
		listaBooksCostosi.forEach(ele -> {
			listaProdottiBooksCostosi.add(ele);
			System.out.println("I libri piu costosi della categoria Books sono " + ele.getName());
		});
		System.out.println("-----------------------------------------------------------------");
	}

	public static void prodottiBaby(List<Product> listaPrimaria) {
		Stream<Product> listaBaby = listaPrimaria.stream().filter(ele -> ele.getCategory().equalsIgnoreCase("Baby"));

		List<Product> listaProdottiBabys = new ArrayList<Product>();
		listaBaby.forEach(ele -> {
			listaProdottiBabys.add(ele);
			System.out.println("I prodotti della categoria Baby sono " + ele.getName());
		});
		System.out.println("-----------------------------------------------------------------");
	}

	public static void prodottiBoysSconto(List<Product> listaPrimaria) {
		Stream<Product> streamBoys = listaPrimaria.stream().filter(ele -> ele.getCategory().equalsIgnoreCase("Boys"));

		List<Product> listaProdottiBoys = streamBoys.collect(Collectors.toList());
		listaProdottiBoys.forEach(ele -> {
			ele.setPrice(ele.getPrice() * 0.9);
		});
		System.out.println("-----------------------------------------------------------------");
	}
}
