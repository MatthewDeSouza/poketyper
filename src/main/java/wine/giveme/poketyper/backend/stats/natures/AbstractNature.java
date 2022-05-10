package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

abstract class AbstractNature {
    private final PokeMonStat affectsPositive;
    private final PokeMonStat affectsNegative;
    private final Flavor berryFlavorLiked;
    private final Flavor berryFlavorDisliked;

    AbstractNature() {
        affectsPositive = setAffectsPositive();
        affectsNegative = setAffectsNegative();

        berryFlavorLiked = setBerryFlavorLiked();
        berryFlavorDisliked = setBerryFlavorDisliked();
    }

    // Getters
    String getName() {
        return getClass().getSimpleName();
    }

    PokeMonStat getAffectsPositive() {
        return affectsPositive;
    }

    PokeMonStat getAffectsNegative() {
        return affectsNegative;
    }

    Flavor getBerryFlavorLiked() {
        return berryFlavorLiked;
    }

    Flavor getBerryFlavorDisliked() {
        return berryFlavorDisliked;
    }

    // Abstract Setters.
    abstract PokeMonStat setAffectsPositive();

    abstract PokeMonStat setAffectsNegative();

    abstract Flavor setBerryFlavorLiked();

    abstract Flavor setBerryFlavorDisliked();
}
