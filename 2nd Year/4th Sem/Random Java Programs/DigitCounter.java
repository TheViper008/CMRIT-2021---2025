// To count the number of digits 

import java.util.Scanner;
public class DigitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer:");
		long num = sc.nextLong();
		
		System.out.println("Enter the digit:");
		int digit = sc.nextInt();
		
		int count = CountDigit(num, digit);
		System.out.print(count);
		sc.close();
	}
	
	public static int CountDigit(long num,int digit) {
		int count = 0;
		while(num != 0) {
			long last = num%10;
			if (last == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}

}
