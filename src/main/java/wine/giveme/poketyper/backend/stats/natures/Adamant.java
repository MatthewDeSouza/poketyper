package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Adamant extends AbstractNature {
    public Adamant() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.ATTACK;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SP_ATTACK;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.SPICY;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.DRY;
    }

}
