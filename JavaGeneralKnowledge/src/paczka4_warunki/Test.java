package paczka4_warunki;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		int liczba = Integer.parseInt(s.nextLine());
		s.close();
		
//		WARUNEK POJEDYŃCZY
		
		if (liczba==3)  {//blok rodzic to {}  -działa te bez klamr //program widzi tylko instrukcje w bloku
		System.out.println("Wprowadziłeś moją ulubioną liczbę");
		int nowaZmienna = 3;
		System.out.println(nowaZmienna);
		}
		
		
		//WARUNEK PRZECIWNY
		
		if(liczba!=3) {
			System.out.println("Wprowadziłeś moją ulubioną liczbę");
		}
		else {
			System.out.println("Nie wprowadziłeś mojej ulubionej liczbt");
		}
		
		//KILKA WARUNKÓW   //program przerywa sprawdzanie po znalezieniu 1 pasjącego warunku
		
		if(liczba<=3 && liczba>=0) {
			System.out.println("Wprowadziłeś moją ulubioną liczbę");
		}
		else if(liczba==2 || liczba==-3) {
			System.out.println("Wprowadziłeś liczbę mniejszą od mojej ulubionej");
		}
		
		else {
			System.out.println("Nie wprowadziłeś mojej ulubionej liczbt");
		}
		
		
		
		
		
		//blok dziecko metody main
		
	}

}
