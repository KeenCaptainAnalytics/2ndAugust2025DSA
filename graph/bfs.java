
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AdjacencyList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        graph.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
         list2.add(0);
         graph.add(list2);
         list2.removeAll(list2);
         list2.add(0);
         list2.add(3);
         graph.add(new ArrayList<>(list2));
         list2.removeAll(list2);
         list2.add(5);
         list2.add(4);
         graph.add(new ArrayList<>(list2));
         list2.removeAll(list2);
         list2.add(5);
         list2.add(3);
         graph.add(new ArrayList<>(list2));
         list2.removeAll(list2);
         list2.add(4 );
         list2.add(3);
         graph.add(new ArrayList<>(list2));

         System.out.println(graph);

        boolean result = bfs(0, 5 , graph);
        System.out.println(result);
    }
// dfs => stack/recursion 
// bfs => queue based

    static boolean bfs(int source, int destination , ArrayList<ArrayList<Integer>> graph){

        Queue<Integer> q = new PriorityQueue<>();
        q.add(source);
        boolean visited[] = new boolean[graph.size()];
        visited[0] = true;
        while(q.isEmpty()== false){
            int curr = q.poll();
            if(curr == destination){
                return true;
            }
            
            System.out.print(curr+" => ");
            ArrayList<Integer> currList = graph.get(curr);
            // System.out.println(currList);
            for(int i =0;i<currList.size();i++){
                if(visited[currList.get(i)]== false)
                   {
                    q.add(currList.get(i));
                    visited[currList.get(i)] = true;
                   }

            }
        }


        return false;
    } 

}
