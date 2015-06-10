package graph;

public class Tester {

	public static void main(String[] args) {
		GraphMatrix graph = new GraphMatrix(5);

		graph.connectEdges(1, 5);
		graph.connectEdges(2, 5);
		System.out.println(graph.areConnected(1, 5));
		System.out.println(graph.pathExists(1, 2));
	}

}
