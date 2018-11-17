package paczka22a_kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListy {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();//<tu okreslamy typ> bo kolekcje to tyypy generyczne
		List<String> lista2 = new ArrayList<String>(lista);//rozwiazanie "problemu"iteracja po kopii naszej listy.
		System.out.println(lista);
		for(String s: lista2) {
			lista.remove(s);
		}
		System.out.println(lista);
		
		String tekst = "ala";
		lista.add(tekst);
		lista.add("ma");
		lista.add("kota");
		lista.add(tekst);
		
		
		for(String s:lista) {
			System.out.println(s);
		}
		
//		for(String s:lista) {
//			lista.remove(s);	//Jeśli w trakcie iteracji po liście pętlą for-each, wywołamy na niej metody zmieniające ilość elementów znajdujących się w niej – otrzymamy ConcurrentModificationException
//		}//"problem"-Przyczyną tego wyjątku jest to, że w trakcie iteracji po jakimś elemencie pętlą for-each używany jest interfejs Iterator, a lista tablicowa ma własną implementację Iterator’a w postaci klasy wewnętrznej.
		
		//jeszcze inaczej to można rozwiązać przez obiekt typu Iterator - można wyjść z prawie każdej kolekcji
		System.out.println(lista);
		for(Iterator<String> i = lista.iterator(); i.hasNext();) {
			i.next();//i.next() - zwraca kolejny element z listy
			i.remove();
		}
		
	}

	
	// ArrayList (lista tablicowa) - daje niemal zerowy czas odczytu danych z niej, ale wszelkie modyfikacje są dużo trudniejsze
	//LinkedList (lista wiązana) - kolejne obiekty są uzupełniane o dwie referencje (element poprzedni i następny). Dzięki temu wszelkie modyfikacje listy ograniczają się do kilku bardzo prostych operacji. Dużo dłużej trwają natomiast odczyty.
	//kolejne obiekty są uzupełniane o dwie referencje (element poprzedni i następny). Dzięki temu wszelkie modyfikacje listy ograniczają się do kilku bardzo prostych operacji. Dużo dłużej trwają natomiast odczyty.
	//używając polimorfizmu możemy bezkolizyjnie zmienić tę implementację. Takie polimorficzne deklarowanie jest uniwersalne dla wszystkich kolekcji
	//powtórki tego samego obiektu są traktowane w liście jako oddzielne elementy
	//W kolekcjach składować możemy wyłącznie elementy typów obiektowych. Nie można stworzyć listy intów
	//klasy opakowujące dla typów prostych- aby posiadały klasy i dało się stworzyć kolekcje je przechowujące
	/*Integer - dla int
	 * Double - double
	 * Character - char
	 * Boolean - boolean
	 */
	
	
	
	/*Iterator – obiekt pozwalający na sekwencyjny dostęp do wszystkich elementów 
	 * lub części zawartych w innym obiekcie, zwykle kontenerze lub liście.
	 *  Iterator jest czasem nazywany kursorem, zwłaszcza w zastosowaniach związanych 
	 *  z bazami danych.
	 */
	
	
	
	
}
