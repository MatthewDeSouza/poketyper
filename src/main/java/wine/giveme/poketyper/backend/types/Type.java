package wine.giveme.poketyper.backend.types;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Type {
    private static final Logger logger = LoggerFactory.getLogger(Type.class);
    private final List<AbstractType> typeList;

    private final Map<String, Double> defensiveTypeValues;
    private final Map<String, Double> offensiveTypeValues;
    private final String[] descriptions;
    private final String name;

    // Constructors.
    public Type(Types... types) {
        BasicConfigurator.configure();
        if (types.length > 2) {
            logger.warn("More than two types specified! Additional types might not be accessed.");
        }
        List<AbstractType> temp = new ArrayList<>(types.length);
        for (Types type : types) {
            temp.add(setType(type));
        }
        typeList = temp;
        defensiveTypeValues = setDefensiveTypeValues();
        offensiveTypeValues = setOffensiveTypeValues();
        descriptions = setDescriptions();
        name = setName();
    }

    // Mutators.
    public Map<String, Double> getDefensiveTypeValues() {
        return defensiveTypeValues;
    }

    public Map<String, Double> getOffensiveTypeValues() {
        return offensiveTypeValues;
    }

    public String getName() {
        return name;
    }

    public String getOffensiveValueTypeName() {
        return typeList.get(0).getName();
    }

    public String[] getDescriptions() {
        return descriptions;
    }

    // Class methods.
    private AbstractType setType(Types type) {
        return switch (type) {
            case BUG -> new Bug();
            case DARK -> new Dark();
            case DRAGON -> new Dragon();
            case ELECTRIC -> new Electric();
            case FAIRY -> new Fairy();
            case FIGHTING -> new Fighting();
            case FIRE -> new Fire();
            case FLYING -> new Flying();
            case GHOST -> new Ghost();
            case GRASS -> new Grass();
            case GROUND -> new Ground();
            case ICE -> new Ice();
            case NORMAL -> new Normal();
            case POISON -> new Poison();
            case PSYCHIC -> new Psychic();
            case ROCK -> new Rock();
            case STEEL -> new Steel();
            case WATER -> new Water();
            case RANDOM -> RandomType.getRandomType();
        };
    }

    private Map<String, Double> setDefensiveTypeValues() {
        if (typeList.size() > 1) {
            logger.warn("More than one type specified (size {})! Returning defensive values for first two types.", typeList.size());
            HashMap<String, Double> temp = new HashMap<>(typeList.get(0).getDefensiveTypeValues());

            temp.forEach((k, v) -> {
                Double product = v * typeList.get(1).getDefensiveTypeValues().get(k);
                temp.put(k, product);
            });
            return temp;
        }
        return typeList.get(0).getDefensiveTypeValues();
    }

    private Map<String, Double> setOffensiveTypeValues() {
        if (typeList.size() > 1) {
            logger.warn("typeList has more than one type! (size {}) Returning offensive values for the first type.", typeList.size());
        }
        return typeList.get(0).getOffensiveTypeValues();
    }

    private String setName() {
        if (typeList.size() > 1) {
            logger.warn("More than one type specified! Name will be concatenated with '&'.");
            String[] temp = new String[typeList.size()];
            typeList.forEach(t -> temp[typeList.indexOf(t)] = t.getName());
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < typeList.size(); i++) {
                if (i % 2 == 1) {
                    output.append(" & ");
                }
                output.append(temp[i]);
            }
            return output.toString();
        }
        return typeList.get(0).getName();
    }

    private String[] setDescriptions() {
        if (typeList.size() == 1) {
            logger.warn("Only one type specified! Array is of size 1.");
            return new String[]{typeList.get(0).getDescription()};
        }
        String[] temp = new String[typeList.size()];
        typeList.forEach(t -> temp[typeList.indexOf(t)] = t.getDescription());
        return temp;
    }

    // Enum.
    public enum Types {
        BUG, DARK, DRAGON, ELECTRIC, FAIRY, FIGHTING,
        FIRE, FLYING, GHOST, GRASS, GROUND, ICE,
        NORMAL, POISON, PSYCHIC, ROCK, STEEL, WATER, RANDOM
    }
}
