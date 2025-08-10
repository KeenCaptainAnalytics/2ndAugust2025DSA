public class ArrayEven {

    static int sumArr(int arr[], int in  ){
        
        if(in == arr.length){
            return 0;
        }

        int currsum = arr[in] + sumArr(arr, in+1);
        return currsum;
    }

    static int sumEven(int arr[], int in){
        if(in == arr.length){
            return 0;
        }
        if(arr[in]%2==0){
            return sumEven(arr, in+1)+ arr[in];
        }
        else{
            return sumEven(arr, in+1);
        }
    }

    // sum of even numbers in an array
    // reverse an array recursivly

    static void reverseHelper(int arr[], int in){
        if(arr.length/2 <= in){
            return;
        }
        // swapping 
        int li = arr.length-1 -in ;

        int temp = arr[li];
        arr[li] = arr[in] ;
        arr[in ] = temp;


        reverseHelper(arr, in+1);
    }
    public static void main(String[] args) {
        int arr[] = {11,12,13,14,15,16};

        reverseHelper(arr, 0);
        for(int ele: arr){
            System.out.print(ele+",");
        }
        // System.out.println(sumEven(arr, 0));
        // sum of all the numbers of array - recursivly
        // int result =  sumArr(arr, 0);

        // System.out.println(result);

        // sumArr(n) = arr[0] + sumArr(1)
        // sumArr(n-1) = arr[1] +
    }
}
