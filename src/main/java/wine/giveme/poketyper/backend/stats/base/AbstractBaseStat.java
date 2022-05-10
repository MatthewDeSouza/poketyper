package wine.giveme.poketyper.backend.stats.base;

abstract class AbstractBaseStat {
    private final int base;
    private final int iv;

    private int value;
    private int ev;

    AbstractBaseStat(int base, int iv) {
        this.base = base;
        this.iv = iv;
    }

    // Mutators.
    void setValue(int value) {
        this.value = value;
    }

    void setEv(int ev) {
        this.ev = ev;
    }

    String getName() {
        return getClass().getSimpleName();
    }

    int getBase() {
        return base;
    }

    int getValue() {
        return value;
    }

    int getIV() {
        return iv;
    }

    int getEV() {
        return ev;
    }

}
