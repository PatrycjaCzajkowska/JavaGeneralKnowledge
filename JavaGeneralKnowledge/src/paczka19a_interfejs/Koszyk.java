package paczka19a_interfejs;

public class Koszyk implements Wypisywalny, Serializable, Statement, ActionListener, Comparator  {

	
	private Produkt[] produkty;
	
	
	public Koszyk() {
		produkty = new Produkt[5];
	}


	public void dodajProdukt(Produkt p) {
		for(int i=0; i<produkty.length; i++) {
			
		}
	}


	@Override
	public String wypisz() {//trzeba zaimplementować metodę zadeklarowaną w interfejsie bo inaczej bład
		String result = "";
		for (Produkt p:produkty) {
			if(p !=null)
				result += p + " == " + p.getCena();
		}
		return result;
		
	}
	
	
	

}
