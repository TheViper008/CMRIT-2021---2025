//Fibonacci Series

import java.util.Scanner;

public class GCD {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();

		int gcd = GCD(num1,num2);
		System.out.println("THe GCD of "+num1+" and "+num2+" is "+gcd);
	}

	public static int GCD(int num1,int num2){
		if(num2 == 0){
			return num1;
		}

		else{
			return GCD(num2,num1%num2);
		}
	}

}
