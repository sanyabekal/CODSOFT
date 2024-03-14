import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int totalSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            if(marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
                System.exit(1);
            }
            totalMarks += marks;

        }

        int totalPossible= 100*totalSubjects;
        System.out.println("total marks obtained "+totalMarks+" out of "+totalPossible);
        double perc=((double)totalMarks/totalPossible)*100;
        System.out.println("percentage obtained "+ perc+"%");

        char grade;
        if (perc >= 90) {
            grade = 'A';
        } else if (perc >= 80) {
            grade = 'B';
        } else if (perc>= 70) {
            grade = 'C';
        } else if (perc >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
