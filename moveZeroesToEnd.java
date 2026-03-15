public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[]arr = { 1 , -4 , 7 , 0 , 99 , 3 , 0 , -90 , 0 , 0 , 33 , 45, 77};
        int n = arr.length;
        for(int i = 0 ; i< n - 1 ; i++){
            for (int j = 0 ; j < n - 1 - i ; j++){
                if (arr[j] == 0 && arr[j]+1 != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int[]arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
