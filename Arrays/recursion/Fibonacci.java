public class Fibonacci {
    // 0, 1 => 1 =>2 => 3= > 5=> 8 =>13 =>

    static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n ==2){
            return 1;
        }

        int lastTerm = fibo(n-1);
        int secondLT =  fibo(n-2);
        int currentTerm = lastTerm + secondLT;
        return currentTerm;
    }
    public static void main(String[] args) {
        int result = fibo(5);
        System.out.println(result);
    }
}
