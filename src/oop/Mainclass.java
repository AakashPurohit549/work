package oop;

import java.util.LinkedList;
import java.util.List;

class Employee {
	private String name;
	
	private String address;
	
	private int age;
	
	private float salary;
    
   public Employee(String name, float salary) {
	   this.name = name;
	   this.salary = salary;
   }
   
   public Employee(String name , String address , int age , float salary) {
	   this.name = name;
	   this.address = address;
	   this.age = age;
	   this.salary = salary;
   }
	

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", Address=" + address
				+ ", Age=" + age + ", Salary=" + salary
				+ "]";
	  }

	
	//getter & setters
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}

//practice of encapsulation
public class Mainclass {
	
	
	public static void main(String[] args) {
	
		Employee dev = new Employee("Arjun",30_000);
//		dev.setName("Mark");
//		dev.setAddress("Chicago");
//		dev.setAge(24);
//		dev.setSalary(55_000);
		
//		System.out.print(dev.toString());
		
		List<Integer> mylist = new LinkedList<>();
		
		System.out.println(dev.getName());
		System.out.println(dev.getAge());
		System.out.println(dev.getSalary());
		System.out.println(dev.getAddress());
		
	}

}
