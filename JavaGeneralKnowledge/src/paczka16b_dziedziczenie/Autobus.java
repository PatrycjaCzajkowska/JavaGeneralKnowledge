package paczka16b_dziedziczenie;

import paczka16a_dziedziczenie.Samochod;

public class Autobus extends Samochod{
	
	public Autobus(String marka) {//konstruktor 1-parametrowy
		super(marka);
	}

//	@Override
//	public String getMarka() {//pole marka jest widoczne, bo mimo że jest w innym pakiecie jest zadeklarowane jako protected
//		return marka;         //gdyby było brak specyfikatora dostępu równieć  nie byłoby pole widoczne
//	}
}
