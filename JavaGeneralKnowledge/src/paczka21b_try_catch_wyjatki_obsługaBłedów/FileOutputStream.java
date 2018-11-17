package paczka21b_try_catch_wyjatki_obsługaBłedów;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream {
	
	

	


	public FileOutputStream(File file) {
		// TODO Auto-generated constructor stub
	}
	// obowiązkowe jest zamykanie strumieni metodą close()
	// czesto w IO przy komunikacji z odbiornikiem podnoszone są wyjątki IOException
	// klauzula finally jest wykonywana zawsze gdy program opuści bloki try- catch

//	FileOutputStream fos = null;
//	try{
//		fos = new FileOutputStream(new File("nowyplik"));
//		fos.write(null);
//	}
//	catch(FileNotFoundException e){
//		e.printStackTrace();
//	}
//	catch (IOException e){
//	e.printStackTrace();
//	}
//	catch (Exception e){
//		e.printStackTrace();
//	}
//	finally{//bez finally kod działalby , ale z finally łączy łańcuch w spójną całość
//		try {
//			fos.close();
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	//metoda close() zawsze wywołana po bloku try-catch
	//reguły try-catcha with resourse-wszystkie elementy które oznaczymy jako resource stają się finalne
	//aby oznaczyć obiekt naszej klasy jako resource – klasa musi implementować jeden z interfejsów Closeable lub AutoCloseable
    //Jeśli pojawia się wyjątek w sekcji, która nie ma try-catcha, następuje wyświetlenie StackTrace i przerwanie programu
}
