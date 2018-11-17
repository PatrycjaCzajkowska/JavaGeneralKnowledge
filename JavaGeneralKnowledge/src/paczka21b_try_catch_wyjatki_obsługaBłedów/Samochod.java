package paczka21b_try_catch_wyjatki_obsługaBłedów;

import java.io.Closeable;
import java.io.IOException;

public class Samochod implements Closeable{
	
	
	

	public class MechanicznyException extends Exception{
		
		public MechanicznyException(String message) {
			super(message);
		}
	}
	
	private double ladownosc;
	
	public Samochod(double ladownosc) {
		this.ladownosc = ladownosc;
		System.out.println("## Tworze samochod");
	}
	
	public double getLadownosc() throws MechanicznyException{
		if (ladownosc<1000)
			throw new MechanicznyException("Zbyt niska ładowność - to samochód, a nie rower");
	
	return ladownosc;
	}

	@Override
	public void close(){
		System.out.println("## Samochod zostal poprawnie zamkniety");
		
	}
}

//komenda throw - uruchamiamy podniesienie wyjątku	
/*po niej musimy podać obiekt wyjątku, który ma zostać rzucony. 
 * Jeśli rzucany wyjątek nie jest typu RuntimeException, 
 * musimy na etapie deklarowania metody dodać klauzulę throws i
 *  po przecinku podać klasę lub klasy wyjątków, które mogą zostać zgłoszone przez metodę.
 */