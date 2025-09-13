public class selectionSort {
    static void helper(int arr[]){

        int n = arr.length;
        // cycles 6  0-4
        for(int i=0 ;i<n-1 ;i++){
            // comparsion
            int minI = i;
            for(int j = i; j<n-1 ; j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            }
            // swapping (i , minI)

            int temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
        }
    }
   public static void main(String[] args) {
     int arr[]= {4,1,2,7,3,9};
     helper(arr);

     print(arr) ;
   } 

   static void print(int arr[]){
    for(int i =0 ;i <arr.length ;i++){
        System.out.print(arr[i]+ ",");
    }
   }
}
