import java.util.HashMap;

public class TwoSum {

    static int[] getAns(int arr[], int target){
        int ans[]= new int[2];
        for(int i=0;i<arr.length-1;i++){
            //2nd ele
            for(int j = i+1 ;j< arr.length ;j++){
                // System.out.println( arr[i] + " - "+arr[j]);
                if(arr[i]+arr[j]==target){
                    ans[0] =i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }

    static int[] getAnsHashMap(int arr[] , int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i =0 ;i<arr.length ;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            }
            else{
                map.put(arr[i], i);

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        int ans [] = getAnsHashMap(arr, target);

        System.out.println(ans[0] + "-- "+ans[1]);
    }
}
