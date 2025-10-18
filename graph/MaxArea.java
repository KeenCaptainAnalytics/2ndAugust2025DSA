class Representation{
    public static void main(String[] args) {
        int arr[][] = { {0,1,1,0,0},
                        {0,0,1,1,1},
                        {0,0,1,0,0},
                        {0,0,1,0,0}};
        
        boolean visited[][] = new boolean[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length ;j++){
                if(arr[i][j] ==1 && visited[i][j]== false){
                    int count = dfs(arr, visited, i, j);
                    System.out.println(count);
                }
            }
        }
    }

    static int dfs(int arr[][], boolean visited[][], int row, int col){
        visited[row][col] = true;

        int count = 0;
        // left
        if(col-1>=0 && arr[row][col-1] == 1 && visited[row][col-1]== false){
            count =count +dfs(arr, visited, row, col-1);
        }
        if(col+1<=arr[row].length-1 && arr[row][col+1] == 1 && visited[row][col+1]== false){
            count =count +dfs(arr, visited, row, col+1);
        }
        if(row-1>=0 && arr[row-1][col] == 1 && visited[row-1][col]== false){
             count =count +dfs(arr, visited, row-1, col);
        }
        if(row+1<=arr.length-1 && arr[row+1][col] == 1 && visited[row+1][col]== false){
             count =count +dfs(arr, visited, row+1, col);
        }

        return count+1;
    }

}
