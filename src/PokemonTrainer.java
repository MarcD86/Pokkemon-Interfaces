import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    String name;

    FirePokemon charizard = new FirePokemon("Charizard", 90, 90, "kaas", "Boom");

    WaterPokemon blastoise = new WaterPokemon("Blastoise", 20, 3, "haringSoup", "seeds");

    GrassPokemon venusaur = new GrassPokemon("Venusaur", 12, 44, "bamiBall", "hola");

    GrassPokemon ditto = new GrassPokemon("Ditto", 22, 33, "gehaktStaaf", "Hiiiiii");

    ElectricPokemon raichu = new ElectricPokemon("Raichu", 10, 23,"burgers", "brocks");

    WaterPokemon gyarados = new WaterPokemon("Gyarados", 22, 33, "kogelCake", "snackbar");

    List<Pokemon> pokemons = Arrays.asList(raichu, venusaur, ditto, charizard, blastoise, gyarados);



    public PokemonTrainer(String name) {
        this.name=name;
    }

    public PokemonTrainer(String name, ElectricPokemon raichu, GrassPokemon venusaur, GrassPokemon ditto, FirePokemon charizard, WaterPokemon blastoise, WaterPokemon gyarados) {
        this.name = name;
        this.raichu = raichu;
        this.venusaur = venusaur;
        this.ditto = ditto;
        this.charizard = charizard;
        this.blastoise = blastoise;
        this.gyarados = gyarados;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }


    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons=pokemons;
    }


    public String getName() {
        return name;
    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }



}
