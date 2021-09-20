import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int V;
    LinkedList<Integer> adj[];
    Queue<Integer> queue;


    public Graph(int vertices)
    {
        V=vertices;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
        queue=new LinkedList<Integer>();

    }

    public void addEdge(int i,int j)
    {
        adj[i].add(j);
        adj[j].add(i);
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(LinkedList<Integer>[] adj) {
        this.adj = adj;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }
}
