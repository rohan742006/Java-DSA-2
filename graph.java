import java.util.*;
public class graph {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void create_graph(ArrayList<Edge>graph[]){   //every edge stores its neighbout in graph array
        for(int i=0;i<graph.length;i++){  //for each vertex
            graph[i]=new ArrayList<>();
        }

        //0 vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //1 vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        //vertex2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        
        //vertex3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //vertex4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //vertex5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }

    public static void dfs(ArrayList<Edge>graph [],int curr, boolean vis[]){
        //visit
        System.out.print(curr+" ");
        vis[curr]=true;

        //neighbour
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){  //check neighbour visited or not
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void bfs(ArrayList<Edge>graph []){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);  //source starting element


        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){  //visit curr if not already visited
                System.out.print(curr+" ");
                vis[curr]=true;

                //add neighbouring ones in queue
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);  //getting edge of all neighbour
                    q.add(e.dest);  //destination is the neighbour of curr
                }
            }
        }
    }
    public static void main(String args[]){
        int v=7;
        ArrayList<Edge>graph[]=new ArrayList[v];  //null -> empty arraylist
        create_graph(graph);
        //bfs(graph);
        dfs(graph,0,new boolean[v]);
    }
}
