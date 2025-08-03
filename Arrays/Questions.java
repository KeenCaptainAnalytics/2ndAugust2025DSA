// Q1 .suppose we are given with an array ...and we have to find second largest element in it.
// Q2 .3 largest elements in an array(dont use sorting  - > nlogn  ) single pass
// Q3 suppose we are having an array with 0s and 1s and we have to sort in one pass

public class Questions {

    // static int secondLargest(int arr[]){
    //     int max= Integer.MIN_VALUE;
    //     int secondLargest = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length ;i++){
    //         if(max< arr[i]){
    //             secondLargest = max;
    //             max= arr[i];
    //         }
    //         else if(secondLargest < arr[i]){
    //             secondLargest = arr[i];
    //         }
    //     }

    //     return secondLargest;
    // }

    // static int[] threeLargest(int arr[]){
    //     int max= arr[0];
    //     int secondLar =arr[0];
    //     int thirdLar = arr[0];
    //     // traversal
    //     for(int i=1 ; i< arr.length ;i++){
    //         if(max< arr[i]){
    //             thirdLar = secondLar;
    //             secondLar = max ;
    //             max= arr[i];
    //         }
    //         else if(secondLar < arr[i]){
    //             thirdLar = secondLar;
    //             secondLar = arr[i];
    //         }
    //         else if(thirdLar < arr[i]){
    //             thirdLar = arr[i];
    //         }
    //     }

        // return thirdLar;
        // int ans [] = new int[3];
        // ans[0] = max;
        // ans[1] = secondLar;
        // ans[2] = thirdLar;
        // return ans;

    //     return new int[]{max , secondLar , thirdLar};
    // }

    static void sortArr(int arr[]){
        int countZero =0 ;
        // 1st pass
        for(int i =0 ;i < arr.length ;i++){
            if(arr[i]==0){
                countZero ++ ;
            }
        }

        // 2nd pass
        for(int i=0 ;i<arr.length ;i++){
            if(countZero > 0){
            arr[i] = 0;
            countZero--;
            }
            else{
                arr[i] = 1;
            }

        }

    }

    static void sortArr1pass(int arr[]){
        // int i =0 ;//traversal
        int j = 0 ;//left 0

        for(int i =0; i< arr.length ;i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] ={0,0,0,1,1,1,0,1,1,0,1,1,0,1,0,1};
        sortArr1pass(arr);
        
        for(int i =0 ;i < arr.length ;i++){
            System.out.print(arr[i]);
        }
        // int arr[]  = {3,4,6,2,5,7,3, 89};
        // int ans [] = threeLargest(arr);
        // for(int i=0;i<3 ; i++){
        //     System.out.println(ans[i]);
        // }
        // int ele = secondLargest(arr);
        // System.out.println(ele);
    }
}
