import java.util.Scanner;
class FrequencyOfDigits {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            long number = input.nextLong();
            if (number < 0) {
                number = Math.abs(number);
            }
            long temp = number;
            int count = (number == 0) ? 1 : 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
            int[] digits = new int[count];
            temp = number;
            for (int i = 0; i < digits.length; i++) {
                digits[i] = (int) (temp % 10);
                temp /= 10;
            }
            int[] frequency = new int[10];
            for (int i = 0; i < digits.length; i++) {
                int digitValue = digits[i];
                frequency[digitValue]++;
            }
            System.out.println("\nDigit Frequency Analysis:");
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
                }
            }
        }
    }
}