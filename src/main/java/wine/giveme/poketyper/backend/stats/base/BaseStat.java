package wine.giveme.poketyper.backend.stats.base;

public class BaseStat {
    private final AbstractBaseStat abstractBaseStat;
    private final PokeMonStat statType;

    public BaseStat(PokeMonStat stat, int base, int iv) {
        statType = stat;
        abstractBaseStat = setStat(stat, base, iv);
    }

    // Class methods.
    private static AbstractBaseStat setStat(PokeMonStat stat, int base, int iv) {
        return switch (stat) {
            case HP -> new HP(base, iv);
            case ATTACK -> new Attack(base, iv);
            case DEFENSE -> new Defense(base, iv);
            case SP_ATTACK -> new SpecialAttack(base, iv);
            case SP_DEFENSE -> new SpecialDefense(base, iv);
            case SPEED -> new Speed(base, iv);
        };
    }


    // Mutators.

    public PokeMonStat getStatType() {
        return statType;
    }

    public String getName() {
        return abstractBaseStat.getName();
    }

    public enum PokeMonStat {
        HP, ATTACK, DEFENSE, SP_ATTACK, SP_DEFENSE, SPEED
    }
}
