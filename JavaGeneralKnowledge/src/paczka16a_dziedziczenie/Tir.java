package paczka16a_dziedziczenie;

public class Tir extends Samochod{
	
	//w klasie dziedziczącej możemy wyłącznie dodawać pola i metody
    //struktura klas w Javie jest drzewem, a to oznacza że dziedziczyć możemy wyłącznie po jednej klasie
	//wszystkie elementy są dziedziczone, ale do pól prywatnych dostęp tylko przez getter o setter
	
	private Double ladownosc;

//	public Tir(Double ladownosc) {
//		
//		this.ladownosc = ladownosc;
//	}

	public Double getLadownosc() {
		return ladownosc;
	}

	public void setLadownosc(Double ladownosc) {
		this.ladownosc = ladownosc;
	}
	
	//super - wywoluje metodę z klasy nadrzędnej
	public Tir(String marka) {
		super (marka);//super(), które oznacza wywołanie konstruktora klasy nadrzędnej
		System.out.println("## Tworze tira");//konstruktor bezparametrowy
	}

//	@Override
//	public String getMarka() {
//		return  "##TIR "+ super.getMarka();
//	}
	
	
	
	
	
	
}


