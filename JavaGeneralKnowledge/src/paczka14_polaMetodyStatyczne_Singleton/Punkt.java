package paczka14_polaMetodyStatyczne_Singleton;

public class Punkt {

	
	/*pole, metodę statyczną-przestają one być związane z jakimś obiektem,
	umieszcza metodę w klasie, a nie w obiekcie*/
	
	//używać żeby wydzielić jakieś informacje, albo funkcjonalności poza obiekty
    /*Jeśli przerwiemy związek metody z obiektem oznaczając ją słówkiem static 
     * nie możemy w jej ciele używać słówka kluczowego this
     */

	/*Z poziomu metod niestatycznych mamy jednak dostęp
	 *  do wszystkich pól i metod zadeklarowanych jako statyczne.
	 */

	
	
private static int numeracja = 0;//Pole numeracja jest moim licznikiem z którego konstruktor OBIEKTU Punkt pobiera kolejne wartości (ale numeracja jest związana z klasą, a nie z obiektem)
private double x;
private double y;
private int numerPunktu;//pole numerPunktu konkretnego OBIEKTU Punkt

public Punkt(double x, double y) {
	
	this.x = x;
	this.y = y;
	this.numerPunktu = ++numeracja;
}

public static int getNumeracja() {
	return numeracja;
}



}
