package paczka23c_IO;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		
		//klasa Fila-obsługuje foldery - metody mkdir() (tworzy tylko 1 folder) i mdirs()(jednym wywolaniem tworzy cale drzewo folderow) - tworzą nowe foldery
		//Ich użycie jest bardzo proste, ponieważ te metody nie podnoszą żadnych wyjątków, a jedynie zwracają wartość boolean, która określa czy utworzono folder, czy nie.

		File folder = new File(" nowyfolder");
		File foldery = new File("1/2/3/4/5/6/7/8/");
		
		if(folder.mkdir()) {
			System.out.println("Utworzyłam folder" + folder);
		}
		if(!folder.mkdirs()) {
			System.out.println("Nie utworzyłam folderów - nie ta metoda");
		}
		if(foldery.mkdirs()) {
			System.out.println("Utworzyłam mnóstwo folderów jedną komenfą");
		}
		
	}

}
