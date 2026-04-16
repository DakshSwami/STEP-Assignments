import java.util.Scanner;
class AthleteTrackApp {
    public double computeRoundsFor5Km(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistanceNeeded = 5000.0;
        if (perimeter <= 0) return 0;        
        return totalDistanceNeeded / perimeter;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            AthleteTrackApp app = new AthleteTrackApp();
            System.out.println("Enter the lengths of the triangular park's three sides (in meters):");
            System.out.print("Side 1: ");
            double side1 = input.nextDouble();
            System.out.print("Side 2: ");
            double side2 = input.nextDouble();
            System.out.print("Side 3: ");
            double side3 = input.nextDouble();
            double totalRounds = app.computeRoundsFor5Km(side1, side2, side3);
            System.out.println("To complete a 5 km run, the athlete must complete " + 
                               Math.round(totalRounds * 100.0) / 100.0 + " rounds.");
        }
    }
}