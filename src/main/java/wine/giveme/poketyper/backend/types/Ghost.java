package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Ghost extends AbstractType {
    Ghost() {
        super("Ghosts are rare Pokémon, and the only type to have two immunities. In total there are just " +
                "34 Ghost type Pokémon (not including Megas/Formes), slightly above Ice. In the first generation, " +
                "Ghost moves has no effect on Psychic Pokémon, however, it was later changed to be super-effective. " +
                "When paired with the Dark type it was the only type combination to have no weaknesses prior to Gen 6");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 0.5);
        temp.put("Dark", 2.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 0.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 2.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 0.0);
        temp.put("Poison", 0.5);
        temp.put("Psychic", 1.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 0.5);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 1.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 2.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 0.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 2.0);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        return temp;
    }
}
