package paczka21a_try_catch_wyjatki_obsługaBłedów;

import java.util.Scanner;



public class Test {
	
	//wyjątek, błąd  to też obiekty
/*Błąd (Error) różni się od wyjątku (Exception) tym, że wystąpienie wyjątku oznacza, że coś poszło nie tak w czasie wykonania programu 
 * i dotyczy tylko jego. Wystąpienie błędu (Error) oznacza błąd po stronie JVM na tyle poważny, że program zawsze zostanir wtedy przerwany. 
 * Możemy obsługiwać wyjątki – błędów (Error) nawet nie warto,
 *  ponieważ i tak ich zaistnienie następuje poza naszym kodem.
 */
	public static void main(String[] args) {
		
	
	double liczba1 = 0;
	double liczba2 = 0;
	

	Scanner s = new Scanner(System.in);
	
	//klauzula try-catch
	
	
	try {//w klauzuli try umieszczam kod, który może rzucać wyjątkami
	liczba1 = Double.parseDouble(s.nextLine());
	liczba2 = Double.parseDouble(s.nextLine());
	}
	catch (NumberFormatException e) {//w klauzuli catch() umieszczaḿ informację jakiego wyjątku dotyczy 
		e.printStackTrace();////Metoda printStackTrace() jest bardzo charakterystyczna dla wyjątków i służy  do wypisania wszystkich klas, które wysypały się przez zaistnienie wyjątku 	 na standardowy strumień dla błędów (System.err), a także klasy i wiadomości błędu.
	}

	System.out.println("Dodawanie");	
	System.out.println(liczba1 + "+" + liczba2 + "=" + (liczba1+liczba2));
	System.out.println("Odejmowanie");
	System.out.println(liczba1 + "-" + liczba2 + "=" + (liczba1-liczba2));
	System.out.println("Mnożenie");
	System.out.println(liczba1 + "*" + liczba2 + "=" + (liczba1*liczba2));
	System.out.println("Dzielenie");
	System.out.println(liczba1 + "/" + liczba2 + "=" + (liczba1/liczba2));
	

	
	
}
}
