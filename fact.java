import java.util.Scanner;

public class Factorial {

    // Recursive function to calculate the factorial
    static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }
}
