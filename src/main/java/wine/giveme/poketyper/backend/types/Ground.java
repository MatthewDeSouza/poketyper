package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Ground extends AbstractType {
    Ground() {
        super("Ground is one of the strongest types offensively: it is super-effective against five other " +
                "types (as is Fighting) and Earthquake is one of the strongest moves in the game with power and " +
                "accuracy both 100. Unfortunately, many Ground type Pokémon are dual Rock types, lumbering them " +
                "with 4x Grass and Water disadvantages.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 0.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 2.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 0.5);
        temp.put("Steel", 1.0);
        temp.put("Water", 2.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 2.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 2.0);
        temp.put("Flying", 0.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 2.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 2.0);
        temp.put("Water", 1.0);
        return temp;
    }
}
