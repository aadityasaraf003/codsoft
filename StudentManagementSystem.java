import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class StudentManagementSystem {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        if (numStudents < MAX_STUDENTS) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            System.out.print("Enter student grade: ");
            String grade = scanner.next();

            students[numStudents++] = new Student(name, age, grade);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Cannot add more students. Maximum limit reached.");
        }
    }

    private static void viewStudents() {
        if (numStudents == 0) {
            System.out.println("No students added yet.");
        } else {
            System.out.println("List of students:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Name: " + students[i].getName() + ", Age: " + students[i].getAge() + ", Grade: " + students[i].getGrade());
            }
        }
    }
}
