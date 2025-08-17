public class PermutationWithRep {
    // permutation => rep is not allowed (abc acb bac bca cba cab ) option => abc
    // state space tree
    // calls 
    
    static void helper(String option, String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return;
        }
        // b
        // a
        for(int i=0;i<option.length();i++){
            helper(option ,ans + option.charAt(i));
        }
        // helper(option ,ans + option.charAt(1));
        // helper(option ,ans + option.charAt(2));
    }
    public static void main(String[] args) {
        String option ="abcdef";
        String ans="";
        helper(option, ans);

    }
}
