import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        // Handle cases for n = 1 and n = 2 separately
        if (n >= 1) {
            System.out.print(first + " ");  // Print the first term
        }
        if (n >= 2) {
            System.out.print(second + " "); // Print the second term
        }
        
        // Generate and print the rest of the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int next = first + second;  // Calculate the next Fibonacci number
            System.out.print(next + " "); // Print the next term
            first = second;  // Update first and second terms for next iteration
            second = next;
        }
        
        // Close the scanner
        scanner.close();
    }
}

