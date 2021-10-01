package Graph;

import java.util.Stack;

public class TopologicalSorting {
    Stack<Integer> traversedNodes=new Stack<>();
boolean haveTraversedNode[]=new boolean[200];
    public void performTopologicalSort(int start, Graph graph) {
        haveTraversedNode = new boolean[graph.getV()];

        recursiveFunction(start,graph);

        for(int i=0;i<graph.getV();i++)
        {
            if(!haveTraversedNode[i]){
                recursiveFunction(i,graph);
            }
        }

        while(!traversedNodes.isEmpty())
        {
            System.out.println(traversedNodes.peek()+"->");
            traversedNodes.pop();
        }

    }
            public void recursiveFunction(int start,Graph graph)
            {
                int temp = 0;
                if(!haveTraversedNode[start]) {
                    for (int i = 0; i < graph.getAdj()[start].size(); i++) {
                        recursiveFunction(graph.getAdj()[start].get(i), graph);

                    }

                }if(!haveTraversedNode[start]) {
                    haveTraversedNode[start] = true;
                    traversedNodes.add(start);
                }


            }



}

