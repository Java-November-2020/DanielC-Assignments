
public class Ninja extends Human {

	int stealth = 10;
	
	public void steal(Human human) {
		int newHealth;
		int healthRemoved = human.health -= this.stealth;;
		newHealth = healthRemoved;
		this.health = newHealth;
		System.out.println(human.health);
		System.out.println(this.health);
	}
	
	public void runAway() {
		this.health -= 10;
	}
	
	
}
