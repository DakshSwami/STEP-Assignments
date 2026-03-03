import java.util.Scanner;
class Divisibilty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 != 0)
            System.out.println("Is the number " + number + " divisible by 5? No.");
        else
            System.out.println("Is the number " + number + " divisible by 5? Yes.");
        input.close();
    }
}