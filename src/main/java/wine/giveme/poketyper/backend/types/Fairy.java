package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Fairy extends AbstractType {
    Fairy() {
        super("The Fairy type was introduced in Generation 6 - the first new type for more than 12 years! Its " +
                "main intention was to balance the type chart by reducing the power of dragons, while also giving an " +
                "offensive boost to the Poison and Steel types. Several old Pokémon were retyped and new Pokémon " +
                "introduced. There are only around 60 Fairy type Pokémon (depending on how you count alternate forms " +
                "or mega evolutions), in total slightly above Ice.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 0.5);
        temp.put("Dragon", 0.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 2.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 2.0);
        temp.put("Water", 1.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 2.0);
        temp.put("Dragon", 2.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 2.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        return temp;
    }
}
