public class Insertionsort {

    static void helper(int arr[]){
        int n = arr.length;

        // cycles
        for(int i=1; i<n;i++){
            // comparisions
            for(int j =i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={6,5,4,3,2,1};
        helper(arr);

        print(arr);
    }

    static void print(int arr[]){
        for(int i =0; i<arr.length ;i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
