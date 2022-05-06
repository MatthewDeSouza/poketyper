package wine.giveme.poketyper.backend.types;

import java.util.HashMap;

class Poison extends AbstractType {
    Poison() {
        super("The Poison type is regarded as one of the weakest offensively. Prior to Pokémon X/Y it was " +
                "super-effective only against Grass (many of which are dual Poison so neutralizes the effect). It now " +
                "has an extra advantage against the new Fairy type. In the first generation it was also super-effective " +
                "against Bug but this was changed. It fares a little better defensively but its best advantage is " +
                "through status moves like Toxic.");
    }

    @Override
    public HashMap<String, Double> getDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.5);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 2.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 2.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        logger.info("Returning defensive type values for Poison.");
        return temp;
    }

    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 2.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 0.5);
        temp.put("Grass", 2.0);
        temp.put("Ground", 0.5);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 0.5);
        temp.put("Steel", 0.0);
        temp.put("Water", 1.0);
        logger.info("Returning offensive type values for Poison.");
        return temp;
    }
}
