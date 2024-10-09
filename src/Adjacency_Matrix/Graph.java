package Adjacency_Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst){
        return matrix[src][dst] == 1;
    }


    public void print() {
        System.out.printf("%3s", "");
        for (Node node : nodes) {
            System.out.printf("%s  ", node.data);
        }
        System.out.println();
        for (int x = 0; x < matrix.length; x++) {
            System.out.printf("%s ", nodes.get(x).data);
            System.out.println(Arrays.toString(matrix[x]));
        }
    }



}
