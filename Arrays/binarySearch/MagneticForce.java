
import java.util.Arrays;

public class MagneticForce {
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,7,11,13,16,21,24,28};
        int m = 4;
        Arrays.sort(arr);
        int lo  = 1, hi = arr[arr.length-1]-arr[0];
        int maxMinMagForce = binaryHelper(arr, m , lo, hi);
        System.out.println("maximum minimum magnetic force = "+ maxMinMagForce);
    }

    static int binaryHelper(int arr[], int m , int lo, int hi){
        // log(hi-lo) * n 
        int ans = 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            int minimum = util(arr, m, mid);
            // minimum == -1 = > we cannot place all the balls 
            if( minimum == -1){
                hi = mid-1;
            }
            else{
                ans = minimum ;
                lo = mid+1;
            }
        }
        return ans;
    }

    static int util(int arr[], int m, int atleastdis){
        int itr = 0;
        int count = 1;
        int min= Integer.MAX_VALUE;
        while(count!= m){
            int curr = arr[itr];
            
            int nextminPos = curr + atleastdis;
            int i =0;
            for(i = itr  ; i< arr.length ;i++){
                if(arr[i] < nextminPos){
                    continue;
                }
                else if(arr[i] >= nextminPos ){
                    int currDiff =arr[i] - arr[itr];
                    if(currDiff< min){
                        min = currDiff;
                    }
                    count++;
                    itr= i;
                    break;
                }
            }
            if(count == m  ){
                break;
            }
            if(i == arr.length){
                return -1;
            }

        }

        return min;
    }
}
