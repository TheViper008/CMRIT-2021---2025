import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        // Ensure that 'a' is the larger number
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Use the Euclidean algorithm to find GCD
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
