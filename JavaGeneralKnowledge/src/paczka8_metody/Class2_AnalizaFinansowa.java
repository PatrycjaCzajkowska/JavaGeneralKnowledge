package paczka8_metody;

public class Class2_AnalizaFinansowa {
	
	private double netto;
	private double vat;
	
	public double getNetto() {
		return netto;
	}
	public void setNetto(double netto) {
		this.netto = netto;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	
	
	public Class2_AnalizaFinansowa getAnalizaZOstatniegoMiesiaca() {
	return getAnalizaOkre("miesiac");
	}
	
	
	private Class2_AnalizaFinansowa getAnalizaOkre(String okres) {
		this.netto = 234*okres.length();
		this.vat = 32.2/okres.length();
		return this;
	}
	
	
	

}
