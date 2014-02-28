package SortedTextFile;

import java.io.FileNotFoundException;
import java.io.IOException;


public class MainClass {

	public static void main(String[] args) throws IOException {
		
		SortedTextFile s = new SortedTextFile("Archivo","ArchivoGuardado.txt");
		System.out.println("Archive name: "+s.getName());
		s.put("3 Linea 3");
		s.put("6 Linea 6");
		
	}

}
