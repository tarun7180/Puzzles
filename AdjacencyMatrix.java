
public class AdjacencyMatrix {

	private int[][] graph;
	
	public AdjacencyMatrix(int x, int y) {
		graph = new int[x][y];
	}
	
	public void put(int value, int x, int y) {
		graph[x][y] = value;
	}
	
	public void print(int x, int y) {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++){
				if(graph[i][j] != 0) {
					System.out.println(i + " --> " + j + "-->Value = " + graph[i][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		AdjacencyMatrix graphMatrix = new AdjacencyMatrix(5, 6);
		graphMatrix.put(1, 1, 2);
		graphMatrix.put(1, 1, 3);
		graphMatrix.put(2, 1, 4);
		graphMatrix.put(4, 2, 4);
		graphMatrix.put(1, 2, 5);
		graphMatrix.put(7, 3, 5);
		graphMatrix.put(1, 4, 5);
		graphMatrix.print(5, 6);
	}

	
}
