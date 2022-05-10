package wine.giveme.poketyper.backend.stats.level;

public class Level {
    private final AbstractLevel levelHandler;
    private final ExperienceType experienceType;

    public Level(int level, ExperienceType experienceType) {
        this.experienceType = experienceType;
        levelHandler = setLevelHandler(level);
    }

    // Mutators.
    public int getLevel() {
        return levelHandler.getLevel();
    }

    public int getExp() {
        return levelHandler.getExp();
    }

    public int getTotalLevelExp() {
        return levelHandler.getTotalLevelExp();
    }

    public int getExpToNextLevel() {
        return levelHandler.getExpToNextLevel();
    }

    public ExperienceType getExperienceType() {
        return experienceType;
    }

    public void addExp(int exp) {
        levelHandler.addExp(exp);
    }

    // Class methods.
    private AbstractLevel setLevelHandler(int level) {
        return switch (experienceType) {
            case ERRATIC -> new Erratic(level);
            case FAST -> new Fast(level);
            case FLUCTUATING -> new Fluctuating(level);
            case MEDIUM_FAST -> new MediumFast(level);
            case MEDIUM_SLOW -> new MediumSlow(level);
            case SLOW -> new Slow(level);
        };
    }

    // Enum.
    public enum ExperienceType {
        ERRATIC, FAST, FLUCTUATING,
        MEDIUM_FAST, MEDIUM_SLOW, SLOW
    }
}
