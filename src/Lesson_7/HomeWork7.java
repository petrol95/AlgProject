package Lesson_7;

public class HomeWork7 {

    public static void main(String[] args) {
        Graph graph1 = new Graph(10);
        Graph graph2 = new Graph(10);
        Graph graph3 = new Graph(12);

        // Route 1
        testRoute1(graph1);
        System.out.println("\nBest cut 1 = " + graph1.findShortcut("Москва", "Воронеж") + "\n");

        // Route 2
        testRoute2(graph2);
        System.out.println("\nBest cut 2 = " + graph2.findShortcut("Москва", "Воронеж") + "\n");

        // Route
        testRoute3(graph3);
        // System.out.println("\nBest cut = " + graph3.findShortcut("Москва", "Москва"));
        System.out.println("\nBest cut 3 = " + graph3.findShortcut("Москва", "Воронеж") + "\n");
    }

    private static void testRoute3(Graph graph) {
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Брянск");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");
        graph.addVertex("Владимир");
        graph.addVertex("Ярославль");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Тула", "Тамбов");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Липецк", "Брянск");
        graph.addEdge("Ярославль", "Воронеж");
        graph.addEdge("Брянск", "Калуга");
        graph.addEdge("Брянск", "Курск");
        graph.addEdge("Курск", "Орел");
        graph.addEdge("Орел", "Воронеж");
        graph.addEdge("Курск", "Саратов");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Тамбов", "Владимир");
        graph.addEdge("Владимир", "Ярославль");
    }

    private static void testRoute2(Graph graph) {
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Липецк", "Рязань");
        graph.addEdge("Рязань", "Воронеж");
        graph.addEdge("Москва", "Саратов");
        graph.addEdge("Саратов", "Тамбов");
        graph.addEdge("Саратов", "Калуга");
        graph.addEdge("Тамбов", "Воронеж");
        graph.addEdge("Калуга", "Орел");
        graph.addEdge("Орел", "Воронеж");
    }

    private static void testRoute1(Graph graph) {
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");
        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");
    }
}
