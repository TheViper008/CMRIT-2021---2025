//Find Smallest number in an array

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i =0;i<size;i++) {
			System.out.println("Enter element "+(i+1));
			a[i] = sc.nextInt();
;		}
		int small;
		small = a[0];
		for(int i=0;i<size;i++) {
			if(a[i]<small) {
				small = a[i];
			}
		}
		System.out.println("The smallest number in the array of numbers is "+small);

	}

}
