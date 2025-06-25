/**
 * Represents a move that can be learned by Pokémon
 * 
 * @author Your Name
 */
public class Move {
    /**
     * Classification of moves (HM or TM)
     */
    public enum Classification {
        HM, TM, NORMAL; // Keeping NORMAL for backward compatibility with existing moves
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
     * Creates a new move with the specified attributes
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
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Classification getClassification() {
        return classification;
    }

    public Type getType() {
        return type;
    }
    
    public String getKind() {
        return kind;
    }
    
    public int getPower() {
        return power;
    }
    
    public String getAccuracy() {
        return accuracy;
    }
    
    public int getPP() {
        return pp;
    }
    
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