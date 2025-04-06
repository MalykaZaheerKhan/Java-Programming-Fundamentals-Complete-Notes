//////////////////////////LAB TASK 1

// import java.util.Scanner;

// public class StudentMaxMarks {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int rollNumber;
//         String name, topStudent = "";
//         int marks, maxMarks = Integer.MIN_VALUE;

//         while (true) {
//             System.out.print("Enter roll number (0 to stop): ");
//             rollNumber = scanner.nextInt();
//             if (rollNumber == 0) {
//                 break;
//             }
//             scanner.nextLine(); // Consume newline
//             System.out.print("Enter name: ");
//             name = scanner.nextLine();
//             System.out.print("Enter marks: ");
//             marks = scanner.nextInt();

//             if (marks > maxMarks) {
//                 maxMarks = marks;
//                 topStudent = "Roll Number: " + rollNumber + ", Name: " + name;
//             }
//         }

//         System.out.println("Student with maximum marks: " + topStudent);
//         scanner.close();
//     }
// }

/////////////////////////////////LAB TASK 2

import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int marks;

    Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentMaxMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.print("Enter roll number (0 to stop): ");
            int rollNumber = scanner.nextInt();
            if (rollNumber == 0) {
                break;
            }
            scanner.nextLine(); // Consume newline
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            students[count++] = new Student(rollNumber, name, marks);
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (students[i].marks < students[j].marks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("Students sorted by marks in descending order:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }

        scanner.close();
    }
}
