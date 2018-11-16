package paczka16a_dziedziczenie;

public class Samochod {

//	private String marka;
	
	
	//pole private - widoczne tylko z poziomu tej klasy
	//protected-gdy chcemy mieć bezpośredni dostęp do pól i metod w klasach dziedziczących, a jednocześnie nie chcemy wystawiać ich całkowicie na zewnątrz
    //każda klasa dziedziczy niejawnie po klasie Object, stąd metody:
	//hashCode(), equals(), toString(), wait(), notify() etc.
	
	public String marka;
	
	
	//private a protected różnica- przy dziedziczeniu po jakiejś klasie, przy czym klasa bazowa jest w innym pakiecie, a klasa dziedzicząca w innym
	//final-nie można nadpisać implementacji tej metody w żadnej klasie dziedziczącej:
	public final String getMarka() {//final - zablokowałam możliwość przesłonienia metody w klasie dziedziczącej, podobnie jest przy final polach
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public Samochod(String marka) {
		this.marka=marka;
		System.out.println("## Tworzę samochod");//konstruktor 1-parametrowy, parametr musi być taki sam w klasie podrzędnej
	}
	
//	public Samochod() {
//		
//		System.out.println("## Tworzę samochod");//konstruktor bezparametrowy
//	}
	
}
