package paczka21b_try_catch_wyjatki_obsługaBłedów;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		
		
		//wyjątkiem jest obiekt jakiejkolwiek klasy dziedziczącej po klasie Exception
		//tylko metody mogą zgłaszać wyjątki
		//metoda może zgłosić jakikolwiek wyjątek – to musimy ten wyjątek obsłużyć
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");//SimpleDateFormat odpowiada za konwersję dat z formatu String do formatu java.util.Date.
		String data = "12-12-2005";
//		Date d = sdf.parse(data);
		
		//parsowanie(konwersja)-jeśli parsowanie się nie uda zostanie wyrzucony wyjątek i należy go obsłużyć
		//kiedy klasa wyjątku dziedziczy po RuntimeException nie musimy obsługiwać każdego wyjątku
		//dziedziczą po niej takie klasy jak NullPointerException(mogą wystąpić wszędzie, więc nie warto ich try-catchować), NumberFormatException etc
	
//	Samochod s = new Samochod(124);
//	
//	try {
//		System.out.println(s.getLadownosc());
//	}
//	catch(Samochod.MechanicznyException ex) {
//		ex.printStackTrace();
//	}
	
	try (Samochod s = new Samochod(400);){
		s.getLadownosc();
	}
	catch (Samochod.MechanicznyException e) {
		e.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
