package paczka2a_scanner;


public class Test {

	
	int ilosc = 0;
	
	public static void main(String[] args) {
		
		
		
		IloscStronKsiazki obiekt = new IloscStronKsiazki();
		int a=obiekt.wypiszIloscStron();
		

		System.out.println("Książka ma: "+a+" stron");
	}

}
