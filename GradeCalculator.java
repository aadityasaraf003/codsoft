import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int numOfSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.println("Enter marks for Subject " + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        double averageMarks = (double) totalMarks / numOfSubjects;
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        
        char grade;
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else if (averageMarks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
