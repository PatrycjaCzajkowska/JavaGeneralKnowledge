package paczka19b_interfejs;

import java.util.Comparator;

import paczka18_klasaAbstrakcyjna.Produkt;



//aby posortować tablice można:
//1)klasa Produkt musi implementować interfejs Comparable (wtedy będziemy mogli sortować Produkt tylko na jeden sposób)
//2)stworzyć oddzielną klasę, która będzie implementowała interfejs Comparator – wtedy możemy stworzyć kilka Comparatorów, dla różnych sortowań


//Comparator jest interfejsem tzw. generycznym czyli pomiędzy nawiasami ostrymi podaję typ, jaki będę porównywał (jeśli nie określę – zostanie użyty typ Object)
public class Porownywarka implements Comparator<Produkt> {

	@Override
	public int compare(Produkt t, Produkt t1) {
		if(t.getCena()<t1.getCena()) {
			return 1;
		}
		return 0;
	}

}
