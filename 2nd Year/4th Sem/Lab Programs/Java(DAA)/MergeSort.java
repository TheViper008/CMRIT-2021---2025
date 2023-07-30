import java.util.Arrays;

import java.util.Random;

import java.util.*;

public class MergeSort {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");

		int size = sc.nextInt();

		int arr[] = RandomArray(size);

		long start = System.nanoTime();

		mergeSort(arr);

		long end = System.nanoTime();

		long total = (end - start)/1000000;

		System.out.println("Time Taken to sort "+size+" Elements is: "+total+" nanosec");

		}

	public static void mergeSort(int arr[]) {

		if(arr.length<=1) {

			return;

		}

		int mid = arr.length/2;

		int left[] = Arrays.copyOfRange(arr,0,mid);

		int right[] = Arrays.copyOfRange(arr,mid,arr.length);

		mergeSort(left);

		mergeSort(right);

		merge(left,right,arr);

	}

	public static void merge(int left[],int right[],int arr[]) {

		int i=0,j=0,k=0;

		while(i<left.length && j<right.length) {

			if(left[i]<=right[j]) {

				arr[k++] = left[i++];}

			else {

				arr[k++] = right[j++];

			}

		}

		while(i<left.length) {

				arr[k++] = left[i++];}

		while(j<right.length) {

			arr[k++] = right[j++];}

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