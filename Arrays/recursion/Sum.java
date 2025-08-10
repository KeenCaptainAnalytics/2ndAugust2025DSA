public class Sum {
    // recursion => function call itself n number of times to repeat the same logic again and again 
    // it is called as recursion
    // static void print(int n){
    //     if(n==0){
    //         return;
    //     }
    //     // logic
    //     System.out.println(n);
    //     // call
    //     print(n-1);
    //     //logic
    //     System.out.println(n);
    // }


    // sum of first n natural numbers 

    // n = 5 
    // 1+2+3+4+5 =  15


    static int sumOfN(int n){
        if(n == 1){
            return 1;
        }
        else{
            int result = n + sumOfN(n -1); 
            return result;  
        }
    } 
    public static void main(String[] args) {
      int n = 4;
      int result = sumOfN(n);
      System.out.println(result);
        // f(4) = 4+ f(3)
        // f(3) = 3+ f(2)
        // f(2) = 2+ f(1)
        // f(1) = 1 // base case 
    }
}




