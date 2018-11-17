package paczka22b_kolekcje;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;

public class Test {
	

	public static void modyfikujNibyObiekt(Integer i) {
		i = 20;
	}

	public static void main(String[] args) {
		
		Integer i = 10;
		modyfikujNibyObiekt(i);
		System.out.println(i);

		
		
		//##LISTA
		System.out.println("lista");
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(4);
		lista.add(6);
		System.out.println(lista);
		
		//##ZBIÓR - Od listy odróżnia go to, że Set nie dopuszcza do zaistnienia powtórek.
		System.out.println("zbior");
//		Set<String> zbior = new HashSet<String>();
		Set<Samochod> zbior = new HashSet<Samochod>();
		zbior.add(new Samochod(100));
		zbior.add(new Samochod(100));
		System.out.println(zbior);
		
		//porównywanie przez metodę equals’a-przesłaniając metodę equals( Object o ) w klasie Samochod.

//		@Override
//		public boolean equals(Object obj) {
//			if (obj == null) {
//				return false;
//			}
//			if (getclass() !=obj.getClass()) {
//				return false;
//			}
//			Samochod other = (Samochod) obj;
//			return this.ladownosc == other.ladownosc;
//		}
		//##MAPA-powiazanie wartości(Values) z kluczem - klucz i wartość mogą być dowolnego typu obiektowego
		//specjalnego typu Values, będącego klasą wewnętrzną implementacji mapy, reprezentującą wartości.
		//Próba pobrania z mapy elementu od nieistniejącego klucza nie powoduje wyjątku, tylko zwrócenie wartości null
		//dodanie elementu na istniejący już klucz powoduje zaktualizowanie tegoż elementu
		System.out.println("mapa");
		
		Map<String, Samochod> mapa = new HashMap<String, Samochod>();
		mapa.put("numer 1", new Samochod(123));
		mapa.put("numer 2", new Samochod(123));
		
		System.out.println(mapa.get("numer 1"));
		System.out.println(mapa.get("numer 4"));
		
		mapa.put("numer 1", new Samochod(120));
		System.out.println(mapa.get("numer 1"));
		
		/*do iteracji po mapach służy typ Entry, który jest interfejsem wewnętrznym w interfejsie Map
		 Reprezentuje on parę klucz-wartość.
		 (metoda entrySet() zwraca zbiór elementów typu Entry
		 */
		
		for (Map.Entry<String, Samochod> entry: mapa.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		/*Szczególnym typem mapy jest klasa Properties
		 * nie implementuje bezpośrednio interfejsu Map i jest zdolna do przechowywania par Object-Object
		 *Została jednak stworzona przede wszystkim do przechowywania 
		 *par String-String, dlatego dodano w niej metody wspomagające pracę z tzw. właściwościami 
		 *– np. getProperty(), setProperty()		
		 *a także o metody wspomagające ładowanie właściwości z plików XML – metoda load(). Oczywiście dalej mamy dostęp do wszystkich metod z interfejsu Map.
		 *Ta kolekcja jest intensywnie używana przy np. JavaMail. */
	
		Properties prop = new Properties();
		prop.getProperty("numer 1");
		//prop.load(inStream);//load pozwala ładować dane do kolekcji
	
		//##KOLEJKA-pozwala szeregować elementy (podobnie jak listy) w kolejności w jakiej zostały dodane.
	   //Oferują jednak ograniczenie rozmiaru kolejki, sprawdzanie, czy udało się dodać element do kolejki, a także znacznie bardziej rozbudowany zestaw środków do pobierania elementów z niej.
	
		Queue<String> q = new ArrayDeque<String>();
		
		/*ArrayDeque nie jest ograniczona przez rozmiar – dopasowuje się do ilości elementów. Jako kolejka ma metody dla nich charakterystyczne:
	poll() – zwraca i usuwa element znajdujący się na szczycie kolejki
	peek() – to samo co poll(), ale nie usuwa nic z kolekcji
	remove() – to samo co poll(), ale podnosi wyjątek jeśli kolejka jest pusta (poll()
	zwraca null)
	 offer() – podejmuje próbę dodania elementu na koniec kolejki – zwraca true jeśli
	operacja się powiodła, false, jeśli przekroczymy ładowność kolejki
	*/
		//PriorityQueue-Działa w ten sposób, 
		//że dodając nowy element do kolekcji od razu wskakuje on na pozycję wynikającą z jakiegoś sortowania (interfejs Comparator)
//		Queue<Task> tasks = new PriorityQueue<Task>(3, CMPRTR);//mienna CMPRTR to obiekt Comparator sortujący moją kolejkę malejąco po priorytecie.
//		
//		tasks.add(new Task("niewzne", 1));
//		tasks.add(new Task("najważniejsze", 10));
//		tasks.add(new Task("ważne", 5));
//		while (tasks.size()>0) {
//			System.out.println(tasks.poll());
//		}
		//nie używać iteracji za pomocą for-each’a – dostaniemy wtedy elementy w takiej kolejności w jakiej dodaliśmy je do kolejki (nieposortowane po priorytecie
	}

}
