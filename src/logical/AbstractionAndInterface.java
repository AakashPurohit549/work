package logical;


abstract class Alien{
	public abstract void makeSound();
	
	void pr(){
		System.out.print("Non abstract method of abstract class");
	}
	
}

class Panther extends Alien{
	public void makeSound() {
		System.out.println("Lion Roars");
	}
}

class Wolf extends Alien{
	public void makeSound() {
		System.out.println("Wolf Howls");
	}
}

public class AbstractionAndInterface {
	public static void main(String[] args) {
		Panther myAnimal = new Panther();
		myAnimal.pr();
		myAnimal.makeSound();
		
	}

}
