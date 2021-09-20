import java.util.Stack;

public class DFS {
    public void performDFS(int start, Graph graph) {
        int temp = 0;
        boolean haveTraversedNode[] = new boolean[graph.getV()];
        Stack<Integer> traversedNodes = new Stack<Integer>();
        traversedNodes.add(start);
        while (traversedNodes.size() > 0) {
            temp = traversedNodes.peek();
            traversedNodes.pop();
            if(!haveTraversedNode[temp]) {
                System.out.println(temp);
                haveTraversedNode[temp] = true;
            }
            for (int i = 0; i < graph.getAdj()[temp].size(); i++) {
                int temp2 = graph.getAdj()[temp].get(i);
                if (!haveTraversedNode[temp2]) {
                    traversedNodes.push(temp2);
                }
            }


        }
    }
}
