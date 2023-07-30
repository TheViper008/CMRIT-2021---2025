//write a java program to count the number of particular character in the given input string


import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Read the character to count
        System.out.print("Enter the character to count: ");
        char charToCount = scanner.next().charAt(0);

        // Close the scanner
        scanner.close();

        // Call the method to count the character
        int count = countCharacter(inputString, charToCount);

        // Display the result
        System.out.println("The character '" + charToCount + "' appears " + count + " times in the input string.");
    }

    public static int countCharacter(String str, char ch) {
        int count = 0;

        // Convert the input string to lowercase (optional: to count both uppercase and lowercase occurrences)
        str = str.toLowerCase();

        // Loop through each character in the string and check for a match
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(ch)) {
                count++;
            }
        }

        return count;
    }
}
