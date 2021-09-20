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
}
