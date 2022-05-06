package wine.giveme.poketyper.backend.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Type {
    private static final String RANDOM = "Random";
    private final String[] typesArray = {"Bug", "Dark", "Dragon", "Electric", "Fairy", "Fighting",
            "Fire", "Flying", "Ghost", "Grass", "Ground", "Ice",
            "Normal", "Poison", "Psychic", "Rock", "Steel", "Water"};
    private final boolean isDualType;
    private final AbstractType typeOne;
    private AbstractType typeTwo;
    private Map<String, Double> defensiveTypeValues;
    private Map<String, Double> offensiveTypeValues;
    private static final Logger logger = LoggerFactory.getLogger(Type.class);

    public Type(String name) {
        isDualType = false;
        if (name.equalsIgnoreCase(RANDOM)) {
            logger.info("Random flag set, generating random type");
            SecureRandom rand = new SecureRandom();
            // pick a random type
            int randomType = rand.nextInt(typesArray.length);
            name = typesArray[randomType];
        } else {
            logger.info("Creating single-type Type: {}", name);
        }
        typeOne = setType(name);
        setTypeValues();
    }

    public Type(String nameOne, String nameTwo) {
        logger.info("Creating new dual-type Type: {} and {}", nameOne, nameTwo);
        isDualType = true;
        if (nameOne.equalsIgnoreCase(RANDOM)) {
            SecureRandom rand = new SecureRandom();
            int randomType = rand.nextInt(typesArray.length);
            typeOne = setType(typesArray[randomType]);
        } else {
            typeOne = setType(nameOne);
        }
        if (nameTwo.equalsIgnoreCase(RANDOM)) {
            SecureRandom rand = new SecureRandom();
            int randomType = rand.nextInt(typesArray.length);
            typeTwo = setType(typesArray[randomType]);
        } else {
            typeTwo = setType(nameTwo);
        }
        setTypeValues();
    }

    public Type() {
        this(RANDOM);
    }

    // Static methods.
    private static AbstractType setType(String typeString) {
        return switch (typeString.toUpperCase()) {
            case "BUG" -> new Bug();
            case "DARK" -> new Dark();
            case "DRAGON" -> new Dragon();
            case "ELECTRIC" -> new Electric();
            case "FAIRY" -> new Fairy();
            case "FIGHTING" -> new Fighting();
            case "FIRE" -> new Fire();
            case "FLYING" -> new Flying();
            case "GHOST" -> new Ghost();
            case "GRASS" -> new Grass();
            case "GROUND" -> new Ground();
            case "ICE" -> new Ice();
            case "NORMAL" -> new Normal();
            case "POISON" -> new Poison();
            case "PSYCHIC" -> new Psychic();
            case "ROCK" -> new Rock();
            case "STEEL" -> new Steel();
            case "WATER" -> new Water();
            default -> throw new IllegalArgumentException();
        };
    }


    // Mutators
    public Map<String, Double> getDefensiveTypeValues() {
        return defensiveTypeValues;
    }

    public boolean isDualType() {
        return isDualType;
    }

    // Class methods.
    private void setTypeValues() {
        defensiveTypeValues = new HashMap<>();
        offensiveTypeValues = new HashMap<>();
        if (isDualType) {
            logger.info("Generating defensive type values for dual-type Type");
            for (String type : typesArray) {
                Double product = typeOne.getDefensiveTypeValues().get(type) * typeTwo.getDefensiveTypeValues().get(type);
                defensiveTypeValues.put(type, product);
            }
        } else {
            logger.info("Generating defensive type values for single-type Type");
            defensiveTypeValues = typeOne.getDefensiveTypeValues();
            logger.info("Generating offensive type values for single-type Type");
            offensiveTypeValues = typeOne.getOffensiveTypeValues();
        }
    }

    public Map<String, Double> getOffensiveTypeValues() throws IllegalAccessError {
        if (isDualType) {
            logger.error("Cannot get offensive type values for dual-type Type");
            throw new IllegalAccessError("Dual types do not have an offensive type value.");
        }
        return offensiveTypeValues;
    }

    public String[] getDescription() {
        return (isDualType) ? new String[]{typeOne.getDescription(), typeTwo.getDescription()} :
                new String[]{typeOne.getDescription()};
    }

    public String getName() {
        return (isDualType) ? typeOne.getName() + " & " + typeTwo.getName() : typeOne.getName();
    }
}
