package wine.giveme.poketyper.backend.types;


import java.util.HashMap;

class Bug extends AbstractType {
    Bug() {
        super("Most Bug Pokémon grow quickly and evolve sooner than other types. As a result, they are often " +
                "very weak. In Generation I, bugs were almost useless since the few Bug type moves available were " +
                "very weak. The situation improved in later games with better moves and an advantage against the Dark type.");
    }

    @Override
    public HashMap<String, Double> getDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 2.0);
        temp.put("Flying", 2.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 0.5);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 2.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        logger.info("Returning defensive type values for Bug.");
        return temp;
    }


    @Override
    public HashMap<String, Double> getOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 2.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.5);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 0.5);
        temp.put("Flying", 0.5);
        temp.put("Ghost", 0.5);
        temp.put("Grass", 2.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 2.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        logger.info("Returning offensive type values for Bug.");
        return temp;
    }
}
