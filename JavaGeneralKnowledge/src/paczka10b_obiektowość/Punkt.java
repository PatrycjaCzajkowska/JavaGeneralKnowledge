package paczka10b_obiektowość;

public class Punkt {

	//pola deklarujemy w klasach nigdy w metodach
	//pola mają modyfikator dostępu-public
	//pole jest widoczne z każdego miejsca w klasie
	
	
	public double x;
	public double y;
	
	
	public double obliczOdleglosc(Punkt p) {
		double odlegloscX=this.x-p.x;
		double odlegloscY=this.y-p.y;
		
		return Math.sqrt(odlegloscX*odlegloscX+odlegloscY*odlegloscY);
	}
	
	
}
