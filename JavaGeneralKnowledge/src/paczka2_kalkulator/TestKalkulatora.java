package paczka2_kalkulator;

import java.util.Scanner;

public class TestKalkulatora {

	public static void main(String[] args) {

		int liczba1 = 0;
		int liczba2 = 0;
		

		Scanner s = new Scanner(System.in);
		
		liczba1 = Integer.parseInt(s.nextLine());
//		liczba1 = Double.parseDouble(s.nextLine());// odzczytywanie danych z konsoli s.nextLine()
													// parse-analizuj double, skaner zwraca String,
													// więc trzeba przekonwertować na double metodą Double.parseDouble
													// (String argument)
		liczba1 = Integer.parseInt(s.nextLine());
//		liczba2 = Double.parseDouble(s.nextLine());
		s.close();

		
	System.out.println("Dodawanie");	
	System.out.println(liczba1 + "+" + liczba2 + "=" + (liczba1+liczba2));
	System.out.println("Odejmowanie");
	System.out.println(liczba1 + "-" + liczba2 + "=" + (liczba1-liczba2));
	System.out.println("Mnożenie");
	System.out.println(liczba1 + "*" + liczba2 + "=" + (liczba1*liczba2));
	System.out.println("Dzielenie");
	System.out.println(liczba1 + "/" + liczba2 + "=" + (liczba1/liczba2));
	}

}
