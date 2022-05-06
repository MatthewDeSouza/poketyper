package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Grass extends AbstractType {
    Grass() {
        super("Grass is one of the three basic elemental types along with Fire and Water, which constitute " +
                "the three starter Pokémon. This creates a simple triangle to explain the type concept easily to new " +
                "players. Grass is one of the weakest types statistically, with 5 defensive weaknesses and 7 types " +
                "that are resistant to Grass moves. Furthermore, three type combos paired with Grass have 7 " +
                "weaknesses: Grass/Psychic, Grass/Ice, and Grass/Dark.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 2.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 0.5);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 2.0);
        temp.put("Flying", 2.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 0.5);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 2.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 0.5);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 0.5);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 0.5);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 2.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 2.0);
        return temp;
    }
}
