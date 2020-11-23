
public class Bat {
	int batEnergyLevel = 300;
	
	public void fly() {
		System.out.print("*Wings take flight sound");
		batEnergyLevel -=50;
		System.out.print("The bats remaining energy is: " + batEnergyLevel);
	}
	
	public void eatHumans() {
		System.out.println("*munching sound of human bones");
		batEnergyLevel += 25;
		System.out.print("The bats remaining energy is: " + batEnergyLevel);
		
	}
	
	public void attackTown() {
		System.out.print("*Sound of town burning");
		batEnergyLevel -= 100;
		System.out.print("The bats remaining energy is: " + batEnergyLevel);
	}
}
