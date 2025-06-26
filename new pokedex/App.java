import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main application for the Pokédex system
 * Provides text-based menu system and all functionality
 * 
 * @author Jairus Theo Villafranca, Marc De Roca
 */
public class App {
    private Scanner scanner;
    private List<Pokemon> pokemons;
    private List<Move> moves;
    private List<Item> items;

    /**
     * Creates a new App instance and initializes data structures
     */
    public App() {
        scanner = new Scanner(System.in);
        pokemons = new ArrayList<>();
        moves = new ArrayList<>();
        items = new ArrayList<>();
        initializeDefaultData();
    }

    /**
     * Initializes default data for the application
     */
    private void initializeDefaultData() {
        // Initialize default moves
        initializeDefaultMoves();
        
        // Initialize default items
        initializeDefaultItems();
        
        // Initialize default Pokémon
        initializeDefaultPokemon();
        
    }

    /**
     * Initializes default moves
     */
    private void initializeDefaultMoves() {
        // Add some common moves
        Move tackle = new Move(1, "Tackle", "Deals damage with no additional effect.", 
                Move.Classification.NORMAL, Type.NORMAL, "Physical", 40, "100%", 35);
        moves.add(tackle);
        
        Move growl = new Move(2, "Growl", "Lowers the opponent's Attack stat.", 
                Move.Classification.NORMAL, Type.NORMAL, "Status", 0, "100%", 40);
        moves.add(growl);
        
        Move ember = new Move(3, "Ember", "May inflict a burn.", 
                Move.Classification.NORMAL, Type.FIRE, "Special", 40, "100%", 25);
        moves.add(ember);
        
        Move waterGun = new Move(4, "Water Gun", "Deals damage with no additional effect.", 
                Move.Classification.NORMAL, Type.WATER, "Special", 40, "100%", 25);
        moves.add(waterGun);
        
        Move vineWhip = new Move(5, "Vine Whip", "Deals damage with no additional effect.", 
                Move.Classification.NORMAL, Type.GRASS, "Physical", 45, "100%", 25);
        moves.add(vineWhip);
    }

    /**
     * Initializes default items
     */
    private void initializeDefaultItems() {
        // Add vitamins and training items
        items.add(new Item("HP Up", "Vitamin", "A nutritious drink for Pokémon.", 
                "+10 HP EVs", 10000, 5000));
        items.add(new Item("Protein", "Vitamin", "A nutritious drink for Pokémon.", 
                "+10 Attack EVs", 10000, 5000));
        items.add(new Item("Iron", "Vitamin", "A nutritious drink for Pokémon.", 
                "+10 Defense EVs", 10000, 5000));
        items.add(new Item("Carbos", "Vitamin", "A nutritious drink for Pokémon.", 
                "+10 Speed EVs", 10000, 5000));
        items.add(new Item("Zinc", "Vitamin", "A nutritious drink for Pokémon.", 
                "+10 Special Defense EVs", 10000, 5000));
        items.add(new Item("Rare Candy", "Leveling Item", "A candy that is packed with energy.", 
                "Increases level by 1", 0, 2400));
        items.add(new Item("Health Feather", "Feather", "A feather that slightly increases HP.", 
                "+1 HP EV", 300, 150));
        items.add(new Item("Muscle Feather", "Feather", "A feather that slightly increases Attack.", 
                "+1 Attack EV", 300, 150));
        items.add(new Item("Resist Feather", "Feather", "A feather that slightly increases Defense.", 
                "+1 Defense EV", 300, 150));
        items.add(new Item("Swift Feather", "Feather", "A feather that slightly increases Speed.", 
                "+1 Speed EV", 300, 150));
        
        // Add evolution stones
        items.add(new Item("Fire Stone", "Evolution Stone", "A stone that radiates heat.", 
                "Evolves Pokémon like Vulpix, Growlithe, Eevee (into Flareon), etc.", 3000, 1500));
        items.add(new Item("Water Stone", "Evolution Stone", "A stone with a blue, watery appearance.", 
                "Evolves Pokémon like Poliwhirl, Shellder, Eevee (into Vaporeon), etc.", 3000, 1500));
        items.add(new Item("Thunder Stone", "Evolution Stone", "A stone that sparkles with electricity.", 
                "Evolves Pokémon like Pikachu, Eevee (into Jolteon), Eelektrik, etc.", 3000, 1500));
        items.add(new Item("Leaf Stone", "Evolution Stone", "A stone with a leaf pattern.", 
                "Evolves Pokémon like Gloom, Weepinbell, Exeggcute, etc.", 3000, 1500));
        items.add(new Item("Moon Stone", "Evolution Stone", "A stone that glows faintly in the moonlight.", 
                "Evolves Pokémon like Nidorina, Clefairy, Jigglypuff, etc.", 0, 1500));
        items.add(new Item("Sun Stone", "Evolution Stone", "A stone that glows like the sun.", 
                "Evolves Pokémon like Gloom (into Bellossom), Sunkern, Cottonee, etc.", 3000, 1500));
        items.add(new Item("Shiny Stone", "Evolution Stone", "A stone that sparkles brightly.", 
                "Evolves Pokémon like Togetic, Roselia, Minccino, etc.", 3000, 1500));
        items.add(new Item("Dusk Stone", "Evolution Stone", "A dark stone that is ominous in appearance.", 
                "Evolves Pokémon like Murkrow, Misdreavus, Doublade, etc.", 3000, 1500));
        items.add(new Item("Dawn Stone", "Evolution Stone", "A stone that sparkles like the morning sky.", 
                "Evolves male Kirlia into Gallade, female Snorunt into Froslass.", 3000, 1500));
        items.add(new Item("Ice Stone", "Evolution Stone", "A stone that is cold to the touch.", 
                "Evolves Pokémon like Alolan Vulpix, Galarian Darumaka, Eevee (into Glaceon)", 3000, 1500));
    }

    /**
     * Initializes default Pokémon
     */
    private void initializeDefaultPokemon() {
        Pokemon pikachu = new Pokemon(25, "Pikachu", Type.ELECTRIC, Type.NONE, 5, 25, 26, 26, 
                35, 55, 40, 90);
        pokemons.add(pikachu);
        
        Pokemon charmander = new Pokemon(4, "Charmander", Type.FIRE, Type.NONE, 5, 4, 5, 16, 
                39, 52, 43, 65);
        pokemons.add(charmander);
        
        Pokemon squirtle = new Pokemon(7, "Squirtle", Type.WATER, Type.NONE, 5, 7, 8, 16, 
                44, 48, 65, 43);
        pokemons.add(squirtle);
        
        Pokemon bulbasaur = new Pokemon(1, "Bulbasaur", Type.GRASS, Type.POISON, 5, 1, 2, 16, 
                45, 49, 49, 45);
        pokemons.add(bulbasaur);
    }

    /**
     * Starts the application
     */
    public void start() {
        displayWelcomeMessage(); // shows the welcome banner

        boolean running = true;
        while (running) {
            displayMainMenu(); // shows the main menu
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    pokemonMenu();
                    break;
                case 2:
                    moveMenu();
                    break;
                case 3:
                    itemMenu();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("\nThank you for using the Pokédex System! Goodbye!");
    }

    /**
     * Displays the welcome message
     */
    private void displayWelcomeMessage() {
        System.out.println("==============================================");
        System.out.println("          WELCOME TO THE POKÉDEX SYSTEM        ");
        System.out.println("==============================================");
        System.out.println("This system allows you to manage Pokémon, moves, and items.");
        System.out.println("Use the menu options to navigate through the system.");
    }

    /**
     * Displays the main menu
     */
    private void displayMainMenu() {
        System.out.println("\n==============================================");
        System.out.println("                  MAIN MENU                  ");
        System.out.println("==============================================");
        System.out.println("1. Pokémon Menu");
        System.out.println("2. Moves Menu");
        System.out.println("3. Items Menu");
        System.out.println("0. Exit");
        System.out.println("==============================================");
    }

    /**
     * Handles the Pokémon menu
     */
    private void pokemonMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n==============================================");
            System.out.println("                POKÉMON MENU                ");
            System.out.println("==============================================");
            System.out.println("1. Add New Pokémon");
            System.out.println("2. Display All Pokémon");
            System.out.println("3. Search Pokémon");
            System.out.println("0. Back to Main Menu");
            System.out.println("==============================================");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addPokemon();
                    break;
                case 2:
                    displayAllPokemon();
                    break;
                case 3:
                    searchPokemonMenu();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    /**
     * Handles the moves menu
     */
    private void moveMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n==============================================");
            System.out.println("                 MOVES MENU                  ");
            System.out.println("==============================================");
            System.out.println("1. Add New Move");
            System.out.println("2. Display All Moves");
            System.out.println("3. Search Moves");
            System.out.println("0. Back to Main Menu");
            System.out.println("==============================================");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addMove();
                    break;
                case 2:
                    displayAllMoves();
                    break;
                case 3:
                    searchMovesMenu();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    /**
     * Handles the items menu
     */
    private void itemMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n==============================================");
            System.out.println("                 ITEMS MENU                  ");
            System.out.println("==============================================");
            System.out.println("1. Display All Items");
            System.out.println("2. Search Items");
            System.out.println("0. Back to Main Menu");
            System.out.println("==============================================");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    displayAllItems();
                    break;
                case 2:
                    searchItemsMenu();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    /**
     * Adds a new Pokémon
     */
    private void addPokemon() {
        System.out.println("\n=== ADD NEW POKÉMON ===");

        // get the Pokédex Number
        int pokedexNumber;
        boolean validPokedexNumber = false;

        while (!validPokedexNumber) {
            pokedexNumber = getIntInput("Enter Pokédex Number: ");

           // checks if pokédex number is already used
            boolean exists = false;
            for (Pokemon p : pokemons) {
                if (p.getPokedexNumber() == pokedexNumber) {
                    exists = true;
                    System.out.println("ERROR: Pokédex Number " + pokedexNumber + 
                            " already assigned to " + p.getName());
                    break;
                }
            }

            if (!exists) { //if its not used then ask for pokémon name
                String name = getStringInput("Enter Name: "); 
                
                // checks if name is already used
                boolean nameExists = false;
                for (Pokemon p : pokemons) {
                    if (p.getName().equalsIgnoreCase(name)) {
                        nameExists = true;
                        System.out.println("ERROR: Pokémon name '" + name + "' already exists.");
                        break;
                    }
                }
                
                if (nameExists) {
                    continue; // if name exists, ask again
                }
                
               // if pokedex number and name is valid, continue
                validPokedexNumber = true;

                // shows available types
                System.out.println("\nAvailable types:");
                for (Type type : Type.values()) {
                    if (type != Type.NONE) {
                        System.out.print(type + " ");
                    }
                }

                // asks for primary type
                Type type1 = null;
                while (type1 == null) {
                    String typeStr = getStringInput("\nEnter Type 1: ");
                    try {
                        type1 = Type.valueOf(typeStr.toUpperCase());
                        if (type1 == Type.NONE) {
                            System.out.println("ERROR: NONE is not a valid primary type.");
                            type1 = null;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERROR: Invalid type. Please enter one of the available types.");
                    }
                }

                // asks for secondary type (optional)
                Type type2 = Type.NONE;
                String typeStr = getStringInput("Enter Type 2 (leave blank if none): ");
                if (!typeStr.trim().isEmpty()) {
                    try {
                        type2 = Type.valueOf(typeStr.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid type. Using NONE as default.");
                    }
                }

                // asks for other stats/attributes
                int baseLevel;
                do {
                    baseLevel = getIntInput("Enter Base Level (minimum 1): ");
                    if (baseLevel < 1) {
                        System.out.println("ERROR: Base Level must be at least 1.");
                    }
                } while (baseLevel < 1);

                int evolvesFrom = getIntInput("Enter Evolves From (Pokédex Number, 0 if none): ");
                int evolvesTo = getIntInput("Enter Evolves To (Pokédex Number, 0 if none): ");
                int evolutionLevel = getIntInput("Enter Evolution Level (0 if not applicable): ");
                int hp = getIntInput("Enter HP: ");
                int attack = getIntInput("Enter Attack: ");
                int defense = getIntInput("Enter Defense: ");
                int speed = getIntInput("Enter Speed: ");

                // displays the initialized moves
                List<Move> moveSet = new ArrayList<>();
                if (!moves.isEmpty()) {
                    System.out.println("\nHere's the list of the available moves:");
                    for (int i = 0; i < moves.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, moves.get(i).getName());
                    }

                   // lets user pick from the initialized moves for the pokémon (up to 4)
                    while (moveSet.size() < 4) {
                        int moveChoice = getIntInput("Enter move number to add (or 0 to stop): ");
                        if (moveChoice == 0) break;
                        
                        if (moveChoice < 1 || moveChoice > moves.size()) {
                            System.out.println("Invalid move number.");
                            continue;
                        }

                        Move chosen = moves.get(moveChoice - 1);
                        if (moveSet.contains(chosen)) {
                            System.out.println("Move already in move set.");
                            continue;
                        }

                        moveSet.add(chosen);
                        System.out.println(chosen.getName() + " added.");

                        if (moveSet.size() < 4) {
                            String addMore = getStringInput("Do you want to add another move? (y/n): ")
                                    .trim().toLowerCase();
                            if (!addMore.equals("y"))
                                break;
                        }
                    }
                } else {
                    System.out.println("No moves available. Create moves first.");
                }

                // lets user pick an item for the pokémon
                Item heldItem = null;
                if (!items.isEmpty()) {
                    System.out.println("\nAvailable Items:");
                    System.out.println("+----+----------------------+---------------+--------------------------------+");
                    System.out.printf("| %-2s | %-20s | %-13s | %-30s |\n", 
                            "ID", "Name", "Category", "Effect");
                    System.out.println("+----+----------------------+---------------+--------------------------------+");
                    
                    for (int i = 0; i < items.size(); i++) {
                        Item item = items.get(i);
                        // Truncate effect if too long
                        String effect = item.getEffect();
                        if (effect.length() > 30) {
                            effect = effect.substring(0, 27) + "...";
                        }
                        
                        System.out.printf("| %-2d | %-20s | %-13s | %-30s |\n", 
                                i + 1, item.getName(), item.getCategory(), effect);
                    }
                    System.out.println("+----+----------------------+---------------+--------------------------------+");
                    
                    int itemChoice = getIntInput("Enter item number to hold (or 0 for none): ");
                    if (itemChoice > 0 && itemChoice <= items.size()) {
                        heldItem = items.get(itemChoice - 1);
                    } else if (itemChoice != 0) {
                        System.out.println("Invalid item number. No item will be held.");
                    }
                } else {
                    System.out.println("No items available.");
                }

                 // creates the pokémon and adds it to the list
                Pokemon pokemon = new Pokemon(pokedexNumber, name, type1, type2, baseLevel,
                        evolvesFrom, evolvesTo, evolutionLevel, hp, attack, defense, speed);
                
                if (!moveSet.isEmpty()) {
                    pokemon.setMoveSet(moveSet); // sets the moves if any
                }
                
                if (heldItem != null) {
                    pokemon.setHeldItem(heldItem); // sets the held item if any
                }
                 
                pokemons.add(pokemon); //// adds the new pokémon to the list
                System.out.println("SUCCESS: Pokémon added successfully!");
                pressEnterToContinue();
            }
        }
    }

    /**
     * Displays all Pokémon
     */
    private void displayAllPokemon() {
        System.out.println("\n=== ALL POKÉMON ===");

        if (pokemons.isEmpty()) {
            System.out.println("No Pokémon found in the database.");
            pressEnterToContinue();
            return;
        }

        System.out.println("Found " + pokemons.size() + " Pokémon:\n");
        
        // prints the header for the table
        System.out.println("+------+----------------+-------+-------+-------+----------+----------+-------+-----+--------+--------+-------+----------------+----------------+");
        System.out.printf("| %-4s | %-14s | %-5s | %-5s | %-5s | %-8s | %-8s | %-5s | %-3s | %-6s | %-6s | %-5s | %-14s | %-14s |\n", 
                "#ID", "Name", "Type1", "Type2", "Level", "Evol.From", "Evol.To", "E.Lvl", "HP", "Attack", "Defense", "Speed", "Moves", "Held Item");
        System.out.println("+------+----------------+-------+-------+-------+----------+----------+-------+-----+--------+--------+-------+----------------+----------------+");
        
        // prints each Pokémon as a row in the table
        for (Pokemon pokemon : pokemons) {
            // Get secondary type
            String type2;
            if (pokemon.getType2() == Type.NONE) {
                type2 = "---";
            } else {
                type2 = pokemon.getType2().toString();
            }
            
            // format evolution information
            String evolvesFrom;
            if (pokemon.getEvolvesFrom() > 0) {
                evolvesFrom = "#" + pokemon.getEvolvesFrom();
            } else {
                evolvesFrom = "---";
            }
            
            String evolvesTo;
            if (pokemon.getEvolvesTo() > 0) {
                evolvesTo = "#" + pokemon.getEvolvesTo();
            } else {
                evolvesTo = "---";
            }
            
            String evolutionLevel;
            if (pokemon.getEvolutionLevel() > 0) {
                evolutionLevel = String.valueOf(pokemon.getEvolutionLevel());
            } else {
                evolutionLevel = "---";
            }
            
            // gets move names as a comma-separated list
            List<Move> pokemonMoves = pokemon.getMoveSet();
            String movesList = "None";
            
            if (!pokemonMoves.isEmpty()) {
                StringBuilder movesBuilder = new StringBuilder();
                for (int i = 0; i < pokemonMoves.size(); i++) {
                    if (i > 0) {
                        movesBuilder.append(",");
                    }
                    movesBuilder.append(pokemonMoves.get(i).getName());
                }
                movesList = movesBuilder.toString();
            }
            
            // formats the held item
            Item heldItem = pokemon.getHeldItem();
            String heldItemStr;
            if (heldItem != null) {
                heldItemStr = heldItem.getName();
            } else {
                heldItemStr = "None";
            }
            
            // format moves list if too long
            if (movesList.length() > 14) {
                movesList = movesList.substring(0, 11) + "...";
            }
            
            // prints the row with all attributes
            System.out.printf("| #%-3d | %-14s | %-5s | %-5s | %-5d | %-8s | %-8s | %-5s | %-3d | %-6d | %-6d | %-5d | %-14s | %-14s |\n",
                    pokemon.getPokedexNumber(),
                    pokemon.getName(),
                    pokemon.getType1().toString(),
                    type2,
                    pokemon.getBaseLevel(),
                    evolvesFrom,
                    evolvesTo,
                    evolutionLevel,
                    pokemon.getHp(),
                    pokemon.getAttack(),
                    pokemon.getDefense(),
                    pokemon.getSpeed(),
                    movesList,
                    heldItemStr);
        }
        
        System.out.println("+------+----------------+-------+-------+-------+----------+----------+-------+-----+--------+--------+-------+----------------+----------------+");
        pressEnterToContinue();
    }

    /**
     * Shows menu for searching Pokémon
     */
    private void searchPokemonMenu() {
        System.out.println("\n=== SEARCH POKÉMON ===");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Type");
        System.out.println("3. Search by Pokédex Number");
        System.out.println("0. Back");

        int choice = getIntInput("Enter your choice: ");

        switch (choice) {
            case 1:
                searchPokemonByName();
                break;
            case 2:
                searchPokemonByType();
                break;
            case 3:
                searchPokemonByNumber();
                break;
            case 0:
                // Return to previous menu
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    /**
     * Searches for Pokémon by name
     */
    private void searchPokemonByName() {
        String name = getStringInput("Enter Pokémon name to search: ");
        List<Pokemon> results = new ArrayList<>();
        
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(pokemon); // adds matching pokémon to results
            }
        }

        if (results.isEmpty()) {
            System.out.println("No Pokémon found with that name.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " Pokémon found):");
        for (Pokemon pokemon : results) {
            System.out.println("---------------------------------------------");
            System.out.println(pokemon);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Searches for Pokémon by type
     */
    private void searchPokemonByType() {
        System.out.println("\nAvailable types:");
        for (Type type : Type.values()) {
            if (type != Type.NONE) {
                System.out.print(type + " ");
            }
        }

        String typeStr = getStringInput("\nEnter Pokémon type to search: ");
        Type searchType;
        try {
            searchType = Type.valueOf(typeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type. Search cancelled.");
            pressEnterToContinue();
            return;
        }
        
        List<Pokemon> results = new ArrayList<>();
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getType1() == searchType || pokemon.getType2() == searchType) {
                results.add(pokemon); // adds matching pokémon to results
            } 
        }

        if (results.isEmpty()) {
            System.out.println("No Pokémon found with that type.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " Pokémon found):");
        for (Pokemon pokemon : results) {
            System.out.println("---------------------------------------------");
            System.out.println(pokemon);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Searches for Pokémon by Pokédex number
     */
    private void searchPokemonByNumber() {
        int number = getIntInput("Enter Pokédex Number to search: "); // asks for pokédex number
        
        Pokemon result = null;
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getPokedexNumber() == number) {
                result = pokemon; // finds the pokémon with that number
                break;
            }
        }

        if (result == null) {
            System.out.println("No Pokémon found with that Pokédex Number.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Result:");
        System.out.println("---------------------------------------------");
        System.out.println(result);
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Adds a new move
     */
    private void addMove() {
        System.out.println("\n=== ADD NEW MOVE ===");

        
        int id = moves.size() + 1; // assigns a new id for the move (this generates a unique id)
        
        String name = getStringInput("Enter Name: ");
        

        for (Move m : moves) {  // loop that checks for duplicate name
            if (m.getName().equalsIgnoreCase(name)) {
                System.out.println("ERROR: Move with this name already exists!");
                pressEnterToContinue();
                return;
            }
        }
        
        String description = getStringInput("Enter Description: "); 

        System.out.println("Classifications: HM, TM, NORMAL");
        String classificationStr = getStringInput("Enter Classification: ");
        Move.Classification classification;
        try {
            classification = Move.Classification.valueOf(classificationStr.toUpperCase()); // checks for valid classification
        } catch (IllegalArgumentException e) { //catches invalid classification, then assigns it to NORMAL
            System.out.println("Invalid classification. Using NORMAL as default.");
            classification = Move.Classification.NORMAL;
        }

         // shows available types
        System.out.println("\nAvailable types:");
        for (Type type : Type.values()) {
            if (type != Type.NONE) {
                System.out.print(type + " ");
            }
        }

        String typeStr = getStringInput("\nEnter Type: ");
        Type moveType;
        try {
            moveType = Type.valueOf(typeStr.toUpperCase());
            if (moveType == Type.NONE) {
                System.out.println("NONE is not a valid move type. Using NORMAL as default.");
                moveType = Type.NORMAL;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type. Using NORMAL as default."); //catches invalid type, then assigns it to NORMAL
            moveType = Type.NORMAL;
        }
        
        System.out.println("\nKind options: Physical, Special, Status");
        String kind = getStringInput("Enter Kind: "); 
        
        int power = getIntInput("Enter Power (0 for status moves): ");
        String accuracy = getStringInput("Enter Accuracy (e.g., 100%, 85%): ");
        int pp = getIntInput("Enter PP (Power Points): ");

        // creates the move and adds it to the list
        Move move = new Move(id, name, description, classification, moveType, kind, power, accuracy, pp);
        moves.add(move);
        
        System.out.println("SUCCESS: Move added successfully!");
        pressEnterToContinue();
    }

    /**
     * Displays all moves
     */
    private void displayAllMoves() {
        System.out.println("\n=== ALL MOVES ===");

        if (moves.isEmpty()) {
            System.out.println("No moves found in the database.");
            pressEnterToContinue();
            return;
        }

        System.out.println("Found " + moves.size() + " moves:");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-15s | %-10s | %-10s | %-6s | %-9s | %-4s | %-30s |\n",
                "ID", "Name", "Type", "Kind", "Power", "Accuracy", "PP", "Description");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------");

        for (Move move : moves) {
            // Truncate description if too long
            String description = move.getDescription();
            if (description.length() > 30) {
                description = description.substring(0, 27) + "...";
            }

            System.out.printf("| %-4d | %-15s | %-10s | %-10s | %-6d | %-9s | %-4d | %-30s |\n",
                    move.getId(),
                    move.getName(),
                    move.getType(),
                    move.getKind(),
                    move.getPower(),
                    move.getAccuracy(),
                    move.getPP(),
                    description);
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Shows menu for searching moves
     */
    private void searchMovesMenu() {
        System.out.println("\n=== SEARCH MOVES ===");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Type");
        System.out.println("3. Search by Classification");
        System.out.println("0. Back");

        int choice = getIntInput("Enter your choice: ");

        switch (choice) {
            case 1:
                searchMovesByName();
                break;
            case 2:
                searchMovesByType();
                break;
            case 3:
                searchMovesByClassification();
                break;
            case 0:
                // Return to previous menu
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    /**
     * Searches for moves by name
     */
    private void searchMovesByName() {
        String name = getStringInput("Enter move name to search: ");
        List<Move> results = new ArrayList<>();
        
        for (Move move : moves) {
            if (move.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(move);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No moves found with that name.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " moves found):");
        for (Move move : results) {
            System.out.println("---------------------------------------------");
            System.out.println(move);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Searches for moves by type
     */
    private void searchMovesByType() {
        System.out.println("\nAvailable types:");
        for (Type type : Type.values()) {
            if (type != Type.NONE) {
                System.out.print(type + " ");
            }
        }

        String typeStr = getStringInput("\nEnter move type to search: ");
        Type searchType;
        try {
            searchType = Type.valueOf(typeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type. Search cancelled.");
            pressEnterToContinue();
            return;
        }
        
        List<Move> results = new ArrayList<>();
        for (Move move : moves) {
            if (move.getType() == searchType) {
                results.add(move);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No moves found with that type.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " moves found):");
        for (Move move : results) {
            System.out.println("---------------------------------------------");
            System.out.println(move);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Searches for moves by classification
     */
    private void searchMovesByClassification() {
        // shows available classifications
        System.out.println("Classifications: HM, TM, NORMAL");
        String classificationStr = getStringInput("Enter move classification to search: ");
        Move.Classification searchClassification; // initializes the search classification
        try {
            searchClassification = Move.Classification.valueOf(classificationStr.toUpperCase()); // checks for valid classification
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid classification. Search cancelled.");
            pressEnterToContinue();
            return;
        }
        
        List<Move> results = new ArrayList<>();
        for (Move move : moves) { // loops through all moves, then checks if the classification matches the search classification
            if (move.getClassification() == searchClassification) {
                results.add(move); // adds matching move to results
            }
        }

        if (results.isEmpty()) {
            System.out.println("No moves found with that classification.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " moves found):");
        for (Move move : results) {
            System.out.println("---------------------------------------------");
            System.out.println(move);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Displays all items
     */
    private void displayAllItems() {
        System.out.println("\n=== ALL ITEMS ===");

        if (items.isEmpty()) {
            System.out.println("No items found in the database.");
            pressEnterToContinue();
            return;
        }

        System.out.println("Found " + items.size() + " items:");
        
        // Group items by category for better organization
        System.out.println("\n--- VITAMINS AND TRAINING ITEMS ---");
        displayItemsByCategory("Vitamin");
        displayItemsByCategory("Leveling Item");
        displayItemsByCategory("Feather");
        
        System.out.println("\n--- EVOLUTION STONES ---");
        displayItemsByCategory("Evolution Stone");
        
        pressEnterToContinue();
    }

    /**
     * Displays items of a specific category in a tabulated format
     * 
     * @param category The category to display
     */
    private void displayItemsByCategory(String category) {
        // Create a list to hold items of the specified category
        List<Item> categoryItems = new ArrayList<>();
        
        // Find items of the specified category
        for (Item item : items) {
            if (item.getCategory().equals(category)) {
                categoryItems.add(item);
            }
        }
        
        // If no items found in the category, return early
        if (categoryItems.isEmpty()) {
            return;
        }
        
        // Print table header
        System.out.println(
                "+----------------------+---------------+--------------------------------+------------+------------+");
        System.out.printf("| %-20s | %-13s | %-30s | %-10s | %-10s |\n",
                "Name", "Category", "Description", "Buy Price", "Sell Price");
        System.out.println(
                "+----------------------+---------------+--------------------------------+------------+------------+");

        // Print each item in the category
        for (Item item : categoryItems) {
            // if the item description is too long, we truncate it
            String description = item.getDescription();
            if (description.length() > 30) {
                description = description.substring(0, 27) + "...";
            }

            // formats buying price
            String buyPrice;
            if (item.getBuyingPrice() == 0) {
                buyPrice = "Not sold";
            } else {
                buyPrice = "₽" + String.format("%,d", item.getBuyingPrice());
            }
            
            // formats selling price
            String sellPrice = "₽" + String.format("%,d", item.getSellingPrice());

            // print the item row
            System.out.printf("| %-20s | %-13s | %-30s | %-10s | %-10s |\n",
                    item.getName(),
                    item.getCategory(),
                    description,
                    buyPrice,
                    sellPrice);
        }
        
        // print table footer
        System.out.println(
                "+----------------------+---------------+--------------------------------+------------+------------+");
    }

    /**
     * Shows menu for searching items
     */
    private void searchItemsMenu() {
        System.out.println("\n=== SEARCH ITEMS ===");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Category");
        System.out.println("0. Back");

        int choice = getIntInput("Enter your choice: ");

        switch (choice) {
            case 1:
                searchItemsByName();
                break;
            case 2:
                searchItemsByCategory();
                break;
            case 0:
                // Return to previous menu
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    /**
     * Searches for items by name
     */
    private void searchItemsByName() {
        String name = getStringInput("Enter item name to search: "); 
        List<Item> results = new ArrayList<>(); // initializes the results list
        
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(item); // adds matching item to results
            }
        }

        if (results.isEmpty()) { // checks if the results list is empty
            System.out.println("No items found with that name.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " items found):");
        for (Item item : results) {
            System.out.println("---------------------------------------------");
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Searches for items by category
     */
    private void searchItemsByCategory() {
        // list of common categories
        System.out.println("Common categories: Vitamin, Evolution Stone, Feather, Leveling Item");
        String category = getStringInput("Enter item category to search: ");
        List<Item> results = new ArrayList<>();
        
        for (Item item : items) {
            if (item.getCategory().toLowerCase().contains(category.toLowerCase())) {
                results.add(item); // adds matching item to results
            }
        }

        if (results.isEmpty()) { // checks if the results list is empty
            System.out.println("No items found in that category.");
            pressEnterToContinue();
            return;
        }

        System.out.println("\nSearch Results (" + results.size() + " items found):");
        for (Item item : results) {
            System.out.println("---------------------------------------------");
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");

        pressEnterToContinue();
    }

    /**
     * Gets an integer input from the user
     * 
     * @param prompt The prompt to display
     * @return The integer input
     */
    private int getIntInput(String prompt) {
        System.out.print(prompt); 

        while (!scanner.hasNextInt()) {
            System.out.println("ERROR: Please enter a valid number.");
            scanner.next(); 
            System.out.print(prompt);
        }

        int input = scanner.nextInt();
        scanner.nextLine(); 
        return input;
    }

    /**
     * Gets a string input from the user
     * 
     * @param prompt The prompt to display
     * @return The string input
     */
    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Pauses execution until the user presses Enter
     */
    private void pressEnterToContinue() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Main method to start the application
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}