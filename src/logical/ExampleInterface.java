package logical;

 interface ExampleInterface {
	
	int factorial(int n);
	
	abstract int sub(int a, int b);
	
	 void prN();
	
	 static int multiply(int a, int b) {
		 return a * b;
	 }
}

class Mylib implements ExampleInterface{
	
	public void prN() {
		System.out.println(
				"If you want private method inside the interface "
				+ "then it must be provided a body in the interface");
	}
	
	public int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		int ans =1;
		for(int i=2; i<=n; i++) {
			ans = ans * i;
		}
		return ans;
	}
}
