package collegePracticals;

import java.util.Arrays;

public class heapSortPrac{
    public static void main(String[] args) {
        int[] arr = {32, 43, 0, 32, 5, 43, 5, 7,6, 87};
        heapifyFull(arr, arr.length);
        // heapify(arr, arr.length/2-1, arr.length);
        System.out.println(Arrays.toString(arr));
        int[] sorted = heapSort(arr, arr.length-1);
        System.out.println(Arrays.toString(sorted));
        System.out.println(count);

    }
    public static int count = 0;
    public static void heapify(int[] arr, int index, int size){
        if(index< 0){
            return;
        };
        int left = 2*index +1;
        int right = 2*index +2;
        int largest = index;
        if(left < size && arr[left]> arr[largest]){
            largest = left;  // now left is largest till now
            
        }
        else if(right < size && arr[right] > arr[largest]){
            largest = right;  // now right is largest
            
        }
        count+=2;

        // now we just need to swap the largest with the index;
        if(largest!= index){
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            // now we also need to apply heapify to the swapped index
            heapify(arr, largest, size);
        }
        heapify(arr, index-1, size);
    }


    public static void heapifyFull(int[] arr, int size){
        int n = size;
        // parents starts from (n-1)/2;
        for(int i = n/2 -1; i>=0 ; i--){
            heapify(arr, i, size);
        }
    }

    public static int[] heapSort(int[] arr, int size){
        int[] output = new int[size+1];
        for(int i = 0; i< output.length; i++){
            output[i] = arr[0];
            arr[0] = arr[size];
            size-=1;
            heapify(arr, 0, size);
        }
        return output;
    }
}
