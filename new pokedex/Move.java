/**
 * Represents a move that can be learned by Pokémon.
 * 
 * @author Jairus Theo Villafranca, Marc De Roca
 */
public class Move {
    /**
     * Classification of moves (HM, TM, NORMAL).
     */
    public enum Classification {
        /** Hidden Machine move. */
        HM,
        /** Technical Machine move. */
        TM,
        /** Normal move (not HM or TM). */
        NORMAL
    }

    private int id;
    private String name;
    private String description;
    private Classification classification;
    private Type type;
    private String kind; // Physical, Special, Status
    private int power;
    private String accuracy;
    private int pp;

    /**
     * Creates a new move with the specified attributes.
     * 
     * @param id The move ID
     * @param name The move name
     * @param description The move description
     * @param classification The move classification (HM, TM, NORMAL)
     * @param type The move type
     * @param kind The move kind (Physical, Special, Status)
     * @param power The move power
     * @param accuracy The move accuracy
     * @param pp The move PP (Power Points)
     */
    public Move(int id, String name, String description, Classification classification, 
                Type type, String kind, int power, String accuracy, int pp) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.classification = classification;
        this.type = type;
        this.kind = kind;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
    }

    /**
     * Gets the move ID.
     * @return The move ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the move name.
     * @return The move name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the move description.
     * @return The move description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the move classification.
     * @return The move classification
     */
    public Classification getClassification() {
        return classification;
    }

    /**
     * Gets the move type.
     * @return The move type
     */
    public Type getType() {
        return type;
    }

    /**
     * Gets the move kind (Physical, Special, Status).
     * @return The move kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * Gets the move power.
     * @return The move power
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets the move accuracy.
     * @return The move accuracy
     */
    public String getAccuracy() {
        return accuracy;
    }

    /**
     * Gets the move PP (Power Points).
     * @return The move PP
     */
    public int getPP() {
        return pp;
    }

    /**
     * Returns a string representation of the move.
     * @return String representation
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Move: %s (%s)\n", name, classification));
        sb.append(String.format("Type: %s (%s)\n", type, kind));
        sb.append(String.format("Power: %d | Accuracy: %s | PP: %d\n", power, accuracy, pp));
        sb.append(String.format("Description: %s\n", description));
        return sb.toString();
    }
}