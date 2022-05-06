package collegePracticals;

import java.util.Arrays;
import java.util.Random;

public class quickSortPrac {
    public static void main(String[] args) {
        int[] arr = {32, 43,6, 7, -3, 5, 0, 7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        
    }
    public static int count = 0;
    public static Random r = new Random();
    public static void quickSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int l = s;
        int h = e;
        int m = r.nextInt(e-s) + s;
        // int m = l + (l-h)/2;
        while(l<=h){
            while(arr[l]< arr[m]){
                l++;
                count++;
            }
            count++;
            while(arr[h]> arr[m]){
                h--;
                count++;
            }
            count++;
            if(l<=h){
                // swap
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
                h--;
            }
            quickSort(arr, s, h);
            quickSort(arr, l, e);
        }

    }
}
