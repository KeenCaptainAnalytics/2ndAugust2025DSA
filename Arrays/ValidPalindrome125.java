class ValidPalindrome125{

    static public boolean isPalindrome(String str) {
         String s = str.toLowerCase();
        int i = 0 ; // starting index
        int j = s.length()-1;
        while(i<j){ // n  i =0   j= 9

            while(i<str.length()  && !(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))){
                i++;
            }
            //i =4
            while(j>=0 && !(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j)))){
                j--;
            }
            //j =7

            if(i<j && s.charAt(i) == s.charAt(j)){
                // System.out.println(s.charAt(i));
                i++;
                j--;
                
            }
           else if(i>=j){//odd even 
                
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) {
        String str= "A man, a plan, a canal: Panama";

        boolean result =  isPalindrome(str);
        System.out.println(result);
    }
}