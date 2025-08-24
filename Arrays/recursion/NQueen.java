public class NQueen {

    static boolean checkConstraint(int board[][], int  row, int col) {

        // column
        for(int i = row ; i>=0 ;i--){
            if(board[i][col] == 1) {
                return false;
            }
        }
        // left diagonal
        for(int i = row , j =col ; i>=0 && j>=0;i--, j--){
            if(board[i][j]==1){
                return false;
            }
        }
        // right
        for(int i = row , j =col ; i>=0 && j<board.length;i--, j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;

    }
    static void helper(int board[][] , int q){
        int row = q;
        System.out.println(row);
        if(row  == board.length){
            print(board);
            System.out.println("==========================");
            return;
            // return true;
        }

        for(int i =0;i< board.length;i++){
            if(checkConstraint(board, row, i)== true){
                board[row][i] = 1;
                
                // all possibilities
                helper(board, q+1);
                board[row][i] = 0;

                // single output
                // if(helper(board , q+1)==false){
                //     // false
                //      board[row][i] = 0;
                // }
                // else{
                //     return true;
                // }
            }
        }

        // return false;
    }
    public static void main(String[] args) {
        int n =4;
        int board[][] = new int[n][n];
        helper(board, 0);

        // print(board);
// print all the possibilities 
    }

    static void print(int board[][]){
        for(int i=0;i< board.length ;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
