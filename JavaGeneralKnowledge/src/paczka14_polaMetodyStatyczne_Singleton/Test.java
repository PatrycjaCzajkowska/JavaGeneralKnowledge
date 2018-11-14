package paczka14_polaMetodyStatyczne_Singleton;

public class Test {

	public static void main(String[] args) {
		

		Punkt p1 = new Punkt(3,2);
		Punkt p2 = new Punkt(3,2);
		Punkt p3 = new Punkt(3,2);
		//wywołanie metody statycznej
		
		System.out.println(Punkt.getNumeracja());
		
		//----------------------------
		
		Singleton s = Singleton.getInstance();
		Singleton nibyDrugiObiekt = Singleton.getInstance();
		
		System.out.println(s + "==" + nibyDrugiObiekt);
		
		
	}

}
