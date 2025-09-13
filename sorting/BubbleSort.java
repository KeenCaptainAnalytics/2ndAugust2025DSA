class BubbleSort{

    static void bubbleSortHelper(int arr[]){
        int n = arr.length;//calculating the length of the array
         // cycles
        for(int i =1;i<n ;i++){
           for(int j = 0 ; j<n-i; j++){
        //    0,1,2,3,4 .......6-1 =5

                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4,1,6,9,3, 1,14};
        bubbleSortHelper(arr);

        print(arr);
    }

    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" , ");
        }
    }
}