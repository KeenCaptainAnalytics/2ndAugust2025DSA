public class RecursionSimple {

    static void print(int n){
        System.out.println("message = > "+ n);
        if(n ==2){
            return ;
        }
        //logic
        if(n %2== 0){
            print(n+1);
            print(n+1);
            print(n+1);
        }
        else{
            print(n+1);
        }
    }
    public static void main(String[] args) {
        print(0);
    }
}
