package wine.giveme.poketyper.backend.types;

import org.slf4j.Logger;

import java.util.Map;

abstract class AbstractType {
    private final String description;

    private final Map<String, Double> defensiveTypeValues;
    private final Map<String, Double> offensiveTypeValues;

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(AbstractType.class.getName());

    AbstractType(String description) {
        this.description = description;
        defensiveTypeValues = generateDefensiveTypeValues();
        logger.info("Generated defensive type values.");
        offensiveTypeValues = generateOffensiveTypeValues();
        logger.info("Generated offensive type values.");
    }

    // Mutators.
    String getName() {
        return getClass().getSimpleName();
    }

    String getDescription() {
        return description;
    }

    // Static methods.
    public Map<String, Double> getDefensiveTypeValues() {
        return defensiveTypeValues;
    }

    abstract Map<String, Double> generateDefensiveTypeValues();
    abstract Map<String, Double> generateOffensiveTypeValues();

    public Map<String, Double> getOffensiveTypeValues() {
        return offensiveTypeValues;
    }

}
