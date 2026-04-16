import java.util.Scanner;
class ZaraBonusCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double HIGH_BONUS_RATE = 0.05;
            final double LOW_BONUS_RATE = 0.02;
            final int TOTAL_EMPLOYEES = 10;
            double[] oldSalaries = new double[TOTAL_EMPLOYEES];
            double[] yearsOfService = new double[TOTAL_EMPLOYEES];
            double[] bonusAmounts = new double[TOTAL_EMPLOYEES];
            double[] newSalaries = new double[TOTAL_EMPLOYEES];
            double totalOldSalary = 0, totalNewSalary = 0, totalBonusPayout = 0;
            System.out.println("Enter details for " + TOTAL_EMPLOYEES + " employees:");
            for (int i = 0; i < oldSalaries.length; i++) {
                System.out.println("\nEmployee " + (i + 1) + ":");
                System.out.print("Enter Salary: ");
                double salaryInput = input.nextDouble();
                System.out.print("Enter Years of Service: ");
                double serviceInput = input.nextDouble();
                if (salaryInput <= 0 || serviceInput < 0) {
                    System.err.println("Invalid input. Salary must be > 0 and Service >= 0. Please re-enter.");
                    i--;
                } else {
                    oldSalaries[i] = salaryInput;
                    yearsOfService[i] = serviceInput;
                }
            }
            for (int i = 0; i < oldSalaries.length; i++) {
                double currentBonusRate = (yearsOfService[i] > 5) ? HIGH_BONUS_RATE : LOW_BONUS_RATE;
                bonusAmounts[i] = oldSalaries[i] * currentBonusRate;
                newSalaries[i] = oldSalaries[i] + bonusAmounts[i];
                totalOldSalary += oldSalaries[i];
                totalBonusPayout += bonusAmounts[i];
                totalNewSalary += newSalaries[i];
            }
            System.out.println("\n--- Zara Company Bonus Report ---");
            System.out.printf("%-15s %-15s %-15s %-15s\n", "Old Salary", "Service", "Bonus", "New Salary");
            for (int i = 0; i < oldSalaries.length; i++) {
                System.out.printf("INR %-11.2f %-15.1f INR %-11.2f INR %-11.2f\n", 
                                  oldSalaries[i], yearsOfService[i], bonusAmounts[i], newSalaries[i]);
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("Total Old Salary Payout:   INR " + totalOldSalary);
            System.out.println("Total Bonus Payout:        INR " + totalBonusPayout);
            System.out.println("Total New Salary Payout:   INR " + totalNewSalary);
        }
    }
}