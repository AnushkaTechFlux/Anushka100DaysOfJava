package mapsAndSets;

import java.util.TreeSet; 
public class treeSet{
    public static void main(String[] args) {
        // TreeSet only keeps unique elements in sorted order
        TreeSet<Integer> set = new TreeSet<>();
        //treeSet = log(n) , bst dataStructure used to implement treeSet

        // Add elements
        set.add(10);
        set.add(65);
        set.add(21);
        set.add(105);
        set.add(105); // duplicate, won't be added

        // Size of set
        System.out.println("Size: " + set.size());

        // Check if set contains certain elements
        System.out.println("Contains 21? " + set.contains(21));
        System.out.println("Contains 18? " + set.contains(18));

        // Remove an element
        set.remove(21);
        System.out.println("Contains 21 after removal? " + set.contains(21));
        System.out.println("Size after removal: " + set.size());

        // Iterate through the set (sorted order)
        System.out.println("Elements in set: " + set);
    }
}