import java.util.Scanner;
class AthleteRounds {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Side 1 (meters): ");
            double side1 = input.nextDouble();
            System.out.print("Enter Side 2 (meters): ");
            double side2 = input.nextDouble();
            System.out.print("Enter Side 3 (meters): ");
            double side3 = input.nextDouble();
            double perimeter = side1 + side2 + side3;
            double totalDistanceMeters = 5000;
            double rounds = totalDistanceMeters / perimeter;
            System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        }
    }
}