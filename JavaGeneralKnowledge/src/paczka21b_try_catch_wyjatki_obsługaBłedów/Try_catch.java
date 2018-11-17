package paczka21b_try_catch_wyjatki_obsługaBłedów;

import java.io.IOException;

public class Try_catch {

//	
//	try {
//		
//		try {
//			// Tu mamy wyjątek (ParseException) – przerwanie bloku try
//			
//			 System.out.println("Chyba wszystko OK"); //instrukcja się nie wykona
//		} 
//			
//		catch (IOException e) { // Nie pasuje
//			
//				   e.printStackTrace();
//				
//			}
//		
//		catch (NumberFormatException e) { // Nie pasuje – przerywa blok try!!!
//			
//				e.printStackTrace();
//			 }
//			
//	    catch (NullPointerException e) { // Nie pasuje
//			
//			    e.printStackTrace();
//			            	 
//			}
//	    catch (RuntimeException e) { // Nie pasuje
//			
//			    e.printStackTrace();       	
//			 }
////		catch (Exception e) { // Pasuje – wykonanie bloku catch
////			e.printStackTrace();
////			
////		
////			
////			}
//	    catch (RuntimeException e) {//Nie pasuje - nastapi przerwnie watku!!!
//	    	
//	    	e.printStackTrace();
//	    	
//	    }
//			               
//			/*Java najpierw przerywa blok try w którym nastąpił wyjątek i szuka liniowo
//			 *  najbliższej sekcji catch, której klasa wyjątku odpowiada klasie wyjątku
//			 *   zgłoszonego (polimorfizm cały czas działa!) i jeśli znajdzie pasującą 
//			 *   to po prostu wykona jej ciało i przejdzie dalej (pomijając kolejne catch’e). 
//			 *   Jeśli nie znajdzie dalej przerwie kolejny blok try i znowu będzie szukać pasującego 
//			 *   catch’a. Jeśli i tam nie znajdzie – wtedy przerwie wątek.            
//			 */
//	}

}
