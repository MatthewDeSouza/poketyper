package wine.giveme.poketyper.backend.types;

import java.util.HashMap;

class Dark extends AbstractType {
    Dark() {
        super("The Dark type was introduced in the second generation of Pokémon games as a measure to " +
                "balance the types. In particular, its resistance to Psychic cut down that type's advantage by a " +
                "long way. When paired with the Ghost type it was the only type combination to have no weaknesses prior to Gen 6.");
    }

    @Override
    public HashMap<String, Double> getDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 2.0);
        temp.put("Dark", 0.5);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 2.0);
        temp.put("Fighting", 2.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 0.5);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 0.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        logger.info("Returning defensive type values for Dark.");
        return temp;
    }

    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 0.5);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.5);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 2.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 2.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        logger.info("Returning offensive type values for Dark.");
        return temp;
    }
}
