
public class Pokemon {
	String name;
	int health;
	String type;
	
	int count;
	
	// Constructor to set variables and count num of pokemon
	public Pokemon(String name, int hp, String type) {
		name = this.name;
		health = hp;
		type = this.type;
		count++;
	}
	
	// Attacking Method
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	
	// Getter Methods
	public String getName(Pokemon pokemon) {
		return this.name;
	}
	
	public int getHealth(Pokemon pokemon) {
		return this.health;
	}
	
	public String getType(Pokemon pokemon) {
		return this.type;
	}
	
	//Setter Methods
	public void setName(Pokemon pokemon, String newName) {
		pokemon.name = newName;
	}
	
	public void setHealth(Pokemon pokemon, int newHealth) {
		pokemon.health = newHealth;
	}
	
	public void setType(Pokemon pokemon, String newType) {
		pokemon.type = newType;
	}
	
	
}
