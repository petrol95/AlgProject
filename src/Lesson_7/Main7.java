package Lesson_7;

public class Main7 {

    public static void main(String[] args) {
        System.out.println("--test Graph--");
        testGraph();
        System.out.println("\n--test dfs--");
        testDfs();
        System.out.println("\n--test bfs--");
        testBfs();
        
    }

    private static void testBfs() {
        Graph graph = new Graph(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");

        graph.addEdge("C", "F");

        graph.addEdge("D", "G");

        graph.addEdge("E", "H");

        graph.bfs("A");
    }

    private static void testDfs() {
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");

        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        graph.dfs("A");
    }

    private static void testGraph() {
        Graph graph = new Graph(8);
        graph.addVertex("Oleg");
        graph.addVertex("Petya");
        graph.addVertex("Sasha");
        graph.addVertex("Alexey");

        System.out.println(graph.addEdge("Oleg", "Sasha"));
        System.out.println(graph.addEdge("Oleg", "Andrey"));

        graph.display();
    }
}
