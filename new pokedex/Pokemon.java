import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Pokémon with its attributes and abilities
 * 
 * @author Your Name
 */
public class Pokemon {
    private int pokedexNumber;
    private String name;
    private Type type1;
    private Type type2;
    private int baseLevel;
    private int evolvesFrom; // Pokedex number
    private int evolvesTo;   // Pokedex number
    private int evolutionLevel;
    
    // Base stats
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    
    private List<Move> moveSet;
    private Item heldItem;
    
    /**
     * Creates a new Pokémon with the specified attributes
     * 
     * @param pokedexNumber The Pokédex number
     * @param name The Pokémon's name
     * @param type1 The primary type
     * @param type2 The secondary type
     * @param baseLevel The base level
     * @param evolvesFrom The Pokédex number of the pre-evolution
     * @param evolvesTo The Pokédex number of the evolution
     * @param evolutionLevel The level at which it evolves
     * @param hp The base HP stat
     * @param attack The base Attack stat
     * @param defense The base Defense stat
     * @param speed The base Speed stat
     */
    public Pokemon(int pokedexNumber, String name, Type type1, Type type2, int baseLevel, 
                   int evolvesFrom, int evolvesTo, int evolutionLevel, 
                   int hp, int attack, int defense, int speed) {
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.baseLevel = baseLevel;
        this.evolvesFrom = evolvesFrom;
        this.evolvesTo = evolvesTo;
        this.evolutionLevel = evolutionLevel;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.moveSet = new ArrayList<>();
        this.heldItem = null;
    }
    
    /**
     * Makes the Pokémon cry (outputs its sound)
     */
    public void cry() {
        System.out.println(name + " makes its cry sound!");
    }
    
    // Getters
    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public String getName() {
        return name;
    }

    public Type getType1() {
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public int getBaseLevel() {
        return baseLevel;
    }

    public int getEvolvesFrom() {
        return evolvesFrom;
    }

    public int getEvolvesTo() {
        return evolvesTo;
    }

    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }
    
    public List<Move> getMoveSet() {
        return new ArrayList<>(moveSet);
    }
    
    public void setMoveSet(List<Move> moveSet) {
        this.moveSet = new ArrayList<>(moveSet);
    }
    
    public Item getHeldItem() {
        return heldItem;
    }
    
    public void setHeldItem(Item item) {
        this.heldItem = item;
    }
    
    public void addMoveToSet(Move move) {
        moveSet.add(move);
    }

    public void removeMoveFromSet(int moveIndex) {
        moveSet.remove(moveIndex);
    }

    public int getMoveSetSize() {
        return moveSet.size();
    }

    public Move getMoveAt(int index) {
        return moveSet.get(index);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("#%03d: %s\n", pokedexNumber, name));
        sb.append(String.format("Type: %s", type1));
        if (type2 != Type.NONE) {
            sb.append(String.format("/%s", type2));
        }
        sb.append("\n");
        sb.append(String.format("Base Level: %d\n", baseLevel));
        sb.append(String.format("Stats: HP=%d, ATK=%d, DEF=%d, SPD=%d\n", 
                               hp, attack, defense, speed));
        
        if (evolvesFrom > 0) {
            sb.append(String.format("Evolves from: #%03d\n", evolvesFrom));
        }
        if (evolvesTo > 0) {
            sb.append(String.format("Evolves to: #%03d at level %d\n", 
                                   evolvesTo, evolutionLevel));
        }
        
        return sb.toString();
    }
}