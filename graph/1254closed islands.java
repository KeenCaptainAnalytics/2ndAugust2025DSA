public class ClosedIslands1254 {
   public static void main(String[] args) {
        int [][]grid = {{1,1,1,1,1,1,1,0},
                        {1,0,0,0,0,1,1,0},
                        {1,0,1,0,1,1,1,0},
                        {1,0,0,0,0,1,0,1},
                        {1,1,1,1,1,1,1,0}};

        boolean [][]visited = new boolean[grid.length][grid[0].length];

        int closed =0;
        for(int i=0;i<grid.length ;i++){
            for(int j =0 ;j<grid[0].length ;j++){
                if(grid[i][j]==0 && visited[i][j]==false){
                    boolean result = dfs(grid, visited , i, j);
                    if(result == true){
                        closed ++;
                    }
                }
            }
        }

        System.out.println(closed);
   } 
   static boolean dfs(int grid[][] , boolean visited[][], int i , int j){
        // dfs trav
        
        visited[i][j]= true;
        // top , left , right , bottom
        // left
        boolean result1= true, result2=true, result3=true, result4=true;
        if(j-1>=0 && grid[i][j-1]==0 && visited[i][j-1]== false){
            result1 = dfs(grid, visited, i, j-1);
        }
        // right
        if(j+1<grid[0].length && grid[i][j+1]==0 && visited[i][j+1]== false){
            result2 = dfs(grid, visited, i, j+1);
        }
        // top
        if(i-1>=0 && grid[i-1][j]==0 && visited[i-1][j]== false){
            result3 = dfs(grid, visited, i-1, j );
        }
        // bottom
        if(i+1<grid.length && grid[i+1][j]==0 && visited[i+1][j]== false){
            result4 = dfs(grid, visited, i+1, j );
        }
        boolean result5= true;
        
        if(i==0 || i==grid.length-1 || j==0 || j==grid[0].length-1){
            result5= false;
        }

        return result1 && result2 && result3 && result4 && result5; 
   }
}




