package paczka5_instrukcjaSwitch;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int liczba = Integer.parseInt(s.nextLine());
		s.close();
		
		
		
		//można sprawdzać tylko wartość String i int

		switch (liczba) {
		case 1:

			System.out.println("");
			System.out.println("Hello");
			System.out.println("");

		case 2:
			break;

		default:
			System.out.println("Nic nie pasuje");
			
		}

		
		int wiek = 50;
		
		switch(wiek) {
		case 10:
			System.out.println("nieletni");
			break;
		case 50:
			System.out.println("stary");
			System.out.println("dziadek");
			break;
		case 18:
			System.out.println("pełnoletni");
			break;
		}
		
		
	}

}
