// 46. Permutations

import java.util.ArrayList;

public class PermutationWithoutRep {
    static void helper(int [] arr ,boolean visited[], ArrayList<Integer> ans){

        if(ans.size() == arr.length){
            System.out.println(ans);
            return;
        }

       for(int i=0 ;i<arr.length ;i++){
            if(!visited[i]==true){
                ans.add(arr[i]);
                visited[i]=true;
                helper(arr, visited, ans);
                ans.remove(ans.size()-1);
                visited[i]=false;
            }
       }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        boolean visited[] = new boolean[arr.length];
        helper(arr, visited,new ArrayList<>());
    }
}
