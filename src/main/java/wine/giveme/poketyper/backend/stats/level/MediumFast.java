package wine.giveme.poketyper.backend.stats.level;

class MediumFast extends AbstractLevel {
    MediumFast(int level) {
        super(level);
    }

    @Override
    int getExpForLevel(int level) {
        getLogger().info("Generating MediumFast exp for level {}", level);
        if (level > 100 || level == 1) {
            return 0;
        }
        return (int) Math.pow(level, 3);
    }
}
