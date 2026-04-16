import java.util.Scanner;
class NumberAnalysis {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[5];
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }
            for (int i = 0; i < numbers.length; i++) {
                int currentNum = numbers[i];
                if (currentNum > 0) {
                    if (currentNum % 2 == 0) {
                        System.out.println(currentNum + " is positive and even.");
                    } else {
                        System.out.println(currentNum + " is positive and odd.");
                    }
                } else if (currentNum < 0) {
                    System.out.println(currentNum + " is negative.");
                } else {
                    System.out.println(currentNum + " is zero.");
                }
            }
            int firstElement = numbers[0];
            int lastElement = numbers[numbers.length - 1];
            System.out.print("\nComparison: ");
            if (firstElement == lastElement) {
                System.out.println("First and last elements are equal.");
            } else if (firstElement > lastElement) {
                System.out.println("First element is greater than the last element.");
            } else {
                System.out.println("First element is less than the last element.");
            }
        }
    }
}