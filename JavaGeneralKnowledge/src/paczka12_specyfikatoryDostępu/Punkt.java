package paczka12_specyfikatoryDostępu;



public class Punkt {

	public double x;
	private double y; //konwencja, że pola powinny być private i dostajemy się do nich przez get() i set()
	
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	

	public double obliczOdleglosc(Punkt p) {
		double odlegloscX=this.x-p.x;
		double odlegloscY=this.y-p.y;
		
		return Math.sqrt(odlegloscX*odlegloscX+odlegloscY*odlegloscY);
	}



	
	
	
	//##modyfikatory dostępu:
	//public - widoczny: w klasie macierzystej, w pakiecie, w podklasach poza pakietem, w reszcie aplikacji
	//protected - w klasie macierzystej, w pakiecie, w podklasach poza pakietem
	//private - w klasie macierzystej
	//brak -  w klasie macierzystej, w pakiecie
	
	
	
	//metoda get i set - akcesor
	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
