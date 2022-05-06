package wine.giveme.poketyper.backend.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

class RandomType {
    private RandomType() {
    }

    static AbstractType getRandomType() {
        Logger logger = LoggerFactory.getLogger(RandomType.class);
        logger.info("Getting random type...");
        SecureRandom rand = new SecureRandom();
        int randomType = rand.nextInt(Type.Types.values().length - 1);
        return switch (Type.Types.values()[randomType]) {
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
            case RANDOM -> throw new IllegalStateException("RandomType.getRandomType() called with RANDOM in return statement. How did we get here?");
        };
    }
}
