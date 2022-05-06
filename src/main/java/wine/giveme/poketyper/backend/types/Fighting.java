package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Fighting extends AbstractType {
    Fighting() {
        super("Fighting Pokémon are strong and muscle-bound, often based on martial artists. Fighting moves " +
                "are super-effective against five other types (as is Ground), making them very good offensively. " +
                "Most Fighting type moves are in the Physical category, for obvious reasons.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 0.5);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 2.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 2.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 2.0);
        temp.put("Rock", 0.5);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 2.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.5);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 0.5);
        temp.put("Ghost", 0.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 2.0);
        temp.put("Normal", 2.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 0.5);
        temp.put("Rock", 2.0);
        temp.put("Steel", 2.0);
        temp.put("Water", 1.0);
        return temp;
    }
}
