import java.util.Scanner;
class SimpleInterestCalculator {
public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            SimpleInterestCalculator calculator = new SimpleInterestCalculator();
            System.out.print("Enter the Principal amount: ");
            double principal = input.nextDouble();
            System.out.print("Enter the Rate of Interest: ");
            double rate = input.nextDouble();
            System.out.print("Enter the Time (in years): ");
            double time = input.nextDouble();
            double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);
            System.out.println("The Simple Interest is " + simpleInterest + 
                               " for Principal " + principal + 
                               ", Rate of Interest " + rate + 
                               " and Time " + time);
        }
    }
}