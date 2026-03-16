package mapsAndSets;
import java.util.HashSet;
public class twoSum {
    public static void main(String[] args) {
        int[]nums = { 2 , 7 , 4 , 55 , 90};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

    public static boolean twoSum(int[]nums , int target){
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            if(set.contains(target -  num)){
                return true;
            }
            set.add(num);

        }
        return false;
    }
    
}
