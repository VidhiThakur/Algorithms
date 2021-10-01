package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class CheckForCycleAndTopologicalSort {
    static Stack<Integer> topologicalOrder=new Stack<>();
    static Graph graph;
    static int[] visited=null;

    public void checkForCycleAndTopologicalSort(int start, Graph g){
        graph =g;
        visited = new int[graph.getV()];

        for(int i = 0; i < graph.getV(); i++)
        {
            if (visited[i] == 0)
            {
                performTopologicalSort(i);
            }
        }

        checkForCycle(graph);
    }

    private void checkForCycle(Graph graph) {
        HashMap<Integer,Integer> ordering=new HashMap<>();
        int k=0;
        ArrayList<Integer> topo=new ArrayList<>();
        while(!topologicalOrder.isEmpty())
        {
            topo.add(topologicalOrder.peek());
            ordering.put(topologicalOrder.peek(),k++);
            topologicalOrder.pop();

        }
        for(int i=0;i<graph.getV();i++)
        {
            for(int neighbor:graph.getAdj()[i])
            {
                if(ordering.get(neighbor)<ordering.get(i))
                {
                    System.out.println("Cycle Exists");
                    return;
                }
            }
        }
        System.out.println("Topological Ordering is :: ");
        int i=0;
        while (i<topo.size())
        {
            System.out.println(topo.get(i++));
            System.out.println(",");

        }
    }

    private void performTopologicalSort(int start) {
        visited[start]=1;
        for(int i=0;i<graph.getAdj()[start].size();i++)
        {

            if(visited[graph.getAdj()[start].get(i)]==0)
            {
                performTopologicalSort(graph.getAdj()[start].get(i));
            }
        }
        topologicalOrder.add(start);

    }

    }

