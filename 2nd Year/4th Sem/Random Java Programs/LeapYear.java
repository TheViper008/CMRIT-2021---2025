//Find if a year is leap year or not 
// A year is a leap year if it is divisible by 4,
// except for years that are divisible by 100 but not divisible by 400.

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		if(isLeapYear(year)) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		

	}
	public static boolean isLeapYear(int year) {
		return (year % 4 ==0 && (year % 100 !=0 || year % 400 == 0));
	}

}
