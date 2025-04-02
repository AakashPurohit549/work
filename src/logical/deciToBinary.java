package logical;

public class deciToBinary {
	
	public static void main(String[] args) {
		int n = 15; //101010
		//System.out.println(intToBinary(n));
		
		//trying to instantiate the interface class
		ExampleInterface myObj = new Mylib();
		myObj.prN();
		
		
		Mylib obj = new Mylib();
		int ans = obj.factorial(5);
		obj.prN();
		System.out.println(ans);
		int result = ExampleInterface.multiply(5,5);
		System.out.println(result);
	
	}
	
	public static int intToBinary(int n) { 
		int ans = 0;
		int pow=0;
		int bin = 0;
		while(n > 0) {
			int rem = n % 2;
			bin = bin+(rem*(int)Math.pow(10, pow));
			pow++;
			n = n/2;
		}
		return bin;
		
	}

}
