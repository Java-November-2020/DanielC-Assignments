
public abstract class AbstractPokemon implements PokemonInterface {

	public Pokemon createPokemon(String name, int health, String type){
		//return Pokemon pokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Pokemon " + pokemon.name + " is of type " + pokemon.type + " and has " + pokemon.health + " health.";
	}
}
