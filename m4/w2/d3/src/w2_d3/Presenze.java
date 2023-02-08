package w2_d3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Presenze {
	static File file = new File("presenze.txt");

	public static void main(String[] args) {
		try {
			scriviInFile("Mario_Rossi@5#Giorgio_Bianchi@7#Gianni_Verdi@15");
		} catch (IOException e) {
			System.out.println("Problema di scrittura");
		}

		try {
			leggiFile();
		} catch (IOException e) {
			System.out.println("Problema di lettura");
		}
	}

	public static String scriviInFile(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo, "UTF-8");
		return testo;
	}

	public static String leggiFile() throws IOException {
		String txtFile = FileUtils.readFileToString(file, "UTF-8");
		System.out.println(txtFile);
		return txtFile;
	}

}
