package paczka23b_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {

		//program wczytuje całą zawartość pliku do pamięci, a następnie wyświetla ją na ekran
        //klasa String została tak napisana, że używa jej się tak samo jak typów nieobiektowych – tzn. każda operacja na obiekcie String tworzy obiekt
		//w trakcie pętli dla każdej linii powstaje nowy obiekt
		//klasy StringBuilder (lub jej starszego brata – StringBuffer)-dobranie się do tablicy znaków, którą zawiera w sobie String i modyfikację jej bez tworzenia nowego obiektu
		//W klasach StringBuilder i StringBuffer zdefiniowano metodę append(), która modyfikuje zawartość String’a bez tworzenia nowego obiektu
		File f = new File("bulk.txt");
		System.out.println("Plik " + f.getPath() + "-" + (f.length()/(1024.0*1024))+"MB");
	String zawartoscPliku ="";
	try(BufferedReader in = new BufferedReader(new FileReader(f));){
		String line;
		StringBuilder sbs = new StringBuilder();
		while ((line = in.readLine()) !=null) {
//			zawartoscPliku  +=line;//konkatenacja tekstu
//		}
//		System.out.println(zawartoscPliku);
	sbs.append(line).append("\n");
		}
		System.out.println(sbs.toString());
		}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

	
	
	
}
