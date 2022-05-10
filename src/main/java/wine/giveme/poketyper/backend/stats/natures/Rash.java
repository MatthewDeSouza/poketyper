package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Rash extends AbstractNature {
    Rash() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.SP_ATTACK;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SP_DEFENSE;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.DRY;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.BITTER;
    }


}
