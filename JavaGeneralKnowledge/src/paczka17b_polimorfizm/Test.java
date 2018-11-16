package paczka17b_polimorfizm;

public class Test {

	public static void main(String[] args) {
		Produkt p = new Kosmetyk("Krem", "Supermarka");//parametry jak w konstruktorze
		System.out.println("Cena: "+ p.getCena());
		
		System.out.println(p);//na obiekcie p wywoluje metode toString
     
	}

}
