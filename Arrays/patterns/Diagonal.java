public class Diagonal {
    static void diaHelper(int mat[][]){

        int left =0 , right =mat[0].length-1 , top =0 , bottom = mat.length-1;
        boolean isUp = true;
        // up = > i-1 , j+1
        // down  => i+1 , j-1
        int i =0 ;
        int j =0;
        while(true){
            if(isUp == true){
                for(;i>=0&& j<=right;i=i-1, j = j+1){
                    System.out.print(mat[i][j]+" ");
                }
                i = i+1 ;
                j = j-1;
                if(i == top || j== right){
                    if(j+1 <= right){
                        j= j+1;
                    }
                    else if(i+1 <= bottom){
                        i = i+1;
                    }
                    else{
                        break;
                    }
                }

                isUp = false;
            }
            else if(isUp == false){
                for(;i<=bottom && j>=0 ; i=i+1, j = j-1){
                    System.out.print(mat[i][j]+" ");
                }
                i = i-1;
                j= j+1;
                 if(i == bottom || j==left){
                   if(i+1 <= bottom){
                         i = i+1;
                    }
                    else if( j+1  <= right){
                        j = j+1;
                    }
                    else{
                        break;
                    }
                    
                }
                isUp = true;
            }
        }


    }
    public static void main(String[] args) {
        int mat [][] ={{1,2,3},{4,5,6},{7,8,9}};

        print(mat);
        diaHelper(mat);
        
    }
    static void print(int mat[][]){
        for(int i=0 ;i < mat.length ;i++){
            for(int j =0 ; j< mat[i].length ;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
