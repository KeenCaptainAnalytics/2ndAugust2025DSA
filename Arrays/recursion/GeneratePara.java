import java.util.ArrayList;

public class GeneratePara {
    static void helper(int n , int count , int ob , int cl , String s ,  ArrayList<String> ans ){

        if(count==0 && ob == n  && cl == n){
            ans.add(s);
            return;
        }

        if(ob<n){
            helper(n , count+1, ob+1, cl ,s+"(", ans );
        }
        if(count>0 && cl<n){
            helper(n , count-1, ob, cl+1 ,s+")", ans );
        }
        
    }
    public static void main(String[] args) {
        int n = 4;
        ArrayList<String> ans = new ArrayList<>();
        helper(n, 0, 0, 0, "", ans);
        System.out.println(ans);
    }
}
