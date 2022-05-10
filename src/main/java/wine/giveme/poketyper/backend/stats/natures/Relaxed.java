package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Relaxed extends AbstractNature {
    Relaxed() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.DEFENSE;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SPEED;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.SOUR;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.SWEET;
    }
}
