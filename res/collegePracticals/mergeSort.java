package collegePracticals;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {21, 43, 5, 6, 0, -5, -43};
        int[] sorted = mergeSort(arr);
        System.out.println(Arrays.toString(sorted));
        System.out.println(count);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));
        return merge(left, right);
    }
    public static int count = 0;
    public static int[] merge(int[] left, int[] right){
        int i = 0;  // left array pointer
        int j = 0;  // right array pointer
        int k = 0;  // main array pointer
        int[] output = new int[left.length + right.length];
        while(i < left.length && j< right.length){
            if(right[j]< left[i]){
                output[k++] = right[j++];
            }
            else{
                output[k++] = left[i++];
            }
            count++;  // comparision count
        }
        // if left array is empty
        while(i< left.length){
            output[k++] = left[i++];
        }

        while(j < right.length){
            output[k++] = right[j++];

        }
        return output;
    }
}
