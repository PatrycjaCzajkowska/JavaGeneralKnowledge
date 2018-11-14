package paczka10b_obiektowość;

public class Test {

	public static void main(String[] args) {
	
		//na podstawie klasy tworzymy obiekty(instancje klasy)/egzemplarze

		
		Punkt p = new Punkt(); //new tworzy nowy obiekt
		
		                      
		//żeby dostać się do pól używamy ooperatora'.':
		
		p.x=5;
		p.y=5;
		
		System.out.println("["+p.x+", "+p.y+"]");
		
		
		Punkt p2 = new Punkt();
		
		p2.x=12;
		p2.y=-2;
		
		
		//wywołanie metody na obiekcie np.   p.obliczOdleglosc(p2);
		
		
		double odległość = p.obliczOdleglosc(p2);
		System.out.println("Odległość między p i p2 wynosi:" + odległość);
		
		
		
	
		
		
		
	}

}
