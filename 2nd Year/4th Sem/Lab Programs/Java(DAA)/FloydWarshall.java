import java.util.Scanner;

class Floyd {
    int N;
    int adj[][];

    public void create_graph() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in a graph:");
        N = sc.nextInt();
        adj = new int[N + 1][N + 1];
        System.out.println("Enter the adjacency matrix for graph:");
        System.out.println("If two nodes are not connected : 999.");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                adj[i][j] = sc.nextInt();
                if (i == j) {
                    adj[i][j] = 0;
                }
            }
        }
    }

    public void find_path() {
        int dmatrix[][] = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dmatrix[i][j] = adj[i][j];
            }
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (dmatrix[i][k] + dmatrix[k][j] < dmatrix[i][j]) {
                        dmatrix[i][j] = dmatrix[i][k] + dmatrix[k][j];
                    }
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= N; j++) {
                System.out.print(dmatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class FloydWarshall {
    public static void main(String[] args) {
        Floyd graph = new Floyd();
        graph.create_graph();
        graph.find_path();
    }
}