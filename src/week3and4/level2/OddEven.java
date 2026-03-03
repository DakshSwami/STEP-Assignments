import java.util.Scanner;
class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Not a Narutal Number.");
            return;
        }
        else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even.");
                else
                    System.out.println(i + " is Odd.");
            }
        }
    }
}