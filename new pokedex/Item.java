/**
 * Represents an item that can be used by trainers or held by Pokémon.
 * 
 * @author Jairus Theo Villafranca, Marc De Roca
 */
public class Item {
    private String name;
    private String category;
    private String description;
    private String effect;
    private int buyingPrice;
    private int sellingPrice;

    /**
     * Creates a new item with the specified attributes.
     * 
     * @param name The item name
     * @param category The item category
     * @param description The item description
     * @param effect The item effect
     * @param buyingPrice The buying price
     * @param sellingPrice The selling price
     */
    public Item(String name, String category, String description, String effect, 
                int buyingPrice, int sellingPrice) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.effect = effect;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    /**
     * Gets the item name.
     * @return The item name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the item category.
     * @return The item category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the item description.
     * @return The item description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the item effect.
     * @return The item effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Gets the buying price.
     * @return The buying price
     */
    public int getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * Gets the selling price.
     * @return The selling price
     */
    public int getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Returns a string representation of the item.
     * @return String representation
     */
    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(String.format("Item: %s (%s)\n", name, category));
        sb.append(String.format("Description: %s\n", description));
        sb.append(String.format("Effect: %s\n", effect));
        sb.append(String.format("Price: Buy ₱%,d / Sell ₱%,d\n", 
                               buyingPrice, sellingPrice));
        return sb.toString(); //the system converts it to a string then stores it
    }
}