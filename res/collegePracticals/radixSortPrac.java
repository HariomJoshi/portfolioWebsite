package collegePracticals;

import java.util.Arrays;

public class radixSortPrac {
    public static void main(String[] args) {
        int[] arr = {2,4, 6,3,34,543,654,3443};
        int[] ans = radixSort(arr);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] radixSort(int[] arr){
        // finding the max element from the array
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> max) max = arr[i];
        }
        // now we have max element
        int exp = 1;
        while(max/exp>0){
            // count sort
            arr = countSort(arr, exp);
            exp *= 10;
        }
        return arr;
    }

    public static int[] countSort(int[] arr, int exp){
        int[] count = new int[10];
        for(int i = 0; i< arr.length; i++){
            count[(arr[i]/exp)%10]+=1;
        }
        // making the count array
        for(int i = 0; i< 9 ; i++){
            count[i+1] += count[i];
        }
        // we have our count array ready
        int[] output = new int[arr.length];
        for(int i=output.length-1; i>0; i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]-=1;
        }
        
        return output;
    }
}
