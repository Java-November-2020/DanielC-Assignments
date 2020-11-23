
public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("The gorilla threw something.");
		energyLevel -= 5;
		System.out.println("The gorilla's energy level is now: " + energyLevel);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla seems satisfied with that banana.");
		energyLevel += 10;
		System.out.println("The gorilla's energy level is now: " + energyLevel);
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		energyLevel -= 10;
		System.out.println("The gorilla's energy level is now: " + energyLevel);
	}
}
