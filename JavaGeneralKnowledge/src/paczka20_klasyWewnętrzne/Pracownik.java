package paczka20_klasyWewnętrzne;

import java.util.Date;

public class Pracownik {//klasa zewnętrzna

	private String imie;
	private String nazwisko;
	private Date dataZatrudnienia;
	
	
	public static class PracownikBuilder{//klasa wewnętrzna
		//z poziomu klasy wewnętrznej mam dostęp do prywatnych pól klasy zewnętrznej
		//definicję klasy Pracownik wyciągamy poza obiekt p i umieszczamy ją w inej klasie
		private Pracownik nowy = new Pracownik();//tworzę obiekt

		public PracownikBuilder withImie(String imie) {
			nowy.imie = imie;
			return this;
		}
		
		public PracownikBuilder withNazwisko(String nazwisko) {
			nowy.nazwisko = nazwisko;
			return this;
		}
		
		
		public PracownikBuilder withDatazatrudnienia(Date data) {
			nowy.dataZatrudnienia = data;
			return this;
		}
		
		public Pracownik compile() {
			return nowy;
		}
	}
	
	
	
}
