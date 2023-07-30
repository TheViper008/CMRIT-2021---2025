import java.util.Random;

import java.util.Scanner;

public class QuickSort {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array above 5000!:");

		int size = sc.nextInt();

		int arr[] = RandomArray(size);

		long start = System.nanoTime();

		quicksort(arr,0,arr.length-1);

		long end = System.nanoTime();

		long total = end - start;

		System.out.println("Time Taken to sort "+size+" Elements is: "+total+" nanosec");

	}

	

	public static int partition(int arr[],int low,int high) {

		if(low<high) {

			int pivot = arr[high];

			int i = low - 1;

			for(int j = low;j<high;j++) {

				if(arr[j]<=pivot) {

					i++;

					swap(arr,i,j);

				}

			}

			swap(arr,i+1,high);

			return i+1;

		}

		return high;

	}

	

	public static void quicksort(int arr[],int low,int high) {

		if(low<high) {

			int pivotIndex = partition(arr,low,high);

			quicksort(arr,low,pivotIndex-1);

			quicksort(arr,pivotIndex+1,high);}

	}

	

	public static void swap(int arr[],int i,int j) {

		int temp = arr[i];

		arr[i] = arr[j];

		arr[j] = temp;

	}

	

	public static int[] RandomArray(int size) {

		int arr[] = new int[size];

		Random r = new Random();

		for(int i = 0;i<size;i++) {

			arr[i] = r.nextInt();

		}

		return arr;

	}

}