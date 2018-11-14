package paczka11_konstruktory;

public class Test {

	public static void main(String[] args) {
		
		Punkt p = new Punkt(5, 3.13);//trzeba dodać 2 argumenty bo konstruktor w klasie Punkt
                              //i teraz nie trzeba wpisywać wartości (np. p.x=5;) pola bo robi t konstruktor


		Punkt p2 = new Punkt(12, -2);

		System.out.println(p.obliczOdleglosc(p2));
		
		
		//kieruję obiekt do Garbage Collection, GC uruchamia się sam, ale też można go wywołać
		p=null; //null, która oznacza pustą referencję (czyli przerwanie istniejącej)
	
		
		System.gc();
	}

}
