package mapsAndSets;
import java.util.HashSet;
public class distinctElements {
    public static int countDistinctElements(int[]arr){
        HashSet<Integer>set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        return set.size();
}
public static void main(String[]args){
    int[]arr = { 2 , 3 , 2 , 3 , 1};
    System.out.println(countDistinctElements(arr));
    }
}
