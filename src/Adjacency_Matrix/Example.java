package Adjacency_Matrix;

import java.util.Random;

public class Example {
    public static void run(int matrix_size){


        Random rand = new Random();
        Graph graph = new Graph(matrix_size);

        for (int x = 0; x < matrix_size; x++) {
            graph.addNode(new Node((char) ('A'+x)));
        }

        while (!graph.checkEdge(0,5)) {
            graph.addEdge(rand.nextInt(matrix_size), rand.nextInt(matrix_size));
        }
        graph.print();

        System.out.println(graph.checkEdge(3,4));
        System.out.println(graph.checkEdge(0,0));
        System.out.println(graph.checkEdge(1,2));
    }
}
