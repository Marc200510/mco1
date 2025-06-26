import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Pokémon with its attributes and abilities.
 * 
 * @author Jairus Theo Villafranca, Marc De Roca
 */
public class Pokemon {
    private int pokedexNumber;
    private String name;
    private Type type1;
    private Type type2;
    private int baseLevel;
    private int evolvesFrom;
    private int evolvesTo;
    private int evolutionLevel;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private List<Move> moveSet;
    private Item heldItem;

    /**
     * Creates a new Pokémon with the specified attributes.
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
     * Makes the Pokémon cry.
     */
    public void cry() {
        System.out.println(name + " makes its cry sound!");
    }

    /**
     * Gets the Pokédex number.
     * @return The Pokédex number
     */
    public int getPokedexNumber() {
        return pokedexNumber;
    }

    /**
     * Gets the Pokémon's name.
     * @return The Pokémon's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the primary type.
     * @return The primary type
     */
    public Type getType1() {
        return type1;
    }

    /**
     * Gets the secondary type.
     * @return The secondary type
     */
    public Type getType2() {
        return type2;
    }

    /**
     * Gets the base level.
     * @return The base level
     */
    public int getBaseLevel() {
        return baseLevel;
    }

    /**
     * Gets the Pokédex number of the pre-evolution.
     * @return The Pokédex number of the pre-evolution
     */
    public int getEvolvesFrom() {
        return evolvesFrom;
    }

    /**
     * Gets the Pokédex number of the evolution.
     * @return The Pokédex number of the evolution
     */
    public int getEvolvesTo() {
        return evolvesTo;
    }

    /**
     * Gets the level at which it evolves.
     * @return The level at which it evolves
     */
    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    /**
     * Gets the base HP stat.
     * @return The base HP stat
     */
    public int getHp() {
        return hp;
    }

    /**
     * Gets the base Attack stat.
     * @return The base Attack stat
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Gets the base Defense stat.
     * @return The base Defense stat
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Gets the base Speed stat.
     * @return The base Speed stat
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the move set of the Pokémon.
     * @return A copy of the move set list
     */
    public List<Move> getMoveSet() {
        return new ArrayList<>(moveSet);
    }

    /**
     * Sets the move set for the Pokémon.
     * @param moveSet The list of moves
     */
    public void setMoveSet(List<Move> moveSet) {
        this.moveSet = new ArrayList<>(moveSet);
    }

    /**
     * Gets the held item.
     * @return The held item, or null if none
     */
    public Item getHeldItem() {
        return heldItem;
    }

    /**
     * Sets the held item.
     * @param item The item to hold
     */
    public void setHeldItem(Item item) {
        this.heldItem = item;
    }

    /**
     * Adds a move to the move set.
     * @param move The move to add
     */
    public void addMoveToSet(Move move) {
        moveSet.add(move);
    }

    /**
     * Removes a move from the move set by index.
     * @param moveIndex The index of the move to remove
     */
    public void removeMoveFromSet(int moveIndex) {
        moveSet.remove(moveIndex);
    }

    /**
     * Gets the size of the move set.
     * @return The number of moves in the move set
     */
    public int getMoveSetSize() {
        return moveSet.size();
    }

    /**
     * Gets the move at the specified index.
     * @param index The index of the move
     * @return The move at the given index
     */
    public Move getMoveAt(int index) {
        return moveSet.get(index);
    }

    /**
     * Returns a string representation of the Pokémon.
     * @return String representation
     */
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