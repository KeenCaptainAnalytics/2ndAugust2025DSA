public class MergeSort2 {


    static void mergeHelper(int arr[] , int lo, int mid , int hi){
        // lo-mid  
        int sizeOfLeft = mid-lo+1;
        int arrleft[] = new int[sizeOfLeft];
        // mid+1 - hi
        int sizeOfRight = hi-(mid+1) +1 ;
        int arrRight[] = new int[sizeOfRight];

        for(int i=0;i<sizeOfLeft ;i++){
            arrleft[i] = arr[lo+i];
        }
        for(int i=0;i<sizeOfRight;i++){
            arrRight[i] = arr[mid+1+i];
        }

        int i =0; //left
        int j =0; //right;
        int k= lo;

        while(i!=sizeOfLeft && j!=sizeOfRight){
            if(arrleft[i]<arrRight[j]){
                arr[k] = arrleft[i];
                i++;
                k++;
            }
            else{
                arr[k] = arrRight[j];
                j++;
                k++;
            }
        }

        while(i!=arrleft.length){
            arr[k] = arrleft[i];
            k++;
            i++;
        }

        while(j!=arrRight.length){
            arr[k] = arrRight[j];
            k++;
            j++;
        }
    }
    // partiotning of the array into two parts based on the middle index
    static void partition(int arr[] , int lo, int hi){

        if(lo<hi){
            // lo = 3  hi = 7 mid = 5
            int mid = (lo+hi)/2;
            partition(arr, lo, mid); // 3, 4,5
            partition(arr, mid+1, hi);//6, 7
            mergeHelper(arr , lo, mid, hi);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,5,8,9,4,6,2};

        partition(arr, 0, arr.length-1);

        print(arr);
    }
    static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" , ");
        }
    }
}
