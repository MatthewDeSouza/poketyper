package wine.giveme.poketyper.backend.stats.level;

class Erratic extends AbstractLevel {
    Erratic(int level) {
        super(level);
    }

    @Override
    int getExpForLevel(int level) {
        getLogger().info("Generating Erratic exp for level {}", level);
        if (level > 100 || level == 1) {
            return 0;
        }
        if (level < 50) {
            return (int) ((Math.pow(level, 3) * (100.0 - level)) / 50.0);
        }
        if (level < 68) {
            return (int) ((Math.pow(level, 3) * (150.0 - level)) / 100.0);
        }
        if (level < 98) {
            return (int) (Math.pow(level, 3) * ((1911.0 - 10.0 * level) / 3.0) / 500.0);
        }
        if (level < 100) {
            return (int) ((Math.pow(level, 3) * (160.0 - level)) / 100.0);
        }
        return 600_000;
    }
}
