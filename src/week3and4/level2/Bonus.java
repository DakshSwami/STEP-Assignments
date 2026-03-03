import java.util.Scanner;
class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Salary Amount: ");
        double salary = input.nextDouble();
        System.out.print("Enter Years of Service: ");
        int year = input.nextInt();
        if (year > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        }
        else
            System.out.println("No bonus.");
    }
}