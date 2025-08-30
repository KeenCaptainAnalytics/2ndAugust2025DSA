class SpiralMat54{

    static boolean checkCount(int currCount , int count){
        if(currCount < count) {
            return true;
        }
        return false;
    }
    static void helper(int arr[][]){

        int count = arr.length * arr[0].length;
        int currCount =0 ;
        int leftcol = 0, rightCol = arr[0].length-1;
        int topRow = 0 , bottomRow = arr.length-1;
        while(true){
            // left to right
            for(int i= leftcol ;i <=rightCol; i++){
                if(!checkCount(currCount, count)){
                    break;
                }
                System.out.print(arr[topRow][i]+" ");
                currCount++;
                
            }
            topRow ++; 
            // top to bottom 
            for(int i =topRow ;i<= bottomRow ;i++ ){
                if(!checkCount(currCount, count)){
                    break;
                }
                System.out.print(arr[i][rightCol]+" ");
                currCount++;
                
            }
            rightCol--;

             // right to left
            for(int i =rightCol  ;i>=leftcol  ;i-- ){
                if(!checkCount(currCount, count)){
                    break;
                }
                System.out.print(arr[bottomRow][i]+" ");
                currCount++;
                
            }
            bottomRow--;

            
             // bottom to up
            for(int i =bottomRow  ;i>= topRow  ;i-- ){
                if(!checkCount(currCount, count)){
                    break;
                }
                System.out.print(arr[i][leftcol] +" ");
                currCount++;
                
            }
            leftcol++;

        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        helper(arr);
    }
}