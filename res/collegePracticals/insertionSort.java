package collegePracticals;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {32, 4, 54,5, 45, 6,7,5,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int count= 0;
    public static void insertSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int min = i;
            for(int j =arr.length-1; j>i; j--){
                if(arr[j]< arr[min]){
                    min = j;
                    count++;
                }
            }
            // swap arr[i] and arr[max]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
