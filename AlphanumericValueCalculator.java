import java.util.Scanner;

public class AlphanumericValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter an alphanumeric string (A-Z): ");
        String input = scanner.nextLine().toUpperCase(); // Convert input to uppercase
        
        // Calculate value of input string
        int value = calculateValue(input);
        
        // Print the calculated value
        System.out.println("Value of " + input + " is: " + value);
        
        scanner.close();
    }
    
    // Function to calculate the value of an alphanumeric string
    public static int calculateValue(String str) {
        int value = 0;
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                // Calculate value based on 'A' = 1, 'B' = 2, ..., 'Z' = 26
                value = value * 26 + ((int) ch - 'A' + 1);
            } else {
                // Handle other characters if needed (not necessary for A-Z input)
            }
        }
        return value;
    }
}
