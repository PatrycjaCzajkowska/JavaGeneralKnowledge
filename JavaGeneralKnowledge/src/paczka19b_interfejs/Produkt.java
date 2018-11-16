package paczka19b_interfejs;

public abstract class Produkt {

	//klasy abstrakcyjne – których obiektów nie chcemy tworzyć bezpośrednio
	//wymuszamy na programistach używających takiej klasy dziedziczenie po niej i podanie implementacji pewnych metod (abstrakcyjnych) na poziomie klas dziedziczących.
	//klasa abstrakcyjna - nie można stworzyć obiektu tej klasy
	private String nazwa;

	public Produkt(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}

	
	//metoda abstrakcyjna - nie podaję jej implementacji – natomiast będzie trzeba ją podać na poziomie klas dziedziczących (o ile klasa dziedzicząca też nie jest abstrakcyjna)
	public abstract double getCena();//aby można było stworzyć obiekt Produktu ta metoda musi zostać ukonkretniona
	
	
	
	
	
	
	
}
