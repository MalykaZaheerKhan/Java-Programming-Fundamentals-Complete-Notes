///////////////////////LAB TASK 1
// import java.util.Scanner;

// public class InputSumWithExceptionHandling {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int num1 = 0, num2 = 0;
//         boolean validInput = false;

//         while (!validInput) {
//             try {
//                 System.out.print("Enter the first integer: ");
//                 num1 = Integer.parseInt(scanner.nextLine());
//                 System.out.print("Enter the second integer: ");
//                 num2 = Integer.parseInt(scanner.nextLine());
//                 validInput = true;
//             } catch (NumberFormatException e) {
//                 System.out.println("You have entered an invalid input, type integers only.");
//             }
//         }

//         System.out.println("The sum of the two integers is: " + (num1 + num2));
//         scanner.close();
//     }
// }

////////////////////////////LAB TASK 2

import java.util.Scanner;

public class ArrayIndexExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter integer at index " + i + ": ");
                    array[i] = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("You have entered an invalid input, type integers only.");
                    scanner.next();
                }
            }
        }
        System.out.print("Enter an index to retrieve the value: ");
        try {
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + array[index]);
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("You have entered an invalid index, it must be between 0 and 9.");
            } else {
                System.out.println("You have entered an invalid input, type an integer index only.");
            }
            scanner.next();
        }

        scanner.close();
    }
}

