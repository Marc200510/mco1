/**
 * Represents an item that can be used by trainers or held by Pokémon
 * 
 * @author Your Name
 */
public class Item {
    private String name;
    private String category;
    private String description;
    private String effect;
    private int buyingPrice;
    private int sellingPrice;
    
    /**
     * Creates a new item with the specified attributes
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
    
    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getEffect() {
        return effect;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Item: %s (%s)\n", name, category));
        sb.append(String.format("Description: %s\n", description));
        sb.append(String.format("Effect: %s\n", effect));
        sb.append(String.format("Price: Buy ₽%,d / Sell ₽%,d\n", 
                               buyingPrice, sellingPrice));
        
        return sb.toString();
    }
}