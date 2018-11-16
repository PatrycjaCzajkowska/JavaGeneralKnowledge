package paczka17b_polimorfizm;

public class Kosmetyk extends Produkt{

	private String marka;

	public Kosmetyk(String nazwa, String marka) {//nadpisany konstruktor z nadklasy
		super(nazwa);
		this.marka=marka;
		
	}

	//ta adnotacja-nie ma żadnego skutku w czasie wykonania, ani kompilacji
	@Override//adnotacja - inforamcja dla programisty że metoda przesłania metodę z klasy bazowej
	public double getCena() {//nowa implementacja metody getCena()
		double wspolczynnik = 1;
		if(marka.equals("Supermarka")) {
			wspolczynnik = 2;
		}
		return 211.23 * wspolczynnik;
	}

	@Override
	public String toString() {//przesłaniem meodę to String() z klasy Object, analogicznie mogę przesłonić metodę equals() z klasy Object
		return "Kosmetyk " + getNazwa() + " marki " + marka;
				
	}
	
	
	
	
}
