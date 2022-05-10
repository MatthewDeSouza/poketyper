package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Brave extends AbstractNature {
    Brave() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.ATTACK;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.SPEED;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.SPICY;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.SWEET;
    }

}
