import java.util.*;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Human> humans = new ArrayList<Human>();
		
		Human cleopatra = new Human();
		Human titus = new Human();
		Wizard tom = new Wizard();
		Samurai osumu = new Samurai();
		Samurai mumu = new Samurai();
		Ninja nin = new Ninja();
		Samurai tommy = new Samurai();
		Human juan = new Human();
		
		
		//Human john = new Samurai("JohnnyDads");
		//humans.add(john);
		
		Samurai.howMany();
		nin.steal(osumu);
		tom.healHuman(tom);
		titus.attack(cleopatra);
		tom.fireball(cleopatra);
		osumu.meditate();
		nin.runAway();
		mumu.deathBlow(nin);
		tommy.deathBlow(juan);
		tommy.meditate();
		tommy.meditate();
		
		
		
	}
	
	
	

}
