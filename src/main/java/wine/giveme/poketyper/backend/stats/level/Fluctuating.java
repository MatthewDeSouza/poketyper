package wine.giveme.poketyper.backend.stats.level;

class Fluctuating extends AbstractLevel {
    Fluctuating(int level) {
        super(level);
    }

    @Override
    int getExpForLevel(int level) {
        getLogger().info("Generating Fluctuating exp for level {}", level);
        if (level > 100 || level == 1) {
            return 0;
        }
        if (level < 15) {
            return (int) (Math.pow(level, 3) * ((((level + 1.0) / 3.0) + 24) / 50.0));
        }
        if (level < 36) {
            return (int) (Math.pow(level, 3) * ((level + 14.0) / 50.0));
        }
        if (level < 100) {
            return (int) (Math.pow(level, 3) * (((level / 2.0) + 32.0) / 50.0));
        }
        return 1_640_000;
    }
}
