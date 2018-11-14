package paczka9_rekursja;

public class Test {

	
	public static int fib(int n) {//metoda w ciele widzi samą siebie
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fib(n-1)+ fib(n-2);
	}
	
	
	
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	
	public static void main(String[] args) {
		
//	System.out.println(fib(2));
	System.out.println(factorial(1));	

	}

}
