package paczka14_polaMetodyStatyczne_Singleton;

public class Singleton {
	
	private static Singleton instance;
	
	/*Singleton - jedną instancję klasy w obrębie całej aplikacji
    *(np. klasy reprezentujące usługi, połączenie z bazą danych)
    */
	
	
	
	/*klasa ma zablokować dostęp do konstruktora i 
	 * przy pierwszym wywołaniu pobrania obiektu stworzyć go, a każde kolejne wywołanie pobrania obiektu ma zwrócić już istniejący obiekt
	 */
	
	private Singleton() {}//blokuję dostęp do konstruktora oznaczając go jako private
		                 //i teraz nie da się utworzyć obiektu klasy Singleton
	
	//teraz muszę wywołać z wewnątrz klasy
	//nie mam obiektu więc wywołuję metodą statyczną
	//potem muszę przechować informację o tym, czy utworzyłam już obiekt klasy Singleton czy nie - w polu statycznym

public static Singleton getInstance() {
	if (instance == null) {
		instance = new Singleton();
	}
	return instance;
}


//teraz to klasa Singleton zarządza tworzeniem swoich obiektów
}
