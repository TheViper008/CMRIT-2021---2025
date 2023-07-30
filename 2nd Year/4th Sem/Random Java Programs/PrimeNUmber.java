//Prime Numbers in Range

import java.util.Scanner;

public class PrimeNUmber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers up to " + end + ":");
        for (int num = 2; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i<= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
