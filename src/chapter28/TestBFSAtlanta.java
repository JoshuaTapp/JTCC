/*
 * Created on 4/30/19 12:15 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

/*
 * Created on 4/26/19 10:53 PM by Joshua Tapp
 * Student at John Tyler Community College
 */


package chapter28;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestBFSAtlanta {
    public static void main(String[] args) {
        String[] vertices = {"Seattle", "San Francisco", "Los Angeles",
                "Denver", "Kansas City", "Chicago", "Boston", "New York",
                "Atlanta", "Miami", "Dallas", "Houston"};

        int[][] edges = {
                {0, 1}, {0, 3}, {0, 5},
                {1, 0}, {1, 2}, {1, 3},
                {2, 1}, {2, 3}, {2, 4}, {2, 10},
                {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
                {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
                {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
                {6, 5}, {6, 7},
                {7, 4}, {7, 5}, {7, 6}, {7, 8},
                {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
                {9, 8}, {9, 11},
                {10, 2}, {10, 4}, {10, 8}, {10, 11},
                {11, 8}, {11, 9}, {11, 10}
        };

        Graph<String> graph = new UnweightedGraph<>(vertices, edges);

        UnweightedGraph<String>.SearchTree breadthFirstSearch = graph.bfs(graph.getIndex("Atlanta"));


        List<Integer> searchOrders = breadthFirstSearch.getSearchOrder();

        System.out.println(breadthFirstSearch.getNumberOfVerticesFound() + " " + "vertices are searched in this BFS order:");

        for (Integer searchOrder : searchOrders){
            if(searchOrder.equals(searchOrders.get(searchOrders.size() - 1))) System.out.print(graph.getVertex(searchOrder) + ".\n\n");
            else System.out.print(graph.getVertex(searchOrder) + ", ");
        }


        IntStream.range(0, searchOrders.size()).filter(i -> {
            return breadthFirstSearch.getParent(i) != -1;
        }).mapToObj(i -> "Parent of" + " " + graph.getVertex(i) + " " + "is" + " " + graph.getVertex(breadthFirstSearch.getParent(i))).forEach(System.out::println);
    }
}

