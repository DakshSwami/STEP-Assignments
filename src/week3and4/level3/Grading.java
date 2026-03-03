import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks of 3 subjects: ");
        Character grade;
        int phy = input.nextInt();
        int chem = input.nextInt();
        int math = input.nextInt();
        double percentage = (phy + chem + math) / 3;
        if (percentage >= 80)
            grade = 'A';
        else if (percentage >= 70)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 50)
            grade = 'D';
        else if (percentage >= 40)
            grade = 'E';
        else
            grade = 'R';
        System.out.println("The Average marks are: " + percentage + " and the Grade is: " + grade);
    }
}