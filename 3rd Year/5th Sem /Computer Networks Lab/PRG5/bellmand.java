import java.util.*;

public class bellmand {

	public static void main(String args[]) {

		System.out.println("Enter the no. of Vertices:");

		int num;

		int source;

		Scanner sc = new Scanner(System.in);

		num=sc.nextInt();

		int ad[][] = new int[num][num];

		System.out.println("Enter the Adjacency Matrix:");

		

		for(int i =0;i< num;i++){

			for(int j=0;j<num;j++) {

				ad[i][j] = sc.nextInt();

			}

		}

		System.out.println("Enter the source node:");

		source = sc.nextInt();

		belford(ad,num,source);

	}

	

	private static void belford(int ad[][],int num,int source) {

		int d[] = new int[num];

		for(int i =0;i<num;i++) {

			d[i] = 999;

		}

		d[source] = 0;

		for(int i =0;i<num-1;i++) {

			for(int u =0;u<num;u++) {

				for(int v =0;v<num;v++) {

					if(d[u]!= 999) {

						if(d[v] > d[u]+ad[u][v]) {

							d[v] = d[u]+ad[u][v];

						}

					}

				}

			}

		}

		for(int i =0;i<num;i++) {

			System.out.println("Distance of Source "+source+"  to "+i+" is "+d[i]);

		}

	}

}