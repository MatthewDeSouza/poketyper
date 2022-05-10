package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Impish extends AbstractNature {
    Impish() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.DEFENSE;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SP_ATTACK;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.SOUR;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.DRY;
    }
}
