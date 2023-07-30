//Check if a number is a perfect square or not 

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for(int i = 2;i<num;i++) {
			if(num/i==i) {
				System.out.println(num+" is a perfect square");
			}
		}
		
		
	}

}
