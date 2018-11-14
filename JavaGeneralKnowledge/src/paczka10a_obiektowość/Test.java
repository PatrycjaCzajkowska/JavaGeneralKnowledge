package paczka10a_obiektowość;

public class Test {

	public static void modyfikujObiekt(int[]tab) {
		tab[0]=12;
	}
	
	public static void modyfikujNieObiekt(int liczba) {
		liczba = 4;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//typ obiektowy posiada wewnętrzną strukturę
		//typ nieobiektowy nie posiada wewnętrznej struktury - np. 5,'a' 

		
		//wartością zmiennej typu prostego jest po prostu jego wartością
	    //wartością zmiennej typu obiektowego jest referencja w pamięć(sterta)
		
		
		int[] tab = {-2};
		int liczba = 0;
		
		modyfikujObiekt(tab);
		modyfikujNieObiekt(liczba);
		
		System.out.println("Tablica" + tab[0]);
		System.out.println("Liczba" + liczba);
		
		
		
		
		
		
		
		
	}

}
