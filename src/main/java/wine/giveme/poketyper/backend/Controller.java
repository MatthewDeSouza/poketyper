package wine.giveme.poketyper.backend;

import wine.giveme.poketyper.backend.types.Type;
import java.util.Map;

public class Controller {
    public static void main(String[] args) {
        Type type = new Type("random", "random");
        System.out.println("============================== Defensive Type Values ==============================");
        for (Map.Entry<String, Double> entry : type.getDefensiveTypeValues().entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.printf("%s takes %.2fx damage from %s%n", type.getName(), value, key);
        }
        System.out.print("\n\n\n");
        System.out.println("============================== Offensive Type Values ==============================");
        try {
            for (Map.Entry<String, Double> entry : type.getOffensiveTypeValues().entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.printf("%s deals %.2fx damage to %s%n", type.getName(), value, key);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
