import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {
        // List - ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Set - HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // Adding a duplicate value

        System.out.println("\nHashSet:");
        for (int num : hashSet) {
            System.out.println(num);
        }

        // Map - HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("\nHashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Queue - LinkedList (as a Queue)
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("\nQueue (LinkedList):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
