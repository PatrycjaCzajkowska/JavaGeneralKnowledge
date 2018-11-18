package paczka24b_wielowątkowość;



public class Test {

	public static void main(String[] args) {
		Thread t = new Thread(new Incrementer());
		Thread t2 = new Thread(new Decrementer());
		t.run();
		t2.run();
	}

	
	/*dwa wątki, które operują niezależnie od siebie na jednej zmiennej, czyli współdzielą zasób. Jeden z nich dziesięć tysięcy razy
	dodaje do zmiennej jeden, 
	a drugi dziesięć tysięcy razy odejmuje jeden*/
	
	private static class Incrementer implements Runnable{
		
		
		@Override
		public void run() {
			for (int i=0;i<10000;i++) {
				var++;
			}
			System.out.println("Koncze z wynikiem: " + var);
		}
	}
	private static class Decrementer implements Runnable{
		
		@Override
		public void run() {
			for (int i=0;i<10000;i++) {
				var--;
			}
			System.out.println("Kończe z wynikiem: "+var);
		}
	}
	private static Integer var = 0;
}
//Aby output był prawidłowy należy te wątki skoordynować (to jest termin techniczny) używając metod wait() i notify()
