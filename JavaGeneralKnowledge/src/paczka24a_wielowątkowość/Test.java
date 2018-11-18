package paczka24a_wielowątkowość;

public class Test {

	public static void main(String[] args) {
		// Wątek - proces wydzielony przez program, który wykonuje się niezależnie od reszty programu (wątku głównego)
		//programowaniu współbieżne- wielowątkowe
		//Wątki tworzymy tak jak obiekty innych klas – za pomocą słowa kluczowego new
		//Klasa Thread odpowiada za asynchroniczne wykonywanie zadań i do swojego konstruktora przyjmuje obiekt typu Runnable.
		//Wątek może korzystać ze strumieni, które zawsze będzie musiał zamknąć
		
	Thread t = new Thread(new Async());
	t.start();//metoda uruchamiająca wątek//wątek można uruchomić tylko 1, nie może być 2 razy start
//	System.out.println("Hello from Sync");
//	t.run();
	
	//metoda stop() wywołana na wątku-przerwanie wątku, zabija wątej natychmiast
	//metoda interrupt() -niewskazane używanie, przerywania jednego wątku z poziomu innego, powoduje że w wątku pojawia się wyjątek InterruptedException
	t.interrupt();
	}

	
	
	
	
	private static class Async implements Runnable{//klasa wewnętrzna
		
//		@Override
//		public void run() {//metoda uruchamia ciało metody run() znajdującej się w obiekcie typu Runnable, który podawaliśmy jako argument
//			for (int i=0;i<10;i++) {
//				System.out.println("Hello from Async");
//			}
//		}
		
		
//		@Override
//		public void run() {
//			try {
//				while(true) {
//					Thread.sleep(0);//Metoda Thread.sleep() wstrzymuje wykonanie wątku na określoną ilość milisekund i może podnosić InterruptedException
//				}
//			}
//			catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
//	public void run() {
//		while(true) {
//			if(Thread.currentThread().isInterrupted()) {//metoda isInterrupted() - po ich zakończeniu transakcji będziemy sprawdzać czy możemy iść dalej, czy przerywamy wykonanie
//				System.out.println("Kończę wykonanie"); //currentThread() zwraca obecnie wykonywany wątek
//				return;
//			}
//		}
		//inny przykład działania interrupted():
		// jeśli wątek został zakłócony i dwa razy wywołamy metodę interruped() zwróci ona true tylko przy pierwszym wywołaniu. Możemy ją wywołać również bezpośrednio na klasie Thread

		@Override
		public void run() {
		System.out.println(Thread.currentThread().interrupted());
		System.out.println(Thread.currentThread().interrupted());
		System.out.println(Thread.currentThread().interrupted());}
	
		
	}}
	

