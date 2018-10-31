package Lesson_7;

public class HomeWork7 {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
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

        /*graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");
        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");*/

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

        System.out.println("Best cut = " + graph.findShortcut("Москва", "Воронеж"));
    }
}
