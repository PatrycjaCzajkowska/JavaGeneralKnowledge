package paczka28_bankTransation;

import java.util.Date;

public class Transaction {

	private final Date date;//data wykonania
	private final String from;//nadawca
	private final String to;//odbiorca
	private final int amount;//kwota
	
	//tranzakcje zwykłe - przelewanie pewnej kwoty pieniędzy z jednego konta na inne, 
	//tranzakcje specjalna - wpływ pieniędzy na konto (brak nadawcy).
	
	
	public Transaction(Date date, String from, String to, int amount) {
		super();
		this.date = date;
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	
	
	public Date getDate() {
		return date;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public int getAmount() {
		return amount;
	}
	
	public boolean isSpecial() {
		return "SPECIAL".equals(from);
	}


	public static Transaction special(String string, int amount2) {
		// TODO Auto-generated method stub
		return null;
	}


	public static Transaction regular(String string, String string2, int amount2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Zmiennej finalnej można tylko raz przypisać wartość
	
	
	/*final -w przypadku zmiennej reprezentującej obiekt wartością tej zmiennej jest wartość tej referencji – nie zaś sam obiekt. Oznacza to, że oznaczenie referencji jako finalnej nie oznacza, że stan obiektu na który ta referencja wskazuje nie może zostać zmieniony, a jedynie że samej zmiennej
	 *  nie można przypisać drugi raz referencji do obiektu – choćby nawet tego samego.
	 */
	/*metoda finalna
	 * nie może ona zostać zaimplementowana w klasie pochodnej a 
	 * jej implementacja musi zostać podana w klasie w której została zadeklarowana.
	 */
	
	/*klasa finalna
	 * nie może być ona dziedziczona przez inne klasy
	 * klasami finalnymi np.: java.lang.System i java.lang.String.
	 *  Wszystkie metody w klasie finalnej są automatycznie finalne
	 */
}
