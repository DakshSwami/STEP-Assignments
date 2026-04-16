import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to generate its table: ");
            int number = input.nextInt();
            int[] tableResults = new int[10];
            for (int i = 0; i < tableResults.length; i++) {
                tableResults[i] = number * (i + 1);
            }
            System.out.println("\nMultiplication Table for " + number + ":");
            for (int i = 0; i < tableResults.length; i++) {
                int multiplier = i + 1;
                System.out.println(number + " * " + multiplier + " = " + tableResults[i]);
            }
        }
    }
}