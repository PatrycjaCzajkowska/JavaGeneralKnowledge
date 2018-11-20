package paczka2a_scanner;

import java.util.Scanner;

public class IloscStronKsiazki {
	
	public Integer wypiszIloscStron() {
		Scanner s = new Scanner(System.in);
		System.out.println("Wpisz ile stron posiada książka:");
		int ilosc=s.nextInt();
		return ilosc;
		
	}

}
