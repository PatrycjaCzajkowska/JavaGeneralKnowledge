package paczka23_IO;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		File f = new File("bang.txt");
//		System.out.println(f.exists());
//		System.out.println(f.isFile());
//		System.out.println(f.getAbsoluteFile());

		// program przyjmuje ścieżkę do folderu z konsoli i wypisuje jego zawartość
//		Scanner s = new Scanner(System.in);
//		File f = new File(s.nextLine());
//		if (f.isDirectory()) {
//			int i = 0;
//			for (File ff: f.listFiles()) {
//				System.out.println(++i + ".\t" + ff.getPath());
//			}
//		}
//		s.close();
	

	
	//program, który sprawdzi czy podany plik istnieje i jeśli nie to go utworzy
//	Scanner s = new Scanner(System.in);
//	File f = new File(s.nextLine());
//	try {
//		if (f.createNewFile()) {//createNewFile() zwraca true jeśli plik, który ma stworzyć nie istnieje, a false w przeciwnym wypadku
//			System.out.println("Plik został utworzony poprawnie");
//		}
//		else {
//			System.err.println("Plik juz istnieje");
//		}
//	}
//	catch (IOException ex) {
//		System.err.println(ex.getMessage());
//	}
//	s.close();
}
}	

