package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Timid extends AbstractNature {
    Timid() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return PokeMonStat.SPEED;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return PokeMonStat.ATTACK;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return Flavor.SWEET;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return Flavor.SPICY;
    }


}
