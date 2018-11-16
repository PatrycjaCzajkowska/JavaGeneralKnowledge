package paczka18_klasaAbstrakcyjna;

public class Test {

	public static void main(String[] args) {
		Produkt p = new Produkt("Produkt") {//przy tworzeniu obiektu klasy Produkt trzeba dodać implementację metody abstrakcyjnej

			@Override
			public double getCena() {
				return 100;
			}
	
		};
		
		System.out.println(p.getCena());
	}

}
