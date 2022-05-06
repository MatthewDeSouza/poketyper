package wine.giveme.poketyper.backend.types;

import java.util.HashMap;
import java.util.Map;

class Psychic extends AbstractType {
    Psychic() {
        super("The Psychic type has few outright strengths, however, it also has few weaknesses. In the " +
                "first generation it ended up being massively overpowered, mainly due to a complete lack of powerful " +
                "Bug moves, its only weakness. Furthermore, a mistake in the game meant that Ghost-type moves had no " +
                "effect on Psychic (although this only affected the low-powered Lick). Generation 2 rectified the " +
                "situation with the addition of the Dark type along with better Pokémon and moves of all types.");
    }

    @Override
    Map<String, Double> generateDefensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 2.0);
        temp.put("Dark", 2.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 0.5);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 2.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 1.0);
        temp.put("Psychic", 0.5);
        temp.put("Rock", 1.0);
        temp.put("Steel", 1.0);
        temp.put("Water", 1.0);
        return temp;
    }

    @Override
    Map<String, Double> generateOffensiveTypeValues() {
        HashMap<String, Double> temp = new HashMap<>();
        temp.put("Bug", 1.0);
        temp.put("Dark", 0.0);
        temp.put("Dragon", 1.0);
        temp.put("Electric", 1.0);
        temp.put("Fairy", 1.0);
        temp.put("Fighting", 2.0);
        temp.put("Fire", 1.0);
        temp.put("Flying", 1.0);
        temp.put("Ghost", 1.0);
        temp.put("Grass", 1.0);
        temp.put("Ground", 1.0);
        temp.put("Ice", 1.0);
        temp.put("Normal", 1.0);
        temp.put("Poison", 2.0);
        temp.put("Psychic", 0.5);
        temp.put("Rock", 1.0);
        temp.put("Steel", 0.5);
        temp.put("Water", 1.0);
        return temp;
    }
}
