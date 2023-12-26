import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> population = new HashMap<>();

        // Adding key-value pairs to the map
        population.put("USA", 331); // Adding population of the USA
        population.put("China", 1441);
        population.put("India", 1380);
        population.put("Brazil", 213);

        // Displaying the population of some countries
        System.out.println("Population of India: " + population.get("India"));
        System.out.println("Population of Brazil: " + population.get("Brazil"));

        // Checking if a key exists
        String country = "China";
        if (population.containsKey(country)) {
            System.out.println("Population of " + country + ": " + population.get(country));
        } else {
            System.out.println("Population of " + country + " not found.");
        }

        // Iterating through the map
        System.out.println("\nIterating through the map:");
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Population: " + entry.getValue());
        }

        // Removing a key-value pair
        population.remove("USA");
        System.out.println("\nPopulation of USA removed.");

        // Checking the size of the map
        System.out.println("Size of the map: " + population.size());

        // Clearing the map
        population.clear();
        System.out.println("Map cleared. Size: " + population.size());
    }
}
