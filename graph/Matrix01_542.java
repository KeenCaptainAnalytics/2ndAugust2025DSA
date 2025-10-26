import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int i ;
    int j;
    Pair(int i , int j){
        this.i = i;
        this.j = j;
    }
}
public class J01Matrix {

    static void bfs(int arr[][] , int ans[][], int i , int j){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        int count=-1;

        while(true){
            int stageEle = q.size();
            count++;
            for(int k=0;k<stageEle ;k++){
                Pair p = q.poll();
                int x= p.i;
                int y= p.j;
                if(arr[x][y]==0){
                    ans[i][j] = count;
                    return ;
                }
                else{
                    if(x-1>=0 ){
                        q.add(new Pair(x-1, y));
                    }
                    if(x+1<arr.length){
                        q.add(new Pair(x+1, y));
                    }
                    if(y-1>=0){
                        q.add(new Pair(x, y-1));
                    }
                    if(y+1<arr[0].length){
                        q.add(new Pair(x, y+1));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{0,0,0},{0,1,0},{1,1,1}};
        int ans[][] = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    ans[i][j] = 0;
                }
                else{
                    bfs(arr, ans, i, j);
                }
            }
        }

        // ans array printing

        for(int i =0;i<ans.length ;i++){
            for(int j =0 ;j<ans[0].length ;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
