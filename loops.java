// public class loops {
//     public static void main(String args[]){

//         for(int i=1;i<=100;i++)
//         {
//             System.out.println(i);

//         }
//     }
// }
// // public class loops {
// //     public static void main(String args[]){

// //         for(int i=100;i>=1;i--)
// //         {
// //             System.out.println(i);
            
// //         }
// //     }
// // }

// import java.util.Scanner;
// public class loops{
//     public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// int n;

// for(int i=0;i>=0;) {
//     System.out.println("enter a number:");
// n= sc.nextInt();
//     if(n<0)
//     {
//         System.out.println("THE END!!!");
    
//     }
//     else 
//     {
//         System.out.println(n);
//         break;
//     }
    
// }   

// }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//        int number=0;
//          do
//           {
//             System.out.println("enter a number:");
//             number=sc.nextInt();
//             System.out.println("here is your number:"+number);
    

//         }
//         while(number>=0);
//         System.out.println("THE END");
//     }
// }
// import java.util.Scanner;
// public class loops{
// public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// int n;
// int loc=99;
// System.out.println("Enter a number:  ");
// n=sc.nextInt();

// for(int i=2;i<n;i++)
// {
//     if(n%i==0)
//     {
//         loc=98;
       
//     }
// }
// if (loc==99)
// {
//     System.out.println("It is a prime number");
// }
//     else 
//     System.out.println("It is not a prime number");

// }
// }

// public class loops{
//     public static void main(String args[]){
//         for (int a=1;a<=5;a++)
//         {
//             for (int c=5;c>a;c--)
//             {
//                 System.out.print(" ");
//             }
//             for (int b=1;b<=(2*a-1);b++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

public class loops{
    public static void main(String args[]){
        for (int a=1;a<=5;a++)
        {
            for (int c=5;c>a;c--)
            {
                System.out.print(" ");
            }
            for (int b=1;b<=(2*a-1);b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a=1;a<=5;a++)
        {
            for (int c=1;c<=a;c++)
            {
                System.out.print(" ");
            }
            for (int b=7;b>=(2*a-1);b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}