package wine.giveme.poketyper.backend.stats.level;

class MediumSlow extends AbstractLevel {
    MediumSlow(int level) {
        super(level);
    }

    @Override
    int getExpForLevel(int level) {
        getLogger().info("Generating MediumSlow exp for level {}", level);
        if (level > 100 || level == 1) {
            return 0;
        }
        return (int) (1.2 * Math.pow(level, 3)) - (int) (15 * Math.pow(level, 2)) + (100 * level) - 140;
    }
}
