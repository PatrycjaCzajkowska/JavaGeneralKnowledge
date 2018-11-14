package paczka13_dokumentacja;

public class Punkt {

	private double x;
	private double y;
	
	
	
	




	//Dokumentacja znajduje się ponad metodami
	
	
	/**
	 * 
	 * TO JEST METODA DO OBLICZANIA
	 * ODLEGŁOŚCI MIĘDZY DWOMA PUNKTAMI
	 * 
	 */
	public double obliczOdleglosc(Punkt p) {
		double odlegloscX = this.x - p.x;
		double odlegloscY = this.y - p.y;
		return Math.sqrt(odlegloscX*odlegloscX + odlegloscY*odlegloscY);
	}
	
}
