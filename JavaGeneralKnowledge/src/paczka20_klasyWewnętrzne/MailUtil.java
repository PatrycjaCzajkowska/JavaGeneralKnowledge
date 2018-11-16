package paczka20_klasyWewnętrzne;

public class MailUtil {

	//w jednym pliku może znajdować się tylko jedna główna klasa publiczna
	//class nieoznaczonych specyfikator bez ograniczen - używamy np. przy klasach reprezentujących wątki - chcemy wszytko miec w 1 module
	//Do takich klas mamy dostęp wyłącznie w obrębie pakietu w którym stworzona została klasa Koszyk.
	//dla klas wewnętrznych zwykle definiuje się typy wykorzystywane tylko w jednej konkretnej klasie, albo definiuje się własne definicje błędów, żeby oznaczyć jedną klasę jako ściśle związaną z drugą.
	//klasy wewnętrzne udostępniają też coś co nazywamy rzutowaniem w górę (od typu szczególnego do ogólnego).Klasy wewnętrzne możemy definiować jako publiczne, prywatne etc., a także jako statyczne.
	//Klasy wewnętrzne możemy definiować również w metodach – np. typy danych potrzebne do wykonania pojedynczego wykonania metody.
	
	private class BulkMail{
		
		public void runMailing() {
			System.out.println("TA METODA WYSYŁA 20 000 maili"
					+ "i wykorzystuje inne struktury");
		}
		
	}
	
	
	public void wyslijMaila() {
		System.out.println("Ta metoda wysyła 1 maila");
	}
	
	/*Klasa BulkMail jest jakby kolejnym elementem obiektu klasy MailUtil
	 *  – czyli do stworzenia obiektuBulkMailpotrzebnyjestobiektMailUtil. Mówimywtedy,żeobiektBulkMailopiera się na obiekcie MailUtil.
	 */
	
	public void runMailing() {
		new BulkMail().runMailing();
	}
	
}
