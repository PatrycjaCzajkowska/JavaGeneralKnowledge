package paczka15_stałe;

public class Punkt {
	
	public double x;
	public double y;

	public Punkt(int x, int y) {
		
	}
	
	
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}



	//final - tak oznaczamy stałe i zapisujemy je wielkimi literami
	//blokuje możliwość zmiany wartości jakiegoś pola lub zmiennej
	public static final int STALA = 1;
	
	
	//stała obiektowa:
	
	public static final Punkt CONST_POINT = new Punkt(787, 12);
	
	
	public static void Main(String[] args) {
		
		CONST_POINT.setX(14.4); //Metoda setX() nie zmienia referencji do naszego Punktu, tylko pole znajdujące się w nim. 
		
		
	}
}
