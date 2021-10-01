import Graph.CheckForCycleAndTopologicalSort;
import Graph.Graph;
import Greedy.CashierAlgorithm;
import Greedy.IntervalScheduling;
import Greedy.Job;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args)
   {
      Graph graph = new Graph(4);
      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 2);
      graph.addEdge(2, 0);
      graph.addEdge(2, 3);

      //CheckForCycleAndTopologicalSort dag=new CheckForCycleAndTopologicalSort();
      //dag.checkForCycleAndTopologicalSort(0,graph);



      //      Graph.BFS bfs=new Graph.BFS();
      //      //bfs.performBFS(0,graph);
      //      Graph.DFS dfs=new Graph.DFS();
      //      Graph.TopologicalSorting topologicalSorting=new Graph.TopologicalSorting();
      //      topologicalSorting.performTopologicalSort(0,graph);
      //     // dfs.performDFS(0,graph);
      //  boolean res=bfs.checkIfGraphIsBipartite(0,graph);
      //System.out.println("Graph.Graph is bipartite"+res);
      //   CashierAlgorithm cashierAlgorithm=new CashierAlgorithm();
      //  cashierAlgorithm.performCashierAlgorithm(79);
      IntervalScheduling intervalScheduling= new IntervalScheduling();
      ArrayList<Job> jobs=new ArrayList<>();
      Job job1=new Job();
      job1.setJobId(1);
      job1.setStartTime(0);
      job1.setFinishTime(6);
      jobs.add(job1);
      Job job=new Job();

      job.setJobId(2);
      job.setStartTime(1);
      job.setFinishTime(4);
      jobs.add(job);

      Job job2=new Job();

      job2.setJobId(3);
      job2.setStartTime(3);
      job2.setFinishTime(5);
      jobs.add(job2);
      Job job3=new Job();


      job3.setJobId(4);
      job3.setStartTime(3);
      job3.setFinishTime(8);
      jobs.add(job3);
      Job job4=new Job();

      job4.setJobId(5);
      job4.setStartTime(4);
      job4.setFinishTime(7);
      jobs.add(job4);

      Job job5=new Job();

      job5.setJobId(6);
      job5.setStartTime(5);
      job5.setFinishTime(9);

      jobs.add(job5);

      Job job6=new Job();

      job6.setJobId(7);
      job6.setStartTime(6);
      job6.setFinishTime(10);
      jobs.add(job6);

      Job job7=new Job();

      job7.setJobId(8);
      job7.setStartTime(8);
      job7.setFinishTime(11);
      jobs.add(job7);

      intervalScheduling.performIntervalScheduling(jobs);
   }


}
