package paczka20_klasyWewnętrzne;

import java.util.Date;

public class PracownikTest {

	public static void main(String[] args) {

		Pracownik p = new Pracownik.PracownikBuilder()
				.withImie("Jasio")
				.withNazwisko("Kowalski")
				.withDatazatrudnienia(new Date())
				.compile();
		
		System.out.println(p);
	}

}
