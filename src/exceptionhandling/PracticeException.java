package exceptionhandling;

public class PracticeException {
	public static void main(String[] args) {
		//where exception can occur 
		try {
			String str = null;
			int n = str.length();
		System.out.println(div(1,0));
		} catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}catch(NullPointerException e) {
			System.out.println("String is null ..."); //multiple catch blocks can be used
		}
		System.out.println(sum(5,4));
		System.out.println(sub(25,10));
	}
	
	public static double div(int a, int b){
		return a/b;
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a+b;
	}

}
