package paczka8_metody;

public class Test {
	
	
	
	public static int zwrocLiczbe() {
		System.out.println("Jestem w metodzie zwrocLiczbe");
	return 21;//Zwrócenie wartości przez metodę wstawia zwracaną wartość w miejsce wywołania.
	}
	
	
	
	//##przeciążanie metod-Zadeklarowanie metody o tej samej nazwie, a innym zestawie argumentów
	public static int zwrocLiczbe2(int argument) {
		System.out.println("Jestem w metodzie zwrocLiczbe2");
	return argument;
	}
	
	public static int zwrocLiczbe2(String argument) {
		int arg = Integer.parseInt(argument);
		return zwrocLiczbe2(arg);
	}
	
	
	public static int zwrocLiczbe2() {
		return zwrocLiczbe2(5);
	}
	
	
	
	
	
	
	
	
	public static void fun() {////w metodzie void też możemy używać return, 
		                      //ale nie podajemy zmiennej, lub literału do zwrócenia
		System.out.println("Jestem w metodzie fun");
		for(int i=0;i<10;i++) {
			System.out.println(i+"\t");
		}
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Jestem w metodzie main");
		
//		System.out.println(zwrocLiczbe());
		System.out.println(zwrocLiczbe2("12"));
		
//		fun();
	}

}
