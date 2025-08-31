package arrays.recursion.binarySearch;

public class BinarySearch {

    static int helperIteratively(int arr[], int target){
        int lo =0 , hi= arr.length-1;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return -1;
    }

    static int recBinarySearch(int arr[] , int target , int lo , int  hi){
        if(lo>hi){
            return -1;
        }
        int mid = (lo+hi)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]> target){
           return recBinarySearch(arr, target, lo, mid-1);
        }
        else{
            return recBinarySearch(arr, target, mid+1, hi);
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,9,12,14,15};

        int target = 114;
        // int index = helperIteratively(arr, target);
        int index = recBinarySearch(arr, target, 0 , arr.length-1);
        System.out.println(index);
    }
}
