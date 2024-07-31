import java.util.LinkedList;
import java.util.Queue;

public class bfsusingMatrix {
    private int numVertices;
    private int[][] adjMatrix;
    private boolean[] visited;

    public bfsusingMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
        visited = new boolean[numVertices];
    }

    // Function to add an edge into the graph
    public void addEdge(int startVertex, int endVertex) {
        adjMatrix[startVertex][endVertex] = 1;
        adjMatrix[endVertex][startVertex] = 1;
    }

    // BFS traversal from a given source
    public void bfs(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < numVertices; i++) {
                if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bfsusingMatrix graph = new bfsusingMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.bfs(0);
    }
}
