package paczka10c_obiektowość;

public class Test {

	public static void main(String[] args) {

		String t = "abc";
		String t2 = new String("abc");
		
		
		//operator == porównuje wartości zminnych:
		//wartością zmiennej t jest "abc"
		//wartością zmiennej obiektowej t2 jest referencja
		//== pytam czy t i t2 to ten sam obiekt, a nie taki sam
		
		System.out.println(t==t2);
		
		
		//equals()pytam czy t i t2 to taki sam obiekt
		//porównanie obiektowe polega na przyrównaniu do siebie wszystkich pól dwóch obiektów.
		System.out.println(t.equals(t2));
		
		
		
		Punkt p1 = new Punkt(1,0);
		Punkt p2 = new Punkt(1,0);
		
		System.out.println(p1.equals(p2));
		
	}

}
