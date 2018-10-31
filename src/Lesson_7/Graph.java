package Lesson_7;

import java.util.*;

public class Graph {

    private List<Vertex> vertexes;
    private boolean[][] adjMatrix;

    private int size;

    public Graph(int maxSize) {
        vertexes = new ArrayList<>(maxSize);
        adjMatrix = new boolean[maxSize][maxSize];
        size = 0;
    }

    public void addVertex(String label) {
        Vertex vertex = new Vertex(label);
        vertexes.add(vertex);
        size++;
    }

    public boolean addEdge (String labelFrom, String labelTo) {
        Vertex vertexFrom = findVertex(labelFrom);
        Vertex vertexTo = findVertex(labelTo);
        if (vertexFrom == null || vertexTo == null) {
            return false;
        }
        addEdge(vertexFrom, vertexTo);
        return true;
    }

    private Vertex findVertex(String label) {
        for (Vertex vertex : vertexes) {
            if (vertex.getLabel().equals(label)) {
                return vertex;
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(vertexes.get(i));
        }
    }

    private void addEdge(Vertex vertexFrom, Vertex vertexTo) {
        int indexFrom = vertexes.indexOf(vertexFrom);
        int indexTo = vertexes.indexOf(vertexTo);

        adjMatrix[indexFrom][indexTo] = true;
        adjMatrix[indexTo][indexFrom] = true;
    }

    public void dfs(String startLabel) {
        Vertex vertex = findVertex(startLabel);
        if (vertex == null) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        Stack<Vertex> stack = new Stack();

        visitVertex(vertex, stack);

        while (!stack.isEmpty()) {
            vertex = getAdjUnvisitedVertex(stack.peek());
            if (vertex == null) {
                stack.pop();
            }
            else {
                visitVertex(vertex, stack);
            }
        }
        clearVertexes();
    }

    private void clearVertexes() {
        for (int i = 0; i < size; i++) {
            vertexes.get(i).setWasVisited(false);
        }
    }

    private Vertex getAdjUnvisitedVertex(Vertex vertex) {
        int startIndex = vertexes.indexOf(vertex);
        for (int i = 0; i < size; i++) {
            if (adjMatrix[startIndex][i] && !vertexes.get(i).isWasVisited()) {
                return vertexes.get(i);
            }
        }
        return null;
    }

    private void visitVertex(Vertex vertex, Stack<Vertex> stack) {
        vertex.setWasVisited(true);
        System.out.println(vertex);
        stack.push(vertex);
    }

    public void bfs(String startLabel) {
        Vertex vertex = findVertex(startLabel);
        if (vertex == null) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        Queue<Vertex> queue = new ArrayDeque();

        visitVertex(vertex, queue);

        while (!queue.isEmpty()) {
            vertex = getAdjUnvisitedVertex(queue.peek());
            if (vertex == null) {
                queue.remove();
            }
            else {
                visitVertex(vertex, queue);
            }
        }
        clearVertexes();
    }

    private void visitVertex(Vertex vertex, Queue<Vertex> queue) {
        vertex.setWasVisited(true);
        System.out.println(vertex);
        queue.add(vertex);
    }

    public LinkedList findShortcut (String startLabel, String endLabel) {

        Vertex startVertex = findVertex(startLabel);
        Vertex endVertex = findVertex(endLabel);

        if (startVertex == null) {
            throw new IllegalArgumentException("Invalid startLabel: " + startLabel);
        }

        if (endVertex == null) {
            throw new IllegalArgumentException("Invalid endLabel: " + endLabel);
        }

        LinkedList<LinkedList> cuts = new LinkedList<>();
        cuts.add(new LinkedList());
        cuts.getLast().add(startVertex.getLabel());

        LinkedList bestList = cuts.getLast();

        if (startLabel == endLabel) {
            return bestList;
        }

        Vertex currentVertex = startVertex;
        Vertex parentVertex = startVertex;

        Queue<Vertex> queue = new ArrayDeque();
        visitVertex(currentVertex, queue);

        while (!queue.isEmpty()) {
            parentVertex = queue.peek();
            currentVertex = getAdjUnvisitedVertex(parentVertex);
            boolean pr = false;

            if (currentVertex == null) {
                queue.remove();
            }
            else {
                String currentLabel = currentVertex.getLabel();
                String parentLabel = parentVertex.getLabel();

                if (currentLabel == endLabel) {
                    for (LinkedList cut : cuts) {
                        if (cut.getLast() == parentLabel) {
                            cut.add(currentLabel);
                            break;
                        }
                    }
                    break;
                }

                for (LinkedList cut : cuts) {
                    if (cut.getLast() == parentLabel) {
                        cut.add(currentLabel);
                        pr = true;
                        break;
                    }
                }
                if (!pr) {
                    cuts.add(new LinkedList());
                    cuts.getLast().add(parentLabel);
                    cuts.getLast().add(currentLabel);
                }
                visitVertex(currentVertex, queue);
            }
        }
        clearVertexes();
        for (LinkedList cut : cuts) {
            System.out.println("--------");
            System.out.println(cut);
            if (cut.getLast() == endLabel)
                bestList = cut;
        }
        return bestList;
    }

}
