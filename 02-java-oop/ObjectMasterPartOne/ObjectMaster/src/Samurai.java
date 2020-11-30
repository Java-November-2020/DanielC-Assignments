
public class Samurai extends Human{

	int health = 200;
	static int samuraiCount = 0;
	String name;

	public Samurai() {
		samuraiCount++;
	}
	
	public Samurai(String name) {
		this.name = name;
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		this.health  = this.health / 2;
		System.out.println("The enemy is dead by my health is " + this.health);
	}
	
	public void meditate() {
		this.health += this.health / 2;
		System.out.println("My health is " + this.health);
	}
	
	public static void howMany() {
		System.out.println("The samurai count is: " + samuraiCount);
	}
	
}
