package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Quiet extends AbstractNature {
    Quiet() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.SP_ATTACK;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SPEED;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.DRY;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.SWEET;
    }
}
