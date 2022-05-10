package wine.giveme.poketyper.backend.stats.level;

class Fast extends AbstractLevel {
    Fast(int level) {
        super(level);
    }

    @Override
    int getExpForLevel(int level) {
        getLogger().info("Generating Fast exp for level {}", level);
        if (level > 100 || level == 1) {
            return 0;
        }
        return (int) (Math.pow(level, 3) * (100 - level)) / 50;
    }
}

