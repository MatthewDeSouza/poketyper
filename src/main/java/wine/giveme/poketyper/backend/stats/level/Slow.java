package wine.giveme.poketyper.backend.stats.level;

class Slow extends AbstractLevel {
    Slow(int level) {
        super(level);
    }

    @Override
    int getExpForLevel(int level) {
        getLogger().info("Generating Slow exp for level {}", level);
        if (level > 100 || level == 1) {
            return 0;
        }
        return (int) ((5.0 * Math.pow(level, 3)) / 4.0);
    }
}
