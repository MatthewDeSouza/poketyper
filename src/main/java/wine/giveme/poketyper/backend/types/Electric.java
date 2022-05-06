package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Electric extends AbstractType {
    Electric() {
        super("There are relatively few Electric Pokémon; in fact only four were added in the third generation. " +
                "Most are based on rodents or inanimate objects. Electric Pokémon are very good defensively, being " +
                "weak only to Ground moves. Eelektross is the only Pokémon to have no type disadvantages due to  " +
                "its ability, Levitate");
    }


    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 0.5);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 0.5);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 2.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 0.5);
        temp.put("Electric", 0.5);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 2.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 0.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 2.0);
        return temp;
    }
}
