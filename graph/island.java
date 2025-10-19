import java.util.LinkedList;
import java.util.Queue;

class Island{
    public static void main(String[] args) {
        char [][]grid = {{'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};

        boolean [][]visited = new boolean[grid.length][grid[0].length];

        int count =0 ;
        for(int i= 0 ;i< grid.length ;i++){
            for(int j =0;j<grid[i].length ;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    bfs(grid, visited, i, j);
                    count++;
                }
            }
        }

        for(int i= 0 ;i< grid.length ;i++){
            for(int j =0;j<grid[i].length ;j++){
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(count);

    }

    static void bfs(char grid[][], boolean visited[][], int i , int j ){
        Queue<Pair> q= new LinkedList<>();

        q.add(new Pair(i, j));

        while(q.isEmpty() == false){
            Pair curr = q.poll();
            if(visited[curr.i][curr.j]== true){
                continue;
            }
            visited[curr.i][curr.j]= true;

            int row = curr.i;
            int col = curr.j;

            // left 
            if(col-1 >=0 && visited[row][col-1]== false && grid[row][col-1]== '1'){
                q.add(new Pair(row, col-1));
            }
            //right
            if(col+1<grid[0].length && visited[row][col+1]== false && grid[row][col+1]=='1'){
                q.add(new Pair(row, col+1));
            }
            // up
            if(row-1 >=0  && visited[row-1][col]== false && grid[row-1][col]=='1' ){
                q.add(new Pair(row-1, col));
            }
            // down
            if(row+1<grid.length  && visited[row+1][col]== false && grid[row+1][col]=='1' ){
                q.add(new Pair(row+1, col));
            }
        }

    }
}


class Pair{
    int i ;
    int j;

    Pair(int row , int col){
        this.i = row;
        this.j = col;
    }
}




