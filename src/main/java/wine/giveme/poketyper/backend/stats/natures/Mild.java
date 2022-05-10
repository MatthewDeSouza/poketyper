package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Mild extends AbstractNature {
    Mild() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.SP_ATTACK;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.DEFENSE;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.DRY;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.SOUR;
    }
}
