package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Flying extends AbstractType {
    Flying() {
        super("Most Flying type Pokémon are based on birds or insects, along with some mythical creatures " +
                "like dragons. On average they are faster than any other type. Nearly every Flying type has Flying " +
                "as the secondary type, usually with Normal. There are only three pure Flying type Pokémon " +
                "(Tornadus, Rookidee, Corvisquire), and four Pokémon with Flying as a primary type (Noibat, Noivern, " +
                "Corviknight, Cramorant). As of Generation 6, the type has also been paired with every other type.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 2.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 0.0);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 2.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 0.5);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 2.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 2.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 0.5);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        return temp;
    }
}
