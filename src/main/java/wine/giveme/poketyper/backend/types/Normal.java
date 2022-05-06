package wine.giveme.poketyper.backend.types;

import java.util.HashMap;

class Normal extends AbstractType {
    Normal() {
        super("The Normal type is the most basic type of Pokémon. They are very common and appear from the " +
                "very first route you visit. Most Normal Pokémon are single type, but there is a large contingent " +
                "having a second type of Flying. Pokémon X/Y add several Normal dual-type Pokémon.");
    }

    @Override
    public HashMap<String, Double> getDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 2.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 0.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        logger.info("Returning defensive type values for Normal.");
        return temp;
    }

    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 0.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 0.5);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        logger.info("Returning offensive type values for Normal.");
        return temp;
    }
}
