package mapsAndSets;

import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        //hashSet only keeps the unique elements only
        HashSet<Integer> set = new HashSet<>();
        //add , serach , remove , size
        set.add(10);
        set.add(65);
        set.add(21);
        set.add(105);
        set.add(105);
        System.out.println(set.size());
        System.out.println(set.contains(21)+" "+ set.contains(18));

        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());

        //iterate through the set
        System.out.println(set); //random order
    }
}
