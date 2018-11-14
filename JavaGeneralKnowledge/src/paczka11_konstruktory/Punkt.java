package paczka11_konstruktory;



public class Punkt {
	
	public double x;
	public double y;
	
	//kazda klasa ma konstruktor
	//gdy brak innego to domyślny-pusty, czyli nie robiący nic i nie przyjmujący żadnych argumentów
	//konstruktor umie przyjmować argumenty
	//przy konstruktorze po prostu nie piszemy zwracanego typu
	//konstruktor nie tworzy obiektu, nie zwraca nic, nie jest void’em
	//i jest wywoływany po stworzeniu obiektu w celu zainicjowania pól
	//this()oznacza wywołanie innego konstruktora tej samej klasy
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	

	public double obliczOdleglosc(Punkt p) {
		double odlegloscX=this.x-p.x;
		double odlegloscY=this.y-p.y;
		
		return Math.sqrt(odlegloscX*odlegloscX+odlegloscY*odlegloscY);
	}
	
	
	
	//##przeciążanie konstruktorów
	
	
	public Punkt(String x, String y) {
		this(Double.parseDouble(x),Double.parseDouble(y));
	}
}
