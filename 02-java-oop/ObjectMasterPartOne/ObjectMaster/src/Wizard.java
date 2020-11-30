
public class Wizard extends Human{

	int health = 50;
	int intelligence = 8;
	
	public void healHuman(Human human) {
		human.health += this.intelligence;
		System.out.println(human.health);
	}
	
	public void fireball(Human human) {
		human.health -= this.intelligence * 3;
		System.out.println(human.health);
	}
	
	
}
