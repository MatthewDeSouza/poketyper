package wine.giveme.poketyper.backend.types;

import java.util.HashMap;

class Rock extends AbstractType {
    Rock() {
        super("Rock is a solid type as one might expect. Like Steel, Rock Pokémon usually have high defense " +
                "- however, since many Rock Pokémon are part Ground they have a 4x weakness to both Grass and Water " +
                "whose moves often come as Special type.");
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
        temp.put("Fire", 0.5);
        temp.put("Flying", 0.5);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 2.0);
        temp.put("Ground", 2.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 0.5);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 2.0);
        temp.put("Water", 2.0);
        logger.info("Returning defensive type values for Rock.");
        return temp;
    }

    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 2.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 2.0);
        temp.put("Flying", 2.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 0.5);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        logger.info("Returning offensive type values for Rock.");
        return temp;
    }
}
