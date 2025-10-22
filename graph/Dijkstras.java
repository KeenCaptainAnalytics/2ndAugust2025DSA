import java.util.Comparator;
import java.util.PriorityQueue;

class Pair2{
    int vertex ;
    int dist;

    Pair2(int v, int d){
        this.vertex = v;
        this.dist = d;
    }
}

public class Dijkstra {
    public static void main(String[] args) {
        int edges[][] ={{0,1,10}, {0, 2, 2},{2,1,1},{1,3,5},{1,4,7},{3,4,1},{3,5,2}};
        int MAX = Integer.MAX_VALUE ;
        int dist[] = {0, MAX ,MAX, MAX ,MAX, MAX};
        int path[] = {-1, -1, -1, -1, -1, -1};

        PriorityQueue<Pair2> pq = new PriorityQueue<>(new Comparator<Pair2>() {
            @Override
            public int compare(Pair2 obj1, Pair2 obj2) {
                
                if(obj1.dist > obj2.dist){
                    return 1;
                }
                else if(obj1.dist < obj2.dist){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        pq.add(new Pair2(0,dist[0]));
        //   int size = pq.size();
        //   for(int i=0 ;i<size ;i++){
        //     Pair2 p = pq.poll();
        //     System.out.println(p.vertex + " " +p.dist);
        //   }




     helper(edges, dist , path, pq);


        for(int i=0;i<dist.length ;i++){
            System.out.print(dist[i]+" ");
        }

        System.out.println();
        for(int i=0;i<dist.length ;i++){
            System.out.print(path[i]+" ");
        }
    }
    static void helper(int [][]edges, int []dist , int []path, PriorityQueue<Pair2> pq){

    }
}
