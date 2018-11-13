package paczka7_tablice;

public class Test {

	public static void main(String[] args) {
		

		//#######tablica jednowymiarowa - tablica to obiekt
		
		//typPrzechowywany [] nazwaTablicy = new typPrzechowywany[ilośćEmentów-indeks-wyłącznie liczba]
		//Typ int w Javie nie może przyjąć wartości NULL (bo nie przechowuje wskaźnika tylko wartość). Stąd 0 w nie azinicjowanych elementach tablicy
		
		System.out.println("Pierwsza tablica");
		
		
		int[] tablicaIntow = new int[5];
		tablicaIntow[0] = 12;
		tablicaIntow[1] = 4;
		tablicaIntow[2] = 222;
		for(int i=0;i<tablicaIntow.length;i++) {
			System.out.println("tablica["+i+"] = "+ tablicaIntow[i] );
		
		}
		
		System.out.println("Druga tablica");
		
		int[] tablicaIntow2 = {34,22,34,23,4,324};
		
		for(int i = 0;i<tablicaIntow2.length;i++) {
			System.out.println("tablica["+i+"] = "+ tablicaIntow2[i] );
		}
		
		
	}

}
