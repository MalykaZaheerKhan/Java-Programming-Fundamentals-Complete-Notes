
// import java.util.Scanner;
// public class lab9{
//     public static void main (String args[]){
// Scanner sc=new Scanner (System.in);
// int array[][]=new int [3][4];
// System.out.println("Enter the values in array: ");
// for(int i=0;i<3;i++)
// {      System.out.println("Enter elements of row "+(i+1)+" :");
//     for (int j=0;j<4;j++)
//     {
//         array[i][j]=sc.nextInt();
//     }
// }

// for(int i=0;i<3;i++)
// {  int sum=0;
//     for (int j=0;j<4;j++)
//     {
//         sum=sum+array[i][j];
//     }
//     System.out.println("sum of 1st row is "+sum);
// }
//     }
// }

// import java.util.Scanner;
// public class lab9{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int array[][]=new int [3][4];
//         System.out.println("Enter the values in array: ");
//         for(int i=0;i<3;i++)
//         {      System.out.println("Enter elements of row "+(i+1)+" :");
//             for (int j=0;j<4;j++)
//             {
//                 array[i][j]=sc.nextInt();
//             }
//         }  int n=0;
//         System.out.println("The prime values in array are ");
//         for(int i=0;i<3;i++)
//         {     
//             for (int j=0;j<4;j++)
//             {   if   (  isPrime(array[i][j])==true);
//             {System.out.println(array[i][j]);
//                 n=n+1;}
                    
//             }
//         } 
//         System.out.println("Total prime numbers are "+n);
//     }

//     static boolean isPrime(int n)
//     { boolean prime=true;
//         for(int i=2;i<=n/2;i++)
//         {
//             if(n%i==0)
//             {
//                 prime=false;
//                 break;
//             }
            

//         }
//         return prime;
//         }
// }


// import java.util.Scanner;
// public class lab9{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int matrix1[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//         System.out.println("The original matrix is: ");
//         for(int i=0;i<4;i++)
//         {
//             for(int j=0;j<3;j++)
//             {
//                 System.out.print(matrix1[i][j]+"  ");
//             }
//             System.out.println();
//         }

//         int matrix2[][]=new int [3][4];
//         matrix2=transpose(matrix1);
// System.out.println("The transpose of a matrix is ");
// for(int i=0;i<3;i++)
// {
//     for(int j=0;j<4;j++)
//     {
//         System.out.print(matrix2[i][j]+"  ");
//     }
//     System.out.println();
// }
//     }

// static int[][] transpose(int matrix[][]){
//     int trans[][]=new int[3][4];

//   for (int i=0;i<3;i++)
//   {
//     for(int j=0;j<4;j++)
//     {
//         trans[i][j]=matrix[j][i];
//     }

//   }
//   return trans;
// }


// }


// import java.util.Scanner;
// public class lab9{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner (System.in);
//     }
// }


//////////////////////////LAB TASK 1

// import java.util.Scanner;

// public class lab9 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[][] array = new int[3][4];

//         System.out.println("Enter the elements of the 3x4 array:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print("Enter element at [" + i + "][" + j + "]: ");
//                 array[i][j] = scanner.nextInt();
//             }
//         }

//         int maxRowSum = Integer.MIN_VALUE;
//         int maxRowIndex = -1;
//         int maxColSum = Integer.MIN_VALUE;
//         int maxColIndex = -1;

//         for (int i = 0; i < 3; i++) {
//             int rowSum = 0;
//             for (int j = 0; j < 4; j++) {
//                 rowSum += array[i][j];
//             }
//             if (rowSum > maxRowSum) {
//                 maxRowSum = rowSum;
//                 maxRowIndex = i;
//             }
//         }

//         for (int j = 0; j < 4; j++) {
//             int colSum = 0;
//             for (int i = 0; i < 3; i++) {
//                 colSum += array[i][j];
//             }
//             if (colSum > maxColSum) {
//                 maxColSum = colSum;
//                 maxColIndex = j;
//             }
//         }

//         System.out.println("Row with the maximum sum is: Row " + (maxRowIndex + 1) + " (Sum = " + maxRowSum + ")");
//         System.out.println("Column with the maximum sum is: Column " + (maxColIndex + 1) + " (Sum = " + maxColSum + ")");

//         scanner.close();
//     }
// }


// ///////////////////////////LAB TASK 2

import java.util.Scanner;

public class MaxPrimeRowCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][4];

        System.out.println("Enter the elements of the 3x4 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int maxRowPrimes = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        int maxColPrimes = Integer.MIN_VALUE;
        int maxColIndex = -1;

        for (int i = 0; i < 3; i++) {
            int rowPrimeCount = 0;
            for (int j = 0; j < 4; j++) {
                if (isPrime(array[i][j])) {
                    rowPrimeCount++;
                }
            }
            if (rowPrimeCount > maxRowPrimes) {
                maxRowPrimes = rowPrimeCount;
                maxRowIndex = i;
            }
        }

        for (int j = 0; j < 4; j++) {
            int colPrimeCount = 0;
            for (int i = 0; i < 3; i++) {
                if (isPrime(array[i][j])) {
                    colPrimeCount++;
                }
            }
            if (colPrimeCount > maxColPrimes) {
                maxColPrimes = colPrimeCount;
                maxColIndex = j;
            }
        }

        if (maxRowPrimes >= maxColPrimes) {
            System.out.println("Row with the maximum number of primes is: Row " + (maxRowIndex + 1) + " (Primes = " + maxRowPrimes + ")");
        } else {
            System.out.println("Column with the maximum number of primes is: Column " + (maxColIndex + 1) + " (Primes = " + maxColPrimes + ")");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
