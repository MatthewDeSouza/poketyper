package wine.giveme.poketyper.backend;

import org.apache.log4j.BasicConfigurator;
import wine.giveme.poketyper.backend.types.Type;

public class Controller {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Type type = new Type(Type.Types.RANDOM, Type.Types.RANDOM);

        System.out.println("============================== Defensive Type Values ==============================");
        type.getDefensiveTypeValues().forEach((k, v) -> System.out.printf("%s takes %.2fx damage from %s%n", type.getName(), v, k));
        System.out.print("\n\n\n");

        System.out.println("============================== Offensive Type Values ==============================");
        type.getOffensiveTypeValues().forEach((k, v) -> System.out.printf("%s deals %.2fx damage to %s%n", type.getOffensiveValueTypeName(), v, k));
    }
}
