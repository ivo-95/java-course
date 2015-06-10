package graph;

public class Tester {

	public static void main(String[] args) {
		GraphMatrix graph = new GraphMatrix(5);

		graph.connectEdges(1, 5);
		graph.connectEdges(2, 5);
		System.out.println(graph.areConnected(1, 5));
		System.out.println(graph.areConnected(1, 2));
		System.out.println(graph.pathExists(1, 2));
		System.out.println(graph.pathExists(2, 5));
		
		int[][] matrix = graph.getMatrix();
		System.out.println("\t|1|\t|2|\t|3|\t|4|\t|5|");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < matrix.length; i++) {
			System.out.format("|%d|\t", i + 1);
			for (int j = 0; j < matrix.length; j++) {
				System.out.format(" %d\t", matrix[i][j]);
			}
			System.out.println("\n-------------------------------------------");
		}
	}

}
