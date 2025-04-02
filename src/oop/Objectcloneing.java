package oop;

public class Objectcloneing implements Cloneable  {
	public String name;
	public String address;
	public int age;
	public float salary;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public Objectcloneing() {
		
	}
	
	public Objectcloneing(String name , String address , int age , float salary) {
		this(name,salary);
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	
	public Objectcloneing(String name , float salary) {
		this.name = name;
		this.salary = salary;
		
		
	}
	
	@Override
	public Objectcloneing clone() throws CloneNotSupportedException {
		Objectcloneing clonedObj = (Objectcloneing) super.clone();
		return clonedObj;
	}
	
	@Override
	public String toString() {
		return "[ Name = " + name + 
	"\nAddress = " + address + 
	"\nAge = " + age + 
	"\nSalary = " + salary +
	"]\n";
		
	}
	
	public static void main(String[] args) {
		Objectcloneing myObj1 = new Objectcloneing();
		myObj1.name ="Rahul";
		myObj1.address = "Mexico";
		myObj1.age = 25;
		myObj1.salary = 24_999.99f;
		
		Objectcloneing myObj2 = new Objectcloneing();
		
		myObj2 = myObj1;
		
		System.out.println(myObj2.toString());
		//System.out.println(myObj2);
		
		//this will give same hash code, that means shallow copy is created
		System.out.println(myObj1.hashCode());
		System.out.println(myObj2.hashCode());
		System.out.println(myObj1.equals(myObj2));
		                                                                                                                                                                                                 
	}
}
