package wine.giveme.poketyper.backend.stats.level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractLevel {
    private int expToNextLevel;
    private int totalLevelExp;
    private int level;
    private int exp;

    private static final Logger logger = LoggerFactory.getLogger(AbstractLevel.class.getName());

    AbstractLevel(int level) {
        if (level > 100) {
            logger.warn("Level {} is too high. Setting to 100.", level);
            this.level = 100;
        } else if (level < 1){
            logger.warn("Level {} is too low. Setting to 1.", level);
            this.level = 1;
        } else {
            logger.info("Level {} is valid.", level);
            this.level = level;
        }
        totalLevelExp = getExpForLevel(this.level);
        expToNextLevel = getExpForLevel(this.level + 1) - totalLevelExp;
        exp = 0;
    }

    // Mutators.
    int getLevel() {
        return level;
    }

    int getExp() {
        return exp;
    }

    int getTotalLevelExp() {
        return totalLevelExp;
    }

    int getExpToNextLevel() {
        return expToNextLevel;
    }

    Logger getLogger() {
        return logger;
    }

    void addExp(int exp) {
        if (level == 100) {
            logger.error("Level is already at 100. Cannot add exp.");
        }
        this.exp += exp;
        if (this.exp >= expToNextLevel) {
            logger.info("Level {} is now {}.", level, level + 1);
            this.exp -= expToNextLevel;
            logger.info("Exp is now {}.", exp);
            level++;
            totalLevelExp = getExpForLevel(level);
            expToNextLevel = getExpForLevel(level + 1) - totalLevelExp;
        }
    }

    void upLevelNoExpRetain() {
        if (level == 100) {
            logger.error("Level is already at 100, cannot up level.");
            return;
        }
        logger.info("Level {} is now {}.", level, level + 1);
        level++;
        totalLevelExp = getExpForLevel(level);
        expToNextLevel = getExpForLevel(level + 1) - totalLevelExp;
        exp = 0;
    }



    // Class methods.
    abstract int getExpForLevel(int level);
}
