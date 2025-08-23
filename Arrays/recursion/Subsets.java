import java.util.ArrayList;

public class Subsets {

    static void helper(int arr[], int i,ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> powerSet){

        if(i == arr.length){
            ArrayList<Integer> temp = new ArrayList<>(ans);
            powerSet.add(temp);
            return;
        }
        ans.add(arr[i]);
        helper(arr, i+1, ans , powerSet);
        ans.remove(ans.size()-1);
        helper(arr, i+1, ans , powerSet);
    }  
    public static void main(String[] args) {
        ArrayList<Integer> ans  = new ArrayList<>();
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<ArrayList<Integer>>(); 
        int arr[] = {1,2,3,4};
        helper(arr, 0, ans , powerSet);
        System.out.println(powerSet);
    }
}
