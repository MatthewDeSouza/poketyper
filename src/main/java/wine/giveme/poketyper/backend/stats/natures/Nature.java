package wine.giveme.poketyper.backend.stats.natures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

public class Nature {
    private static final Logger logger = LoggerFactory.getLogger(Nature.class);

    private final AbstractNature natureObj;
    private final Natures natureEnum;

    public Nature(Natures natureEnum) {
        this.natureEnum = natureEnum;
        this.natureObj = setNature(natureEnum);
        logger.info("{}: Instantiating...", this.natureObj.getName());
    }

    // Getters.
    public String getName() {
        return natureObj.getName();
    }

    public Natures getNature() {
        return natureEnum;
    }

    public PokeMonStat getStatEffectedPositive() {
        return natureObj.getAffectsPositive();
    }

    public PokeMonStat getStatEffectedNegative() {
        return natureObj.getAffectsNegative();
    }

    public Flavor getBerryFlavorLiked() {
        return natureObj.getBerryFlavorLiked();
    }

    public Flavor getBerryFlavorDisliked() {
        return natureObj.getBerryFlavorDisliked();
    }

    // Class methods.
    private AbstractNature setNature(Natures nature) {
        return switch (nature) {
            case ADAMANT -> new Adamant();
            case BASHFUL -> new Bashful();
            case BOLD -> new Bold();
            case BRAVE -> new Brave();
            case CALM -> new Calm();
            case CAREFUL -> new Careful();
            case DOCILE -> new Docile();
            case GENTLE -> new Gentle();
            case HARDY -> new Hardy();
            case HASTY -> new Hasty();
            case IMPISH -> new Impish();
            case JOLLY -> new Jolly();
            case LAX -> new Lax();
            case LONELY -> new Lonely();
            case MILD -> new Mild();
            case MODEST -> new Modest();
            case NAIVE -> new Naive();
            case NAUGHTY -> new Naughty();
            case QUIET -> new Quiet();
            case QUIRKY -> new Quirky();
            case RASH -> new Rash();
            case RELAXED -> new Relaxed();
            case SASSY -> new Sassy();
            case SERIOUS -> new Serious();
            case TIMID -> new Timid();
            case RANDOM -> RandomNature.getRandomNature();
        };
    }

    // Enum.
    public enum Natures {
        ADAMANT, BASHFUL, BOLD, BRAVE, CALM,
        CAREFUL, DOCILE, GENTLE, HARDY, HASTY,
        IMPISH, JOLLY, LAX, LONELY, MILD,
        MODEST, NAIVE, NAUGHTY, QUIET, QUIRKY,
        RASH, RELAXED, SASSY, SERIOUS, TIMID, RANDOM
    }
}
