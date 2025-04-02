package oop;

public class MyClass1 {
	
	public static void main(String[] args) {
		Construct con = new Construct("Charles",42,1_00_000);
		con.Name = "Jhon";
		
		Construct con2 = new Construct(con);
		System.out.println(con2.Name);
		System.out.println(con2.age);
		System.out.println(con2.salary);
		
		System.out.println(con.equals(con2));
		
	}
	
}

//copy constructor for deep cloning
class Construct  {
	
	public Construct(String string, int i, int j) {
		this.Name = string;
		this.age = i;
		this.salary = j;
	}
	
	public Construct(Construct obj) {
		System.out.println("Copy Constructor called");
		
		Name = obj.Name;
		age =obj.age;
		salary =obj.salary;
		
	}
	

	public String Name;
	 
	 public int age ;
	 
	 public int salary;
	
}



