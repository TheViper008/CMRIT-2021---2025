import java.util.Scanner;

public class Prim {

	public static void my_prim(int [][]adj, int num)
	{
		int i,j,VisitedNodes,min,min_cost=0,u=0,v=0;
		int[] visit = new int[num];
		for(i=0;i<num;i++)
		{
			visit[i] = 0;
		}
		visit[0]=1;
		VisitedNodes=1;
		while(VisitedNodes < num)
		{
			min=999;
			for(i=0;i<num;i++)
			{
				if(visit[i] == 1)
				{
					for(j=0;j<num;j++)
					{
						if(adj[i][j] < min)
						{
							min = adj[i][j];
							adj[i][j] = 999;
							u=i;
							v=j;
						}
					}
				}
			}
			if(visit[u] == 1 && visit[v] == 0) 
			{
				visit[v] = 1;
				min_cost += min;
				VisitedNodes++;
				System.out.printf("Edge %d - %d : (%d)\n",u,v,min);
			}
		}
		System.out.println("Cost : " + min_cost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] adj;
		int num,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of nodes in the graph : ");
		num = sc.nextInt();
		adj = new int[num][num];
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				adj[i][j] = -1;
			}
		}
		System.out.println("Enter the cost adjacency matrix for graph (999 if not connected): ");
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				adj[i][j] = sc.nextInt();
				if(adj[i][j] == 0)
				{
					adj[i][j]=999;
				}
			}
		}
		Prim.my_prim(adj, num);
		
	}
}

/*
999 7 8 999 999 999
7 999 6 3 999 999
999 6 999 4 2 5
8 3 4 999 3 999
999 999 2 3 999 2
999 999 5 999 2 999
*/
