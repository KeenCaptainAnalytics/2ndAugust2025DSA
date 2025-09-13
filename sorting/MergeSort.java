public class MergeSort {

    static int[] merge(int arr1[] , int arr2[]){

        int temp[] = new int[arr1.length + arr2.length ];

        int  i =0 ; // starting index of arr1;
        int j =0 ;  // starting index of arr2;
        int k = 0 ; //temp array starting index

        while(i<arr1.length && j <arr2.length){
            if(arr1[i]<arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length ){
            temp[k] = arr1[i];
            k++;
            i++;
        }
         while(j<arr2.length ){
            temp[k] = arr2[j];
            k++;
            j++;
        }

        return temp;
    }

    static void partition(int arr[] , int lo, int hi){
       System.out.println(lo + "--" +hi);
        if(lo<hi){
        
            int mid =(lo+hi)/2;
            partition(arr, lo, mid);
            partition(arr, mid+1, hi);
            // merge(arr, lo, mid, hi);
        }
    }
    public static void main(String[] args) {
        // int arr[] = {3,4,2,7,1,8,9,5};
        // partition(arr , 0, arr.length-1);

        int arr1[] ={1,4,7};
        int arr2[] ={3,5,9};
        // sorted arrays
        int result[] = merge(arr1, arr2);

        print(result);
    }

    static void print(int arr[]){
        for(int i =0 ;i <arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }
    }


}
