package wine.giveme.poketyper.backend.types;

import java.util.HashMap;

class Steel extends AbstractType {
    Steel() {
        super("The Steel type was introduced in the second generation of Pokémon games. It is the strongest " +
                "type defensively, with 10 types being not very effective against it and the Poison type having no " +
                "effect. From Pokémon X/Y onwards, it lost its Ghost and Dark resistance, those types now dealing " +
                "neutral damage. The Steel type also has the highest average Defense stat in the games.");
    }

    @Override
    public HashMap<String, Double> getDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 0.5);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.5);
        temp.put("Fighting", 2.0);
        temp.put("Fire", 2.0);
        temp.put("Flying", 0.5);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 2.0);
        temp.put("Ice", 0.5);
        temp.put("Normal", 0.5);
        temp.put("Poison", 0.0);
        temp.put("Psychic", 0.5);
        temp.put("Rock", 0.5);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        logger.info("Returning defensive type values for Steel.");
        return temp;
    }

    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 0.5);
        temp.put("Fairy", 2.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 0.5);
        logger.info("Returning offensive type values for Steel.");
        return temp;
    }
}
