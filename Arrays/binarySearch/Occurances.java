package arrays.recursion.binarySearch;

public class Occurances {

    static int binaryLI(int arr[], int target , int lo, int hi){
        if(lo>hi){
            return -1;
        }

        int mid = (lo+hi)/2;
        if(arr[mid] == target && ((mid!=0 && arr[mid-1] < arr[mid] )||mid==0 )){
            return mid;
        }
        else if(arr[mid] >= target){
           return binaryLI(arr, target, lo, mid-1); 
        }
        else{
            return binaryLI(arr, target, mid+1, hi);
        }

    }

    static int binaryHI(int arr[] , int target , int lo, int hi){
        if(lo> hi){
            return -1;
        }
        int mid = (lo+hi)/2;
        if(arr[mid]== target && (mid == arr.length-1 || (arr[mid]<arr[mid+1])) ){
            return mid;
        }
        else if(arr[mid]<= target){
            return binaryHI(arr, target, mid+1, hi);
        }
        else{
            return binaryHI(arr, target, lo, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int target =11;
        int lowerIndex = binaryLI(arr, target , 0 ,arr.length-1 );
        System.out.println(lowerIndex);
        int higherIndex = binaryHI(arr, target, 0, arr.length-1);
        System.out.println(higherIndex);

        if(lowerIndex==-1){
            System.out.println("total = "+ 0);
        }
        else{
             System.out.println("total = "+(higherIndex - lowerIndex +1));
        }
       
    }
}
