import java.util.Scanner;
class StudentVotingStatus {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] studentAges = new int[10];
            System.out.println("Enter the age of 10 students:");
            for (int i = 0; i < studentAges.length; i++) {
                System.out.print("Student " + (i + 1) + ": ");
                studentAges[i] = input.nextInt();
            }
            for (int i = 0; i < studentAges.length; i++) {
                int age = studentAges[i];
                if (age < 0) {
                    System.out.println("Invalid age: " + age);
                }
                else if (age >= 18) {
                    System.out.println("The student with the age " + age + " can vote.");
                } 
                else {
                    System.out.println("The student with the age " + age + " cannot vote.");
                }
            }
        }
    }
}