class Test{

    static int search(int arr[] , int target){
        // linear search . best case, worst case 
        for(int i=0;i< arr.length ;i++){
            if(arr[i]==target){
               return i; 
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int arr[]= {2,6,4,8,1,5};
        int target = -5;
        int index = search(arr, target);
        System.out.println(index);

        // [6,1,2,3,4,5,6]
        // searching method  6
        // 1.Linear search (worst ) 
        // 2. Binary Search (sorted array ascending desfcending)


        // int arr[] = new int[4];
        // int arr[] = {1,2,3,4,5,6};
        // // 4*4 = 16bytes

        // // for (loop)
        // // printing 
        // for(int i =0;i<arr.length ;i++){
        //     System.out.println(arr[i]);
        // }


        // // array creation
        // // why contiguous memory?? indices??

    }
}