import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

    //extends pokemonTrainer add
//    String name;
//    List<Pokemon> pokemons;

    public PokemonGymOwner(String name) {
        super(name);
        this.name = name;
    }

    public PokemonGymOwner(String name, String name1, List<Pokemon> pokemons) {
        super(name);
        this.name = name1;
        this.pokemons = pokemons;
    }

    public PokemonGymOwner(String name, ElectricPokemon raichu, GrassPokemon venusaur, GrassPokemon ditto, FirePokemon charizard, WaterPokemon blastoise, WaterPokemon gyarados) {
        super(name, raichu, venusaur, ditto, charizard, blastoise, gyarados);
        this.name = name;
    }

//    public PokemonGymOwner(String name) {
//        super(name);
//    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }


}
