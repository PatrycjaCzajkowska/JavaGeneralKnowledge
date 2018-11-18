package paczka25_jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;



//Obiekt połączenia z bazą danych będzie  Singleton’em
//1 sposób - do połaczenia używam DriveManagera

public class DatabaseConnector {
	
	private static Connection connection;//obiekt typu Cpnnection
	
	public static Connection getConnection() {
		if(connection == null) {
			connection = initConnection();
		}
		return connection;
	}
	
/**
 * Metoda nawiązująca połączenie
 * @return
 */
	
	//potrzebny będzie sterownik JDBC-biblioteka zewnętrzna umożliwiająca nam łączenie się z bazą danych
	//Plik nazywa się dokładnie ojdbc6.jar i można pobrać go z oficjalnej strony firmy Oracle
	private static Connection initConnection() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");//sprawdzam, czy w aplikacji jest sterownik Oracle JDBC:
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//nawiązyję połączenie z baza danychdzięki trzem danym:url bazy
			String username = "hr";//nazwa użytkownika
			String passwd = "hr";//hasło
//			return DriverManager.getConnection(url, username, passwd);//Połączenie zwróci metoda statyczna z klasy DriverManager
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Brak sterownika JDBC");
		}
//		catch (SQLException ex) {//pojawiła kolejna klauzula catch obsługująca SQLException.
//			ex.printStackTrace();//Jest to uniwersalna pośród sterowników bazodanowych klasa reprezentująca wszystkie wyjątki
//			                     //związane z bazą danych – w tym np. błąd autoryzacji.
//		}
		
		
		return null;
	}
	
	//2 sposób - tu nie musimy programowo sprawdzać, czy mamy sterownik JDBC, ponieważ jeśli go nie będzie kod się nie skompiluje
//	private static Connection initConnection() {
//		Driver d = new oracle.jdbc.driver.OracleDriver();
//		Propeties props = new Properties();
//		props.setProperty("user, "hr");
//		props.setProperty("user, "hr");
//				try {
//
//					return d.connect("jdbc:oracle:thin:@localhost:1521:xe", props);//nawiązyję połączenie z baza danychdzięki trzem danym:url bazy
//					
//				}
//				catch(SQLException ex) {
//					ex.printStackTrace();
//				}		
//				return null;
//		
		
//	}

}
