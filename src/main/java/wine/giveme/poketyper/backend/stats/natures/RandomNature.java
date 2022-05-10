package wine.giveme.poketyper.backend.stats.natures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

class RandomNature {
    private RandomNature() {
    }

    static AbstractNature getRandomNature() {
        Logger logger = LoggerFactory.getLogger(RandomNature.class);
        logger.info("Getting random nature...");
        SecureRandom rand = new SecureRandom();
        int randomNature = rand.nextInt(Nature.Natures.values().length - 1);
        return switch (Nature.Natures.values()[randomNature]) {
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
            case RANDOM -> throw new IllegalStateException("RandomNature.getRandomNature() called with RANDOM in return statement. How did we get here?");
        };
    }
}
