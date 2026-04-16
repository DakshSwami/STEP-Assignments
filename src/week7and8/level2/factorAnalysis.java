import java.util.Scanner;
class FactorAnalysis {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double calculateSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to find its factors: ");
            int number = input.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
            int[] factors = findFactors(number);
            System.out.print("Factors: ");
            for (int f : factors) System.out.print(f + " ");
            System.out.println("\nSum of Factors: " + calculateSum(factors));
            System.out.println("Product of Factors: " + calculateProduct(factors));
            System.out.println("Sum of Square of Factors: " + calculateSumOfSquares(factors));
        }
    }
}