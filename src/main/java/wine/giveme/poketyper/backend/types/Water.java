package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Water extends AbstractType {
    Water() {
        super("Water is one of the three basic elemental types along with Fire and Grass, which constitute " +
                "the three starter Pokémon. This creates a simple triangle to explain the type concept easily to new " +
                "players. Water is the most common type with over 100 Pokémon, which are based on a wide variety of " +
                "fish and other sea-dwelling creatures. As of Generation 6, Water has been paired with every other type.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 2.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 2.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 0.5);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 0.5);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 0.5);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 2.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 2.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 0.5);
        return temp;
    }
}
