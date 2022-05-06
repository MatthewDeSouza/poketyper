package wine.giveme.poketyper;


import org.junit.jupiter.api.Test;
import wine.giveme.poketyper.backend.types.Type;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TypeTest {
    private final Type type1 = new Type(Type.Types.BUG, Type.Types.DARK);
    private final Type type2 = new Type(Type.Types.DRAGON, Type.Types.ELECTRIC);
    private final Type type3 = new Type(Type.Types.FAIRY, Type.Types.FIGHTING);
    private final Type type4 = new Type(Type.Types.FIRE, Type.Types.FLYING);
    private final Type type5 = new Type(Type.Types.GHOST, Type.Types.GRASS);
    private final Type type6 = new Type(Type.Types.GROUND, Type.Types.ICE);
    private final Type type7 = new Type(Type.Types.NORMAL, Type.Types.POISON);
    private final Type type8 = new Type(Type.Types.PSYCHIC, Type.Types.ROCK);
    private final Type type9 = new Type(Type.Types.STEEL, Type.Types.WATER);

    private final Type type10 = new Type(Type.Types.BUG);
    private final Type type11 = new Type(Type.Types.DARK);
    private final Type type12 = new Type(Type.Types.DRAGON);
    private final Type type13 = new Type(Type.Types.ELECTRIC);
    private final Type type14 = new Type(Type.Types.FAIRY);
    private final Type type15 = new Type(Type.Types.FIGHTING);
    private final Type type16 = new Type(Type.Types.FIRE);
    private final Type type17 = new Type(Type.Types.FLYING);
    private final Type type18 = new Type(Type.Types.GHOST);
    private final Type type19 = new Type(Type.Types.GRASS);
    private final Type type20 = new Type(Type.Types.GROUND);
    private final Type type21 = new Type(Type.Types.ICE);
    private final Type type22 = new Type(Type.Types.NORMAL);
    private final Type type23 = new Type(Type.Types.POISON);
    private final Type type24 = new Type(Type.Types.PSYCHIC);
    private final Type type25 = new Type(Type.Types.ROCK);
    private final Type type26 = new Type(Type.Types.STEEL);
    private final Type type27 = new Type(Type.Types.WATER);

    @Test
    void testSingleTypeGetName() {
        assertEquals("Bug", type10.getName());
        assertEquals("Dark", type11.getName());
        assertEquals("Dragon", type12.getName());
        assertEquals("Electric", type13.getName());
        assertEquals("Fairy", type14.getName());
        assertEquals("Fighting", type15.getName());
        assertEquals("Fire", type16.getName());
        assertEquals("Flying", type17.getName());
        assertEquals("Ghost", type18.getName());
        assertEquals("Grass", type19.getName());
        assertEquals("Ground", type20.getName());
        assertEquals("Ice", type21.getName());
        assertEquals("Normal", type22.getName());
        assertEquals("Poison", type23.getName());
        assertEquals("Psychic", type24.getName());
        assertEquals("Rock", type25.getName());
        assertEquals("Steel", type26.getName());
        assertEquals("Water", type27.getName());
    }

    @Test
    void testDualTypeGetName() {
        assertEquals("Bug & Dark", type1.getName());
        assertEquals("Dragon & Electric", type2.getName());
        assertEquals("Fairy & Fighting", type3.getName());
        assertEquals("Fire & Flying", type4.getName());
        assertEquals("Ghost & Grass", type5.getName());
        assertEquals("Ground & Ice", type6.getName());
        assertEquals("Normal & Poison", type7.getName());
        assertEquals("Psychic & Rock", type8.getName());
        assertEquals("Steel & Water", type9.getName());
    }

    @Test
    void testSingleTypeGetDefensiveValues() {
        Map<String, Double> test = new HashMap<>();

        // Bug
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.5);
        test.put("Fire", 2.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 0.5);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type10.getDefensiveTypeValues());

        // Dark
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 0.5);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 2.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 0.5);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 0.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type11.getDefensiveTypeValues());

        // Dragon
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 2.0);
        test.put("Electric", 0.5);
        test.put("Fairy", 2.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 1.0);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 0.5);
        assertEquals(test, type12.getDefensiveTypeValues());

        // Electric
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.5);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 0.5);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type13.getDefensiveTypeValues());

        // Fairy
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 0.5);
        test.put("Dragon", 0.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.5);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 2.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 2.0);
        test.put("Water", 1.0);
        assertEquals(test, type14.getDefensiveTypeValues());

        // Fighting
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 0.5);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 2.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 2.0);
        test.put("Rock", 0.5);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type15.getDefensiveTypeValues());

        // Fire
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 0.5);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 0.5);
        test.put("Water", 2.0);
        assertEquals(test, type16.getDefensiveTypeValues());

        // Flying
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 2.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.5);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 0.0);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type17.getDefensiveTypeValues());

        // Ghost
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 2.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 2.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 0.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type18.getDefensiveTypeValues());

        // Grass
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.5);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 2.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 0.5);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 2.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 0.5);
        assertEquals(test, type19.getDefensiveTypeValues());

        // Ground
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 1.0);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 0.5);
        test.put("Steel", 1.0);
        test.put("Water", 2.0);
        assertEquals(test, type20.getDefensiveTypeValues());

        // Ice
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 2.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 0.5);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 2.0);
        test.put("Water", 1.0);
        assertEquals(test, type21.getDefensiveTypeValues());

        // Normal
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 0.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type22.getDefensiveTypeValues());

        // Poison
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 0.5);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 2.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type23.getDefensiveTypeValues());

        // Psychic
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 2.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.5);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 2.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 0.5);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type24.getDefensiveTypeValues());

        // Rock
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 0.5);
        test.put("Flying", 0.5);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 0.5);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 2.0);
        test.put("Water", 2.0);
        assertEquals(test, type25.getDefensiveTypeValues());

        // Steel
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 0.5);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 2.0);
        test.put("Fire", 2.0);
        test.put("Flying", 0.5);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 0.5);
        test.put("Normal", 0.5);
        test.put("Poison", 0.0);
        test.put("Psychic", 0.5);
        test.put("Rock", 0.5);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type26.getDefensiveTypeValues());

        // Water
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 2.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 1.0);
        test.put("Ice", 0.5);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 0.5);
        assertEquals(test, type27.getDefensiveTypeValues());

        test.clear();
    }

    @Test
    void testSingleTypeGetOffensiveValues() {
        HashMap<String, Double> test = new HashMap<>();

        // Bug
        test.put("Bug", 1.0);
        test.put("Dark", 2.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 0.5);
        test.put("Fire", 0.5);
        test.put("Flying", 0.5);
        test.put("Ghost", 0.5);
        test.put("Grass", 2.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 2.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type10.getOffensiveTypeValues());

        // Dark
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 0.5);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 0.5);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 2.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 2.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type11.getOffensiveTypeValues());

        // Dragon
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 2.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type12.getOffensiveTypeValues());

        // Electric
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 0.5);
        test.put("Electric", 0.5);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 0.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 2.0);
        assertEquals(test, type13.getOffensiveTypeValues());

        // Fairy
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 2.0);
        test.put("Dragon", 2.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type14.getOffensiveTypeValues());

        // Fighting
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 2.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 0.5);
        test.put("Ghost", 0.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 2.0);
        test.put("Normal", 2.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 0.5);
        test.put("Rock", 2.0);
        test.put("Steel", 2.0);
        test.put("Water", 1.0);
        assertEquals(test, type15.getOffensiveTypeValues());

        // Fire
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 0.5);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 1.0);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 0.5);
        test.put("Steel", 2.0);
        test.put("Water", 0.5);
        assertEquals(test, type16.getOffensiveTypeValues());

        // Flying
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.5);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 0.5);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type17.getOffensiveTypeValues());

        // Ghost
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 0.5);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 2.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 0.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 2.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type18.getOffensiveTypeValues());

        // Grass
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 0.5);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 0.5);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 0.5);
        test.put("Water", 2.0);
        assertEquals(test, type19.getOffensiveTypeValues());

        // Ground
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 2.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 2.0);
        test.put("Flying", 0.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 2.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 2.0);
        test.put("Water", 1.0);
        assertEquals(test, type20.getOffensiveTypeValues());

        // Ice
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 2.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 2.0);
        test.put("Ice", 0.5);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 0.5);
        assertEquals(test, type21.getOffensiveTypeValues());

        // Normal
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 0.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 0.5);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type22.getOffensiveTypeValues());

        // Poison
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 2.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 0.5);
        test.put("Grass", 2.0);
        test.put("Ground", 0.5);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 0.5);
        test.put("Steel", 0.0);
        test.put("Water", 1.0);
        assertEquals(test, type23.getOffensiveTypeValues());

        // Psychic
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 0.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 2.0);
        test.put("Psychic", 0.5);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type24.getOffensiveTypeValues());

        // Rock
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.5);
        test.put("Fire", 2.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 0.5);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 1.0);
        assertEquals(test, type25.getOffensiveTypeValues());

        // Steel
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.5);
        test.put("Fairy", 2.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 0.5);
        test.put("Water", 0.5);
        assertEquals(test, type26.getOffensiveTypeValues());

        // Water
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 0.5);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 2.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 2.0);
        test.put("Steel", 1.0);
        test.put("Water", 0.5);
        assertEquals(test, type27.getOffensiveTypeValues());

        test.clear();
    }

    @Test
    void testDualTypeGetDefensiveValues() {
        // Bug & Dark
        Map<String, Double> test = new HashMap<>();
        test.put("Bug", 2.0);
        test.put("Dark", 0.5);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 2.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 2.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 0.5);
        test.put("Grass", 0.5);
        test.put("Ground", 0.5);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 0.0);
        test.put("Rock", 2.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type1.getDefensiveTypeValues());

        // Dragon & Electric
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 2.0);
        test.put("Electric", 0.25);
        test.put("Fairy", 2.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 0.5);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 2.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 0.5);
        test.put("Water", 0.5);
        assertEquals(test, type2.getDefensiveTypeValues());

        // Fairy & Fighting
        test.clear();
        test.put("Bug", 0.25);
        test.put("Dark", 0.25);
        test.put("Dragon", 0.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 2.0);
        test.put("Fighting", 0.5);
        test.put("Fire", 1.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 2.0);
        test.put("Psychic", 2.0);
        test.put("Rock", 0.5);
        test.put("Steel", 2.0);
        test.put("Water", 1.0);
        assertEquals(test, type3.getDefensiveTypeValues());

        // Fire & Flying
        test.clear();
        test.put("Bug", 0.25);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 2.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 0.5);
        test.put("Fire", 0.5);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 0.25);
        test.put("Ground", 0.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 4.0);
        test.put("Steel", 0.5);
        test.put("Water", 2.0);
        assertEquals(test, type4.getDefensiveTypeValues());

        // Ghost & Grass
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 2.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.5);
        test.put("Fairy", 1.0);
        test.put("Fighting", 0.0);
        test.put("Fire", 2.0);
        test.put("Flying", 2.0);
        test.put("Ghost", 2.0);
        test.put("Grass", 0.5);
        test.put("Ground", 0.5);
        test.put("Ice", 2.0);
        test.put("Normal", 0.0);
        test.put("Poison", 1.0);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 0.5);
        assertEquals(test, type5.getDefensiveTypeValues());

        // Ground & Ice
        test.clear();
        test.put("Bug", 1.0);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 0.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 2.0);
        test.put("Fire", 2.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 1.0);
        test.put("Grass", 2.0);
        test.put("Ground", 1.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 1.0);
        test.put("Rock", 1.0);
        test.put("Steel", 2.0);
        test.put("Water", 2.0);
        assertEquals(test, type6.getDefensiveTypeValues());

        // Normal & Poison
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 1.0);
        test.put("Fire", 1.0);
        test.put("Flying", 1.0);
        test.put("Ghost", 0.0);
        test.put("Grass", 0.5);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 1.0);
        test.put("Poison", 0.5);
        test.put("Psychic", 2.0);
        test.put("Rock", 1.0);
        test.put("Steel", 1.0);
        test.put("Water", 1.0);
        assertEquals(test, type7.getDefensiveTypeValues());

        // Psychic & Rock
        test.clear();
        test.put("Bug", 2.0);
        test.put("Dark", 2.0);
        test.put("Dragon", 1.0);
        test.put("Electric", 1.0);
        test.put("Fairy", 1.0);
        test.put("Fighting", 1.0);
        test.put("Fire", 0.5);
        test.put("Flying", 0.5);
        test.put("Ghost", 2.0);
        test.put("Grass", 2.0);
        test.put("Ground", 2.0);
        test.put("Ice", 1.0);
        test.put("Normal", 0.5);
        test.put("Poison", 0.5);
        test.put("Psychic", 0.5);
        test.put("Rock", 1.0);
        test.put("Steel", 2.0);
        test.put("Water", 2.0);
        assertEquals(test, type8.getDefensiveTypeValues());

        // Steel & Water
        test.clear();
        test.put("Bug", 0.5);
        test.put("Dark", 1.0);
        test.put("Dragon", 0.5);
        test.put("Electric", 2.0);
        test.put("Fairy", 0.5);
        test.put("Fighting", 2.0);
        test.put("Fire", 1.0);
        test.put("Flying", 0.5);
        test.put("Ghost", 1.0);
        test.put("Grass", 1.0);
        test.put("Ground", 2.0);
        test.put("Ice", 0.25);
        test.put("Normal", 0.5);
        test.put("Poison", 0.0);
        test.put("Psychic", 0.5);
        test.put("Rock", 0.5);
        test.put("Steel", 0.25);
        test.put("Water", 0.5);
        assertEquals(test, type9.getDefensiveTypeValues());
    }
}
