/**
 * Represents a Pokémon or Move type (e.g., Fire, Water, etc.).
 * 
 * @author Jairus Theo Villafranca, Marc De Roca
 */
public enum Type {
    NORMAL, FIRE, WATER, ELECTRIC, GRASS, ICE, FIGHTING, POISON, GROUND, FLYING,
    PSYCHIC, BUG, ROCK, GHOST, DRAGON, DARK, STEEL, FAIRY, NONE;

    /**
     * Converts a string to a Type enum.
     * 
     * @param typeName The type name as a string
     * @return The corresponding Type enum or NONE if not found
     */
    public static Type fromString(String typeName) {
        if (typeName == null || typeName.trim().isEmpty()) {
            return NONE;
        }
        try {
            return Type.valueOf(typeName.toUpperCase());
        } catch (IllegalArgumentException e) {
            return NONE;
        }
    }
}