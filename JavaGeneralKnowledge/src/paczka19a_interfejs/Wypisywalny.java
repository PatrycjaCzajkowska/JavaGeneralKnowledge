package paczka19a_interfejs;

public interface Wypisywalny {
	
	//interfejs-dzięki niemu możemy dziedziczyć po kilku klasach naraz
	//gdyż 1 klasa może implementować wiele interfejsow naraz
	//można go traktować niejako jako klasę abstrakcyjną
	//deklarujemy w nim tylko metody i zawsze wszystkie będą abstrakcyjne
	//metody w interfejsie określają funkcjonalność klasy
	/*przez interfejsy możemy korzystać z polimorfizmu, tak jak przy dziedziczeniu
	tj. obiekt będzie spałniał zadane przez intefejs funkcjonalności*/
	//na wyższym poziomie Javy nie korzysta się z klas abstrakcyjnych tylko z intefejsów
	//pozwalają osiągnąć funkcjonalnie  to samo co klasy abstrakcyjne (dopóki nie musimy dziedziczyć pól).
	public String wypisz();

}
