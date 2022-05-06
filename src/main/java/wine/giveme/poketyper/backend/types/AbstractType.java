package wine.giveme.poketyper.backend.types;

import org.slf4j.Logger;

import java.util.Map;

abstract class AbstractType {
    private final String description;

    final Logger logger;

    AbstractType(String description) {
        this.description = description;
        logger = org.slf4j.LoggerFactory.getLogger(getClass());
    }

    // Mutators.
    public String getName() {
        return getClass().getSimpleName();
    }

    public String getDescription() {
        return description;
    }

    // Static methods.
    public abstract Map<String, Double> getDefensiveTypeValues();


    public abstract Map<String, Double> getOffensiveTypeValues();

}
