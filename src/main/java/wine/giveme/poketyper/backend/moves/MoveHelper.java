package wine.giveme.poketyper.backend.moves;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wine.giveme.poketyper.backend.types.Type;

import java.io.Serializable;

class MoveHelper {
    private final int pp;
    private final Type type;
    private final int damage;
    private final float accuracy;
    private final String description;
    private final Move.MoveCategory category;

    private static final Logger logger = LoggerFactory.getLogger(MoveHelper.class);


    MoveHelper() {

    }
}
