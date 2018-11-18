package paczka27_sieci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test {
	
	
	public static class Odczyt implements Runnable{
		private BufferedReader in;
		public Odczyt(BufferedReader in) {
			this.in = in;
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					if (in.ready()) {
						System.err.println(in.readLine());//System.err pokoloruje odebrane dane na czerwono
					}
				}
			}
			catch (Exception e) {}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
//		try(
////			ServerSocket sock = new ServerSocket(221);
////			Socket so = sock.accept();
//			Socket so = new Socket("localhost", 221);	
//			PrintWriter pw = new PrintWriter(so.getOutputStream());
//			BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream()))
//			)
//		
//		System.out.println("Nawiązałam połaczenie");
//				new Thread(new Odczyt(in).start());
//		{
//			Scanner s = new Scanner (System.in);
//			String cmd;
//			while(!(cmd = s.nextLine()).equals("exit")) {
//				pw.println(cmd);
//				pw.flush();
//			}
//			s.close();
//		}
//		catch (IOException ex) {
//			ex.printStackTrace();
//		}
	}

}
