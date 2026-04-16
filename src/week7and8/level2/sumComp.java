import java.util.Scanner;
class NaturalSumComparison {
    public static int sumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number (n): ");
            int n = input.nextInt();
            if (n <= 0) {
                System.err.println("Invalid input. Natural numbers must be greater than 0.");
                System.exit(0);
            }
            int recursiveResult = sumRecursive(n);
            int formulaResult = sumFormula(n);
            System.out.println("Sum using Recursion: " + recursiveResult);
            System.out.println("Sum using Formula: " + formulaResult);
            if (recursiveResult == formulaResult) {
                System.out.println("Result: Both computations are correct and match!");
            } else {
                System.out.println("Result: Mismatch found.");
            }
        }
    }
}