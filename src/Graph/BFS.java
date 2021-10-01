package Graph;

public class BFS {

    public void performBFS(int start,Graph graph)
    {
        int temp=0;
        boolean haveTraversedNode[] =new boolean[graph.getV()];
        graph.getQueue().add(start);
        haveTraversedNode[start]=true;
        while (graph.getQueue().size()>0) {
            start=graph.getQueue().poll();
            System.out.println(start);
            for (int i = 0; i < graph.getAdj()[start].size(); i++) {
                temp=graph.getAdj()[start].get(i);
                if(!haveTraversedNode[temp])
                {
                    graph.getQueue().add(temp);
                    haveTraversedNode[temp]=true;
                }
            }
        }
    }

    public boolean checkIfGraphIsBipartite(int start, Graph graph) {
        int temp=0;
        boolean haveTraversedNode[] =new boolean[graph.getV()];
        String color[]=new String[graph.getV()];
        graph.getQueue().add(start);
        haveTraversedNode[start]=true;
        color[start]="Red";
        while (graph.getQueue().size()>0) {
            start=graph.getQueue().poll();
            System.out.println(start);
            for (int i = 0; i < graph.getAdj()[start].size(); i++) {
                temp=graph.getAdj()[start].get(i);
                if(!haveTraversedNode[temp])
                {
                    color[temp]=color[start]=="Red"?"Blue":"Red";
                    graph.getQueue().add(temp);
                    haveTraversedNode[temp]=true;
                }
            }
        }
        for(String i:color)
        {
            System.out.println(i);


        }
        for(int j=0;j<graph.getV();j++){

        for (int i = 0; i < graph.getAdj()[j].size(); i++) {
            temp=graph.getAdj()[j].get(i);
            if(color[temp].equals(color[j]))
                return false;
            }
        }
        return true;

        }
    }

