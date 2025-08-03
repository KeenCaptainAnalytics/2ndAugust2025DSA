public class BinarySearch {
// 704 binary search
    static int binaryUtil(int arr[], int target){

        int lo =0 ;
        int  hi = arr.length-1 ;
       while(lo<=hi){
            int middle = lo + (hi-lo)/2;// (lo+hi)/2

            if(arr[middle] == target){
                return middle;
            }
            else if(arr[middle] < target){
                lo = middle +1;
            }
            else{
                hi = middle-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8, 45,89};
        int index= binaryUtil(arr, 45);
        System.out.println(index);
    }
}
