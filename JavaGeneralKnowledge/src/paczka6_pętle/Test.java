package paczka6_pętle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

//		int liczba = 0;
		
		//inkrementacja = zwiększenie o 1 i zwrócenie wartości
		//dekrementacja = zmniejszenie o 1 i zwrócenie wartości
		
//		liczba++;//postinkrementacja i=i+1;//zwraca wartość prze zwiększeniem
//		++liczba;//preinkrementacja//zwraca wartość już zwiększoną
		
//		System.out.println(liczba++);
//		System.out.println(++liczba);
		
		
//		liczba--;//postdekrementacja i=i-1;
//		--liczba;//predekrementacja
		
//		System.out.println(liczba--);
//		System.out.println(--liczba);
		
		//------------------------------
		Scanner s = new Scanner(System.in);
		int liczba2 = Integer.parseInt(s.nextLine());
		s.close();
//		System.out.println("Przechodzę do pętli do-while");
//		
//		//------------------------------
//		
//		//######PĘTLA do-while    //ciało tj.po do{} wykonuje się przynajmniej 1, potem sprawdzany warunek
//		
//		do {
//			System.out.println("liczba2 = " + liczba2);
//		}
//		while (liczba2++ <15);
		
		
		//#######PĘTLA while 
//		
//		System.out.println("Przechodzę do pętli while");
//		
//		
//		while(liczba2++<20) {
//			System.out.println("liczba2 = "+ liczba2);
//		}
		
//		System.out.println("Przechodzę do 2 pętli while");
//		
//		int dzielnik = 2;
//		
//		while(dzielnik<=liczba2) {
//			if(liczba2%dzielnik==0) {// % to tzw. dzielenie modulo-obliczanie reszty z dzielenia
//				System.out.println(dzielnik);
//				liczba2/=dzielnik;  // /= to jednoczesne dzielenie i przypisanie wartości, inne: +=,-=,*=
//			}
//			else {
//				dzielnik++;
//				
//			}
//		}
		
		
		
		System.out.println("Przechodzę do 3 pętli while");
		
		
		
		double kapitalPoczatkowy = 1000;
		double kapitalDocelowy = 10000;
		double oprocentowanie = 0.04;
		
		int iloscLat = 0;
		while(kapitalPoczatkowy<kapitalDocelowy) {
			kapitalPoczatkowy *=(oprocentowanie+1);
			iloscLat++;
		}
		
		System.out.println("Potrzebne było " + iloscLat + "lat.");
		
		//#######PĘTLA for     //wykonuje się od wartości do wartości
		
//		System.out.println("Przechodzę do pętli for");
//		
//		for(int i=0; i<5; i++) {//1 instrukcja-deklaracja 1 elementu przed wywołaniem pętli; 2 instrukcja-sprawdzany warunek; 3 instrukcja - wywołana po każdym obrocie jeśli spełniony warunek
//			                    //możliwe też bez {}
//			System.out.println("i= "+i);
//		}
		
		
		//########inna konstrukcja pętli for = pętla for jest jak while, ale z możliwością stworzenia warunku zakończenia pętli na etapie jej deklarowania.

//		System.out.println("Przechodzę do 2 pętli for"); 
//		
//		int i=0;
//				for(;i<5;) {
//					System.out.println("i= "+i);
//					i++;
//				}
//				
//		System.out.println("Przechodzę do 3 pętli for"); 		
//		
//		for(;;) {
//			System.out.println("Petla nieskończona!");
//		}
		
		//########inna konstrukcja pętli for
		
		System.out.println("Przechodzę do 4 pętli for"); 
		for(int dzielnik2 = 2;dzielnik2 <=liczba2;) {
			if(liczba2%dzielnik2==0) {
				System.out.println(dzielnik2);
				liczba2/=dzielnik2;
			}
			else {
				dzielnik2++;
			}
		}
		
		System.out.println("Przechodzę do 5 pętli for"); 
		
		double kapitalPoczatkowy2 = 1000;
		double kapitalDocelowy2 = 10000;
		double oprocentowanie2 = 0.04;
		
		int iloscLat2 = 0;
		
		for(;kapitalPoczatkowy2<kapitalDocelowy2;iloscLat2++) {
			kapitalPoczatkowy2 *=(oprocentowanie2+1);
			
		}
		
		System.out.println("Potrzebne było " + iloscLat2 + "lat.");
		
	}
	
	
	
	
	

}
