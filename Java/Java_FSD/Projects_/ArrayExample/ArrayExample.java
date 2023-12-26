public class ArrayExample {

    public static void main(String[] args) {
        // Declaration and initialization of an array
        int[] numbers = new int[5];

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing elements of the array using index
        System.out.println("Element at index 2: " + numbers[2]);

        // Iterating through the array using a for loop
        System.out.println("\nArray elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Initializing an array with values
        String[] fruits = {"Apple", "Orange", "Banana", "Grapes"};

        // Iterating through the string array using a for-each loop
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System
