package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Sassy extends AbstractNature {
    Sassy() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.SP_DEFENSE;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SPEED;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.BITTER;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.SWEET;
    }
}
