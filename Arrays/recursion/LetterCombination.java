import java.util.ArrayList;

public class LetterCombination {

    static void helper(String arr[] , String option,String tempans,  int in ,ArrayList<String> ans ){
        if(in == option.length()){
            ans.add(tempans);
            return;
        }

        int digit = option.charAt(in)-48;
        String op = arr[digit];

        for(int i=0;i<op.length() ;i++){
            helper(arr, option, tempans+op.charAt(i), in+1, ans);
        }

    }
    public static void main(String[] args) {
        String []arr ={null, null, "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz"};

        String option ="3462";
        ArrayList<String> ans  = new ArrayList<>();

        helper(arr, option ,"", 0, ans);

        System.out.println(ans);
    }
}
