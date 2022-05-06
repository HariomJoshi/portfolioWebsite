package collegePracticals;

public class searchingTechniques {
    public static void main(String[] args) {
        int[] arr = {3,6,8,13,17,23,35,38,45,60};
        int loc = binarySearch(arr, 35);
        System.out.println(loc);
        int loc2 = linearSearch(arr, 352);
        System.out.println(loc2);
        
    }

    public static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s + (e -s)/2;
            if(arr[m] < target){
                s = m+1;
            }
            else if(arr[m] == target){
                return m;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
