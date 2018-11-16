package paczka16a_dziedziczenie;

public class Test {

	public static void main(String[] args) {
		Tir t = new Tir("cieżarówka");
		
		//wywołania muszą nastąpić od typu najbardziej ogólnego do typu najbardziej szczególnego, 
		//czyli Object >> Samochod >> Tir

		System.out.println(t.getMarka());
		
	}

}
