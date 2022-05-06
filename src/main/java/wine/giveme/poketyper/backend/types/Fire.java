package wine.giveme.poketyper.backend.types;

import java.util.HashMap;

class Fire extends AbstractType {
    Fire() {
        super("Fire is one of the three basic elemental types along with Water and Grass, which constitute " +
                "the three starter Pokémon. This creates a simple triangle to explain the type concept easily to new " +
                "players. Fire types are notoriously rare in the early stages of the games so choosing the Fire " +
                "variation starter is often a plus.");
    }

    @Override
    public HashMap<String, Double> getDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.5);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 2.0);
        temp.put("Ice", 0.5);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 2.0);
        logger.info("Returning defensive type values for Fire.");
        return temp;
    }

    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 2.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 0.5);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 2.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 0.5);
        temp.put("Steel", 2.0);
        temp.put("Water", 0.5);
        logger.info("Returning offensive type values for Fire.");
        return temp;
    }
}
