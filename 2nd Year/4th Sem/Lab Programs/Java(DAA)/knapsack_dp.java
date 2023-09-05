import java.util.Scanner;

class ks_01 {
    int N;
    int weights[];
    int values[];
    int table[][];
    int W;

    public void read_data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of items:");
        N = sc.nextInt();
        System.out.println("Enter Sack capacity:");
        W = sc.nextInt();
        weights = new int[N + 1];
        values = new int[N + 1];
        table = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter weight and value of item: " + i);
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
    }

    public void find_value() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (weights[i] <= j && (table[i - 1][j]) < (table[i - 1][j - weights[i]] + values[i])) {
                    table[i][j] = table[i - 1][j - weights[i]] + values[i];
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        System.out.println("Total value of items taken = " + table[N][W]);
        System.out.println("Selected items are:");
        int j = W;
        for (int i = N; i > 0; i--) {
            if (table[i][j] != table[i - 1][j]) {
                System.out.println(i);
                j = j - weights[i];
            }
        }
    }
}

public class knapsack_dp {
    public static void main(String[] arg) {
        ks_01 ks_obj = new ks_01();
        ks_obj.read_data();
        ks_obj.find_value();
    }
}