package paczka7_tablice;

public class Test {

	public static void main(String[] args) {
		

		//#######tablica jednowymiarowa - czyli posiadająca tylko długość
		//tablica to obiekt
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
		
		
		//#######tablica wielowymiarowa - używana np. do tworzenia JTable w Swingu
		
		System.out.println("Trzecia tablica");
		char[][] alfabet = new char[5][7];//5 wierszy, 7 kolumn
		
		for(int i = 0;i<alfabet.length; i++) {
			for(int j=0; j<alfabet[i].length;j++) {
				System.out.print("["+i+"]["+j+"]"+"\t");
			}
			System.out.println();
		}
//		System.out.println("Czwarta tablica");
//		
//        char[][] alfabet2 = new char[7][12];//5 wierszy, 7 kolumn
//		
//		for(int i = 0;i<alfabet2.length; i++) {
//			for(int j=0; j<alfabet2[i].length;j++) {
//				char znak = (char)(alfabet2.length*i+ 'A'+j);
//				alfabet[i][j]=znak;
//				System.out.print(znak + " ");
//			}
//			System.out.println();
			
			System.out.println("Piąta tablica");//szarpana-nie ma stałego wymiaru
			
			int[][] alfabet3= {
					{12,436,565,4,46},
					{344,34,34},
					{343,5,454,34,5,34,4545}
			};
			for(int i2=0;i2<alfabet3.length;i2++) {
				for(int j=0;j<alfabet[i2].length;j++) {
					System.out.print(alfabet3[i2][j]+"\t");
				}
				System.out.println();
			
			
		}
	}

}
