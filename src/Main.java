public class Main {
   public static void main(String[] args)
   {
      Graph graph = new Graph(6);

      graph.addEdge(0, 1);
      graph.addEdge(0, 3);
      graph.addEdge(0, 4);
      graph.addEdge(4, 5);
      graph.addEdge(3, 5);
      graph.addEdge(1, 2);
      graph.addEdge(4, 1);
      graph.addEdge(3, 1);


      BFS bfs=new BFS();
      //bfs.performBFS(0,graph);
      DFS dfs=new DFS();
      dfs.performDFS(0,graph);


   }


}
