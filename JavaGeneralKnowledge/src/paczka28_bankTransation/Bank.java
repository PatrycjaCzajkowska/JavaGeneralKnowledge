package paczka28_bankTransation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import paczka22b_kolekcje.Samochod;

public class Bank implements Serializable{
	
	private final Map<String, Integer> accounts;//String z klasy Integer

	public Bank(Map<String, Integer> accounts) {//konstruktor
		super();
		this.accounts = accounts;
	}
	
//	Map<String, Integer> accounts = new HashMap<String, Integer>();//wywołać w main

	
	
	public TransactionState make(Transaction transaction) {
		
		int amount = transaction.getAmount();
		String to = transaction.getTo();
		
		//someone earns
		
		if(transaction.isSpecial()) {
			accounts.put(to, currentAmount(transaction.getTo())+amount);
			return TransactionState.SPECIAL_OK;
		}
		
		//money transfer
		else {
			String from = transaction.getFrom();
			int amountFrom = currentAmount(from);
			int amountTo = currentAmount(to);
			
			accounts.put(from, amountFrom - amount);
			accounts.put(to, amountTo + amount);
			
			return TransactionState.REGULER_OK;
		}
	}
	
	public int currentAmount(String user) {
		Integer amount = accounts.get(user);
		return amount == null ? 0 : amount;
	}
	
	
	
	
	
	/*Serializable - interfejs znacznikowy, nie zwiera on żadnej metody.
	pokazuje mazynie wirtualnej, że instancje danej klasy mogą być serializowane
	*/
	/*Serializacja to wbudowany mechanizm zapisywania obiektów, który pozwala na binarny zapis całego drzewa obiektów.
	 *  Oznacza to tyle, że jeśli mamy obiekt X, który posiada referencję do obiektu Y 
	 *  to serializując X również Y zostanie automatycznie zapisany w strumieniu wyjściowym.
	 */
	
	
	/*Dzięki temu mechanizmowi można na przykład przesyłać obiekty przez sieć. 
	 * Obiekt, który stworzyliśmy na jednym komputerze (wewnątrz pamięci jednej wirtualnej maszyny Java) może być zserializowany,
	 *  przesłany przez sieć i zdeserializowany na drugim komputerze tworząc nową instancję obiektu (wewnątrz pamięci drugiej wirtualnej maszyny Javy). 
	 *  Na obu tych komputerach wirtualna maszyna Javy musi mieć dostęp do skompilowanej wersji klasy.
	 */


}
