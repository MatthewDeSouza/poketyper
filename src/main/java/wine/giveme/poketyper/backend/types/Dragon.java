package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Dragon extends AbstractType {
    Dragon() {
        super("Dragons are among the most elusive and powerful of all Pokémon. Nine legendary Pokémon are part Dragon " +
                "type and four have legendary-like stats. They are notoriously difficult to train due to requiring more " +
                "EXP points per level than most non-legendary Pokémon, and the fact they evolve much later and thus are " +
                "in their weaker forms for longer. Interestingly, many final-evolution Dragon types have a 4x weakness to the Ice type");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 2.0);
        temp.put("Electric", 0.5);
        temp.put("Fairy", 2.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 0.5);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 0.5);
        temp.put("Ground", 1.0);
        temp.put("Ice", 2.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 0.5);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 1.0);
        temp.put("Dragon", 2.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 0.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        return temp;
    }
}
