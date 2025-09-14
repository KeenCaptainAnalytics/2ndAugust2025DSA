public class Quicksort {

    static int partition(int arr[] , int lo, int hi){

        System.out.println(lo+" -- "+hi);

        int pivotEle = arr[hi];
        int i=lo;
        int j = hi-1;

        while(i<=j){
            while(i<hi && arr[i]<= pivotEle){
                i++;
            }
            while(j>=lo && arr[j]>pivotEle ){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else if( i>j ){
                int temp = arr[hi];
                arr[hi] = arr[i];
                arr[i] = temp;
                return i;
            }
            else if(j ==lo-1){
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                return lo;
            }
        }

        print(arr);
        System.out.println(i);
        return i;
    }
    static void helper(int arr[], int lo, int hi){
        if(lo==hi){
            return;
        }
        if(lo<hi){ 
            int pivotIndex = partition(arr, lo , hi);
            if(lo!=pivotIndex-1)
            helper(arr, lo, pivotIndex-1);
            if(pivotIndex+1 != hi)
            helper(arr, pivotIndex+1, hi);
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,4,2,8,7,9,1,5,6};
        helper(arr, 0, arr.length-1);

        print(arr);
    }

    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+ " , ");
        }
    }
}
