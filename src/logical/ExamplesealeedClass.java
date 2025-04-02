package logical;

public sealed class ExamplesealeedClass permits Myclass1 , Myclass2 , Myclass3 {
	
	public void pr() {
		System.out.println("Method of the sealed parent class");
	}
	public static void main(String[] args) {
		Myclass1 obj = new Myclass1();
		obj.pr();
		
		Myclass2 obj1 = new Myclass2();
		obj1.pr();
		
		
		ExamplesealeedClass objparent  = new ExamplesealeedClass();
		objparent.pr();
		
	}

}

non-sealed class Myclass1 extends ExamplesealeedClass {
	public void pr() {
		System.out.println("You are in permitted class Myclass1 ");
	}
}

final class Myclass2 extends ExamplesealeedClass{
//	public void pr() {
//	System.out.println("You are in final permitted class Myclass2");
//	}

}

non-sealed class Myclass3 extends ExamplesealeedClass{
	public void pr() {
		System.out.println("You are in non sealed class Myclass3");
	}
}

class Testforsealed extends Myclass3 {
	public void print() {
		System.out.println("So this is the class which inherits the non sealed class Myclass3");
	}
}