public class TreeRecursion {
    static void helper(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        helper(n-1);
        helper(n-1);
    }
 public static void main(String[] args) {
    helper(3);
 }   
}
