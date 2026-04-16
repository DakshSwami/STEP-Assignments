import java.util.Scanner;
class HandshakeApp {
    public int calculateMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            HandshakeApp app = new HandshakeApp();
            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();
            if (numberOfStudents < 0) {
                System.err.println("Invalid input. Number of students cannot be negative.");
            } else {
                int totalHandshakes = app.calculateMaxHandshakes(numberOfStudents);
                System.out.println("The maximum number of possible handshakes among " + 
                                   numberOfStudents + " students is: " + totalHandshakes);
            }
        }
    }
}