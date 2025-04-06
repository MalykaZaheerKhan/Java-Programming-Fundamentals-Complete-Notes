                 //TRY - CATCH in EXCEPTION HANDLING
//after exception handling , the computer doesnot read the other lines of code , so to make this
// happen we use try & catch


// public class exception_handling {
//     public static void main(String args[]){
// int marks[]={34,24,65};
// try {
//     System.out.println(marks[5]);           //try running the code and handle if it has any exception
// } 
// catch (Exception e) { 
//     System.out.println("programming");            //do something with exception after catching
// }

// System.out.println("I'm a software engineer");

//     }
// }


// import java.util.Scanner;
// public class exception_handling{
//     public static void main (String args[]){
// Scanner sc=new Scanner (System.in);
//      int c;
//     do
//     {
//     System.out.println("Enter first number: ");
//     int a=sc.nextInt();
//     System.out.println("Enter second number: ");
//     int b=sc.nextInt();
//     System.out.println("Enter the operation you wanna perform: 1:Addition, 2:Subtraction, 3:Multiplication, 4:Division ");
//      c=sc.nextInt();
    


//     try {
//         switch (c)

//         {
//            case 1:
//            {
//             System.out.println(a+b);
//             break;
//            }
//            case 2:
//            {
//             System.out.println(a-b);
//             break;
//            }
//            case 3:
//            {
//             System.out.println(a*b);
//             break;
//            }
//            case 4:
//            {
//             System.out.println(a/b);
//             break;
//            }
//            case 5:
//            {
//             break;
//            }
//            default:
//            {
//             System.out.println("Invalid!!!!");
           
//            }
//         }
        
//     } catch (ArithmeticException e) {
//         System.out.println("You divided it by zero");
//         System.out.println("Try Again!!!");

//     }

//     }   while(c!=5);

//     }
// }

// import java.util.Scanner;
// public class exception_handling{
//     public static void main(String args[]){
//       Scanner sc=new Scanner (System.in);
//       int f=1; 
//  int n;
//       while(true){
//       try {
//         System.out.println("Enter a number you want to find factorial: ");
//          n=sc.nextInt();
//           if(n<0)
//           {
//             continue;
//           }
//           {
//             for(int i=1;i<=n;i++)
//             {
//              f=f*i;
//             }
//             System.out.println("Fcatorial of the number is "+f);
//             break;
//        }
//       } 
//       catch (Exception e) {
//         System.out.println("You have entered an invalid input!!! Try Again!!!");
//         sc.nextInt();
//       } 
    
    
//     }

// }
// }

                                //CORRECTED VERSION
// import java.util.Scanner;
// public class excpetion_handling{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner (System.in);
       
//        while(true) 
//        { try {
//             System.out.println("Enter a number you want to find Factorial: ");
//             int n=sc.nextInt();
//             if(n>=0)
//             {      int f=1;
//                 for(int i=1;i<=n;i++)
//                 {
//                    f=f*i;
                   
//                 }
//                 System.out.println("Factorial of a given number is "+f);
//                 break;
//             }
           
             
//         } catch (Exception e) {
//             System.out.println("You have entered an inavlid input , Try again!!!");
//             sc.nextLine();
         
//         }
//     }

//     }
// }

// import java.util.Scanner;
// import java.util.InputMismatchException;
// public class exception_handling{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//   while(true){
//     try {
//          System.out.println("Enter a number you want to find Factorial: ");
//          int n=sc.nextInt();
//          System.out.println("Fcatorial of the given number is "+factorial(n));
//          break;
//     }
//      catch (InputMismatchException e) {
//         System.out.println("you have entered an invalid input, Try again!!!");
//          sc.nextLine();
//     }
   
// }
    
//   } 
//   static int factorial(int n)
//     {
//         int f=1;
//         for(int i=1;i<=n;i++)
//         {
//             f=f*i;
//         }
//         return f;
//     } 
// }

// import java.util.InputMismatchException;
// import java.util.Scanner;
// public class exception_handling{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int choice=1;
//      while(choice==1) 
//      {
//          try{ 
//             int arr[]={1,2,3,4,5,6,7,8,9,0};
//         System.out.println("Number you want to find;");
//         int n=sc.nextInt();
//         System.out.println("guess the index: ");
//         int index=sc.nextInt();
//         if(arr[index]==n)
//         {
//             System.out.println("Congratulation!!! you won");
          
//         }
//         else 
//         {
//             System.out.println("invalid input!!! Do you want to continue? press 1 for yes and 0 for no");
//             choice=sc.nextInt();
//             if(choice==0)
// {
//     break;
// }
//         }  
      
//     }

// catch(ArrayIndexOutOfBoundsException e)
// {
//        System.out.println("You have entered an invalid index, Try Again!!!");
//        sc.nextLine();
// }
// catch(InputMismatchException c)
// {
//     System.out.println("You have entered an invalid input, Try Again!!!");
//     sc.nextLine();
// }
//      }

//     }
// }

// import java.util.InputMismatchException;
// import java.util.Scanner;
// public class exception_handling{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         try{
//             int arr[]={1,0,3,4,5};  
//             try{
//                 int x=arr[3]/arr[1]; 
//             }
           
//             catch(ArithmeticException e){
//                    System.out.println("You divided by zero");
//                 //    sc.nextLine();
//             }
//             arr[5]=2;
//         }
//             catch(ArrayIndexOutOfBoundsException c)
//             {
//                 System.out.println("array index is out of bounds");
//                 // sc.nextLine();
//             }
        
//     }
// }
                 //////////////////////////////////////////////////////////////////

// import java.util.Scanner;
// public class excpetion_handling{
//     public static void main (String args[]){
//         Scanner s=new Scanner (System.in);
       
//      int c;
//         do { 
//              try{
//             System.out.println("Enter the first number: ");
//             int a=s.nextInt();
//             System.out.println("Enter the second number: ");
//             int b=s.nextInt();
//             System.out.println("Enter the number of operation you wanna perform: ");
//             System.out.println("1_Addition     2_Subtraction     3_Multipication       4_Division");
//              c=s.nextInt();

//             switch (c)
//             {
//                 case 1:
//                 {
//                     System.out.println("a+b= "+(a+b));
//                     break;
//                 }
//                 case 2:
//                 {
//                     System.out.println("a-b= "+(a-b));
//                     break;
//                 }
//                 case 3:
//                 {
//                     System.out.println("a*b= "+(a*b));
//                     break;
//                 }
//                 case 4:
//                 {
//                     System.out.println("a/b= "+(a/b));
//                     break;
//                 }
//                 case 5:
//                 {
//                     break;
//                 }
//                 default:
//                 {
//                     System.out.println("invalid case");
//                     break;
//                 }
//             }
//         }  
        

//         catch(Exception e){
//             System.out.println("try again .....you divided by zero");
//             System.out.println("enter the case number again:");
//             c=s.nextInt();
//         }
//     }
//         while(c!=5);
         
//     }
// }

// import java.util.Scanner;
//       public class exception_handling{
//         public static void main(String args[]){
//             Scanner s=new Scanner (System.in);
//             int c;
//      while(true){
       
//             try{      
//          int f=1;
    
//     System.out.println("Enter a number you want to find factorial: ");
//      c=s.nextInt();
//    { for(int i=1;i<=c;i++)
//     {
//         f=f*i;
//     }
//     System.out.println("factorial of given number is: "+f);
//     break;
// }


//         }
//         catch(Exception e)
//         {
//             System.out.println("you entered a wrong value .....plz enter an integer again: ");
//             s.nextLine();
//             c=s.nextInt();
//         }
       
//     }
//     }
// }

// import java.util.InputMismatchException;
// import java.util.Scanner;
// public class exception_handling{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         int arr[]={2,7,8,9,45,6,3,9,5,6};
//          while (true) { 
//              try{
//             System.out.println("Enter the number you wnat to find: ");
//             int n=s.nextInt();
              
//             System.out.println("Enter the index on which you wnat to find: ");
//             int index=s.nextInt();

//             if(arr[index]==n)
// {
//             System.out.println("YOU WON");
//             break;
// }
//             else{
//                 System.out.println("YOU LOST");

//             }
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("index is out of bound");
//             s.nextLine();
//         }
//         catch(InputMismatchException ex)
//         {
//             System.out.println("invlaid number to find ");
//             s.nextLine();
//         }
//          }   
//     }   
// }

// public class exception_handling{
//     public static void main(String args[])
//     {    try{
//         int arr[]={1,2,0,4,5};
//         try
//         {
           
//              System.out.println(arr[1]/arr[2]);
//         }
//         catch(Exception e)
//         {
//             System.out.println("you divided by zero");
//         }
//          arr[5]=8;
//     }
//     catch(Exception ex)
//     {
//         System.out.println("index out of bound");
//     }
//     }
// }


// import java.util.Scanner;
// public class exception_handling{
//     public static void main(String[] args) {
//      Scanner s=new Scanner (System.in);
//      while (true)
//      {
//         try
//         {
//             System.out.println("Enter two number you want to find sum:");
//             System.out.println("Enter the first integer");
//             int a=s.nextInt();
//             System.out.println("Enter the second integer");
//             int b=s.nextInt();
//             System.out.println("sum of two integers is "+(a+b));
//             break;

//         }
//         catch(Exception e)
//         {
//             System.out.println("you have entered awrong input.......Try Again");
//             s.nextLine();
//         }
//      }   
//     }
// }

import java.util.InputMismatchException;
import java.util.Scanner;
public class exception_handling{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        while (true) { 
           try
           {
            int arr[]=new int[10];
            System.out.println("Enter the values in array");
           { for (int i=0;i<10;i++)
            {
                arr[i]=s.nextInt();

            }
          
        }      try{
            System.out.println("Enter the index on which you ant to display the array value:");
            int index=s.nextInt();
            System.out.println(arr[index]);
            break;
        }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                  System.out.println("array index is out of limit.....try again");
                  s.nextLine();
            }
           } 
           catch(InputMismatchException e)
           {
                System.out.println("you have entered a wrong input....try again");
                s.nextLine();
           }
         
        }
    }
}

