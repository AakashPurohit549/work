package logical;

//Heiarchical 
abstract class Bank{
	public abstract int getBalance();
	 
 }

class SBI extends Bank{
	int balance = 500;
	public int getBalance() {
		System.out.println("Your balance is : " + balance);
		return balance;
	}
	
	void prBalance(int balance) {
		System.out.print(balance);
	}
}

class Animal {
	int weight;
//	void pr () {
//		System.out.println("In the animal class");
//	}
}

class Lion extends Animal {
	int weight = 45;
	int myInt = 100;
	void pr() {
		System.out.println("Lion roaring");
	}
	
}

class Dog extends Animal {
	int weight = 14;
	void pr() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal{
	int weight = 5;
	void pr() {
		System.out.println("Mewoing");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Dog a1 = new Dog();
		a1.pr();
		
		Bank acc = new SBI();
		acc.getBalance();
		
		
		
		//object of animal class
		Animal ani = new Lion();
		//casted to lion since parent class cannot directly access the properties of the child. 
		Lion l = (Lion)ani;
		l.myInt = 200;
		
		ani.weight = 555;
		System.out.print(l.myInt);
		
		
		//System.out.println(a1.weight);
//		Cat c1 = new Cat();
//		c1.pr();
//		a1.equals(c1);
	}
	

}
