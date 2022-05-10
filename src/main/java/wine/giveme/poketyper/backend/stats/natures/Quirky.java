package wine.giveme.poketyper.backend.stats.natures;

import wine.giveme.poketyper.backend.items.berries.Berry.Flavor;
import wine.giveme.poketyper.backend.stats.base.BaseStat.PokeMonStat;

class Quirky extends AbstractNature {
    Quirky() {
        super();
    }

    @Override
    PokeMonStat setAffectsPositive() {
        return null;
    }

    @Override
    PokeMonStat setAffectsNegative() {
        return null;
    }

    @Override
    Flavor setBerryFlavorLiked() {
        return null;
    }

    @Override
    Flavor setBerryFlavorDisliked() {
        return null;
    }


}
