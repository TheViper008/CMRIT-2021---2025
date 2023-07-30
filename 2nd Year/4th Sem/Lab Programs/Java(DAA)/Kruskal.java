import java.util.*;

/*
999 7 8 999 999 999
7 999 6 3 999 999
999 6 999 4 2 5
8 3 4 999 3 999
999 999 2 3 999 2
999 999 5 999 2 999
 */

public class MinSpanTree {
	public static void main(String[] args) {
		Kruskal k = new Kruskal();
		k.createGraph();
		k.findMst();
	}
}

class Kruskal {
	int n, nEdges;
	int adj[][];
	int edges[][];
	static final int inf = 999;
	
	public void createGraph() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of nodes in graph: ");
		n = sc.nextInt();
		int i, j, k = 0;
		adj = new int[n][n];
		edges = new int[n*n][3];
		System.out.println("Enter the cost adjacency matrix for graph (999 if not connected): ");
		for (i=0;i<n;i++)
			for (j=0;j<n;j++) {
				adj[i][j] = sc.nextInt();
				edges[k][0] = i;
				edges[k][1] = j;
				edges[k++][2] = adj[i][j];
			}
	}
	
	int find(int x, int parent[]) {
		while (parent[x] >= 0)
			x = parent[x];
		return x;
	}
	
	void setUnion(int x, int y, int[] parent) {
		parent[x] = y;
	}
	
	public void findMst() {
		Arrays.sort(edges, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[2], b[2]);
		}});
		int i, x, y, cost=0, ecount=0;
		int[] parent = new int[n];
		for (i=0;i<n;i++)
			parent[i] = -1;
		i = 0;
		int[][] mst = new int[n][2];
		while (i<(n*n) && ecount<n-1) {
			if (edges[i][2] == 999)
				break;
			x = find(edges[i][0], parent);
			y = find(edges[i][1], parent);
			
			if (x != y) {
				cost += edges[i][2];
				mst[ecount][0] = edges[i][0];
				mst[ecount++][1] = edges[i][1];
				setUnion(x, y, parent);
			}
			i++;
		}
		if (ecount < n-1)
			System.out.println("The minimal spanning tree could not be found!");
		else {
			System.out.println("The minimal spanning tree cost: "+cost);
			System.out.println("The minimal spanning tree is: ");
			for (i=0;i<n-1;i++)
				System.out.println(mst[i][0] + "-" + mst[i][1]);
		}
	}
	
}