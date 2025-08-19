//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");

        System.out.println("\nGraph:");
        myGraph.printGraph();*/

       /* Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");


        System.out.println("\nGraph before addEdge():");
        myGraph.printGraph();


        myGraph.addEdge("A", "B");


        System.out.println("\nGraph after addEdge():");
        myGraph.printGraph();*/

      /*  Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");


        System.out.println("\nGraph before removeEdge():");
        myGraph.printGraph();

        myGraph.removeEdge("A", "B");

        System.out.println("\nGraph after removeEdge():");
        myGraph.printGraph();*/

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");


        System.out.println("\nGraph before removeVertex():");
        myGraph.printGraph();

        myGraph.removeVertex("D");

        System.out.println("\nGraph after removeVertex():");
        myGraph.printGraph();
    }
}