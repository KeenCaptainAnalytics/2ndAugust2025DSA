package arrays.recursion.binarySearch;

public class KokoBananas {

    static int util(int mid , int piles[]){
        // 5,3,2,7 , mid = 2
        int total =0;
        for(int i=0;i<piles.length ;i++){
            total = total + piles[i]/mid;
            if(piles[i]%mid != 0){
                total = total +1;
            }
        }
        return total;
    }

    static int binaryHelper(int lo , int hi , int h , int[]piles, int minSpeed){
        // System.out.println(minSpeed);
        if(lo> hi){
            return minSpeed;
        }
        int mid = (lo+hi)/2;
        int hoursTaken = util(mid , piles);
        // System.out.println(hoursTaken +"---"+mid);
        if(hoursTaken == h && mid < minSpeed){
            minSpeed = mid;
        }
        System.out.println(mid +"=="+ minSpeed);
        int result =0;
        if(hoursTaken<=h){
           result =  binaryHelper(lo, mid-1, h, piles, minSpeed);
        }
        else{
            result = binaryHelper(mid+1, hi, h, piles, minSpeed);
        }
        return result;
    
    }
    static int helper(int piles[] , int h){
        int lo =1;
        int hi = maximum(piles);
        int minSpeed = hi;
        return binaryHelper(lo, hi , h , piles, minSpeed);

    }
    static int maximum(int []piles){
        int max=piles[0];
        for(int i=1;i<piles.length ;i++){
            if(max< piles[i]){
                max= piles[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []piles = {3,6,7,11};
        int h = 8;

       System.out.println( helper(piles, h));
    }
}
