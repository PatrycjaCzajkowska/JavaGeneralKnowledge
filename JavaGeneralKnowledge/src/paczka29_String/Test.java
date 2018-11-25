package paczka29_String;

public class Test {

	public static void main(String[] args) {
		
		
		//String-ciąg znaków
		//StringBuilder-klasa niesynchroniczna do modyfikowania ciągu znaków
		//StringBuffer-klasa synchroniczna do modyfikowania ciągu znaków
		//operatora + na Stringach używamy, gdy nie kosztuje nas to ani dużo czasu, ani pamięci
		
		
//		String s = "Kasia";
//		s=s+" i Tomek ";//konkatencaja-łączenia/nie zmodyfikowałam obiektu s tylko przypisałam do niego nową referencję
//		s=new StringBuilder(s).append(" i Tomek ").toString();//tworzę nowy obiekt stringBulider, wywołuję metodę append()-dodaj z argumentem i zamieniam go spowrotem na String
//		System.out.println(s);
	

		
		
		String s1 = "a";
		long start1 = System.nanoTime();
		for(int i=0; i<10000; i++) {
			s1 = s1+"a";
			//s = new StringBuilder(s).append("a").toString();
		}
		System.out.println("Time1: "+(System.nanoTime()-start1));
		
		
	
	//dodajemy jedynie na końcu naszego Stringa 10  razy literę "a"
	
	String s2 = "a";
	long start2 = System.nanoTime();
	StringBuilder sB = new StringBuilder(s2);//dzięki StringBilderowi program wykonuje się szybciej niż z wykorzystaniem +

	for(int i=0; i<10; i++) {
		sB.append("a");
	}

	s2 = sB.toString();
	System.out.println("Time2: "+(System.nanoTime()-start2));
	System.out.println(sB);
	
	
	
	String s3 = "a";
	long start3 = System.nanoTime();
	StringBuffer strB = new StringBuffer(s3);
	for(int i=0; i<10000; i++)
		strB.append("a");
	s3 = strB.toString();
	System.out.println("Time3: "+(System.nanoTime()-start3));
}
}
