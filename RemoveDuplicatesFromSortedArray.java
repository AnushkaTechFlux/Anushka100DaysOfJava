public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        int[]arr = { 0 , 4 , 6  ,6 , 7 , 8};
        int n = arr.length;
        if (n == 0){
            System.out.println("Array is empty");
            return;
        }
        int k = 1;
        for (int j = 1 ; j < n ; j++){
            if(arr[j] != arr[j-1]){
                arr[k] = arr[j];
                k++;
            }
        }
        System.out.println("Unique elemnts count is : "+ k);
        for (int i = 0 ; i< n - 1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}