package simpleTasks._7_DepthFirstSearch;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        dfs(1, readGraph());
    }

    static Map<Integer, ArrayList<Integer>> readGraph() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        String[] vortEdgeCount = reader.readLine().split(" ");

        int edgeCount = Integer.parseInt(vortEdgeCount[1]);
        for (int i = 1; i <= edgeCount; i++) {
            String line = reader.readLine();
            String[] str = line.split(" ");
            int node1 = Integer.parseInt(str[0]);
            int node2 = Integer.parseInt(str[1]);
            //т.к. граф неориентирован, пишем сначала в одну, потом в другую сторону
            ArrayList<Integer> adj = graph.getOrDefault(node1, new ArrayList<>());
            adj.add(node2);
            graph.put(node1, adj);
            adj = graph.getOrDefault(node2, new ArrayList<>());
            adj.add(node1);
            graph.put(node2, adj);
        }
        reader.close();
        return graph;
    }

    static void dfs(int root, Map<Integer, ArrayList<Integer>> graph) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        if (graph.isEmpty()) {
            writer.write(String.valueOf(0));
            writer.newLine();
            writer.write(String.valueOf(0));
            writer.close();
            return;
        }
        Set<Integer> visited = new TreeSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Integer currentNode = stack.pop();
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                if (!graph.get(currentNode).isEmpty()) {
                    for (Integer i : graph.get(currentNode)) {
                        stack.push(i);
                    }
                }
            }
        }
        writer.write(String.valueOf(visited.size()));
        writer.newLine();
        for (Integer i : visited) {
            writer.write(String.valueOf(i));
            writer.write(" ");
        }
        writer.close();
    }
}
