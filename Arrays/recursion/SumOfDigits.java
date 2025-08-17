public class SumOfDigits {

    // static int helper(int num){
    //     if(num==0){
    //         return 0;
    //     }
    //     int digit = num %10;
    //     int sum = helper(num/10);
    //     sum= sum+digit ;
    //     return sum;
    // }

    // static    int helper(int num , int sum ){
    //     if(num ==0){
    //         return sum;
    //     }
    //     int digit = num %10;
    //     sum = sum+ digit;
    //     return helper(num/10, sum);

    // }
    static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        // logic 
        System.out.println(n);
        
    }
//    5(5) => 4(4) => 3(3) => 2(2) => 1(1) => 0
    public static void main(String[] args) {

        // print n 
        int n = 5;
        printNum(n);
        // Q -> sum of all the digits
        // int num =12345;
        // int result = helper(12345, 0);
        // System.out.println(result);
         // 12345 - > 1234 => 123 => 12 => 1 => 0
        // int sum =0 ;
        // while(num!=0){
        //     int digit = num %10;
        //     sum += digit;
        //     num = num/10;

        // }

        

    }
}
