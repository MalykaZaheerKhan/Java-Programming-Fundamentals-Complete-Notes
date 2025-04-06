// import java.util.Scanner;
// public class lab5{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//        int number1=(int)(Math.random()*10) ;
//        int number2=(int)(Math.random()*10);
//       System.out.println("what is the addition of "+number1+" & "+number2+"?");
//       int answer=sc.nextInt();
//       while(number1+number2!=answer)
//       {
       
//         System.out.println("try again"+" what is"+ number1 +"+"+number2+"? ");
//         answer=sc.nextInt();   
//       }
//       System.out.println("you got it!!!");
//     }
// }

// import java.util.Scanner;
// public class lab5{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int limit;
//         int number;
//         int sum=0;
//         int counter=0;
//         System.out.println("enter the limit of numbers you wanna add: ");
//         limit=sc.nextInt();
//         while(counter<limit)
//         {
//             System.out.println("enter the number: ");
//             number=sc.nextInt();
//             sum=sum+number;
//             counter=counter+1;
//         }

//         System.out.println("sum="+sum);
//         System.out.println("average="+sum/counter);


//     }
// }

// import java.util.Scanner;
// public class lab5{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         final int SENTINAL=-999;
//         int number;
//         int sum=0;
//         int counter=0;
//         System.out.println("enter a number: ");
//         number=sc.nextInt();
//         while(number!=SENTINAL)
//         {
//             sum=sum+number;
//             counter=counter+1;
//             System.out.println("enter the number: ");
//             number=sc.nextInt();
//         }
//         System.out.println("sum="+sum);
//         System.out.println("average="+sum/counter);
//     }
// }

// import java.util.Scanner;
// public class lab5{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int num,guess;
//         boolean done=false;
//         num=(int)(Math.random()*100);
        
//         while(!done)
//         {
//             System.out.print("enter a number: ");
//        guess=sc.nextInt();

//             if(guess==num)
//             {
//                 System.out.println("your guess is right");
//              done=true;
//             }
//             else if(guess<num)
//             {
//                 System.out.println("your guess is lower than the number");
//             }
//             else
//             {
//                 System.out.println("your guess is greater than the number");
//             }
//         }
//     }
// }

// import java.util.Scanner;
// public class lab5{

//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//      int num,sum=0;
//      System.out.println("enter a number: ");
//      for (int i=0;i<5;i++)
//      {
//         num=sc.nextInt();
//         sum=sum+num;
//      }

//      System.out.println("sum="+sum);
//     }

//     }


// import java.util.Scanner;
// public class lab5{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int num,max;
//         System.out.println("enter a number: ");
//         num=sc.nextInt();
//         max=num;
//         do
//         {
//             System.out.println("enter a number: ");
//             num=sc.nextInt();
//             if(num>max)
            
//             { max=num; }
            
           
//         }
//         while(num!=0);
//         System.out.println("maximum number is "+max);
//     }
// }


// public class lab5{
//     public static void main(String args[]){

//         System.out.print("    ");
//        for(int i=1;i<=9;i++)

//        { System.out.print("    "+i);}

//        System.out.println();
//        System.out.print("______________________________________________________");
//         System.out.println();
//        for(int i=1;i<=9;i++)
//        {
//         System.out.print(i+"  |");
       
//         for(int j=1;j<=9;j++)
//         {
//             System.out.printf("%5d",i*j);
//         }
//         System.out.println();
//        }
//     }
// }

// public class lab5{
//     public static void main(String args[]){
//         int number=1;
//         int sum=0;
//         while(number < 20)
//         {
//             sum=sum+number;
//             number++;
//             if(sum > 100)
//             {
//                 break;
//             }
//         }
//         System.out.println("the sum is "+ sum);
//         System.out.println("the number is "+number);
        
//     }
// }

// public class lab5{
//     public static void main(String args[]){
//         int number=0;
//         int sum=0;
//         while(number < 20)
//         {
//             number++;
//             if(number == 11  ||  number==10)
//             {
//                 continue;
//             }
//             sum=sum+number;
//               //if we use number++ here, the loop will be infinite bcz continue fulfilling the condition skips the whole loop
           
//         }
//         System.out.println("the sum is "+ sum);
//         System.out.println("the number is "+number);
        
//     }
// }

                             //LAB TASKS

                                   //LABTASK 1
                                   
    //   public class lab5{
    //     public static void main(String args[]){
    //         int A=1;
    //         int B=10;
    //         while(A<=B)
    //         {
    //             System.out.println(A);
    //             A++;
    //         }
    //     }
    //   }   
    
//  import java.util.Scanner;
//  public class lab5
//  {
// public static void main(String args[]){
//     Scanner sc=new Scanner (System.in);
//     int A=sc.nextInt();
//     int B=sc.nextInt();
//    {
//     if (A<B)
//     {
//         while(A<B)
//         {
//             System.out.println(A);
//             A++;
//         }
//     }
//    } 
//    {
//     if (A>=B)
//     {
//         while(A>=B)
//         {
//             System.out.println(A);
//             A--;
//         }
//     }
//    } 
// }
//  }

// import java.util.Scanner;
// public class lab5
// {
// public static void main(String args[]){
//    Scanner sc=new Scanner (System.in);
//    int number;
//    int sum=0;
//    System.out.println("enter the limit: ");
//    int N=sc.nextInt();
//    System.out.println("enter the numbers: ");
//    for(int i=1;i<N;i++)
//    {
//    number=sc.nextInt();
//    sum=sum+number;
//    }

//   System.out.println("sum is "+sum);
   
// }
// }

// import java.util.Scanner;
// public class lab5
// {
// public static void main(String args[]){
//    Scanner sc=new Scanner (System.in);
//    int number;
//    int sum=0;
//    System.out.println("enter the limit: ");
//    int N=sc.nextInt();
//    System.out.println("enter the numbers: ");
//    for(int i=1;i<N;i++)
//    {
//    number=sc.nextInt();
//    sum=sum+(number*number);                           //for square
//    }

//   System.out.println("sum is "+sum);
   
// }
// }

                                    //LAB TASK2
// import java.util.Scanner;
// public class lab5
// {
// public static void main(String args[]){
//    Scanner sc=new Scanner (System.in);
//    int N,F=1;
//    System.out.println("Enter the number you want to find factorial: ");
//    N=sc.nextInt();
//    for(int i=N;i>=1;i--)
//    {
//     F=F*i;
//    }

//    System.out.println("the factorial of the given number is "+F);
// }
// }

                                             //LAB TASK3

//  import java.util.Scanner;
//  public class lab5{
//  public static void main(String args[]){
//     Scanner sc=new Scanner (System.in); 
//     int num,zeroes=0;
//     System.out.println("enter numbers:");
//     while(true)
//     {
//         num=sc.nextInt();
//         if (num==0)
//         {
//             zeroes=zeroes+1;
//         }
//         if(num<0)
//         {
//             break;
//         }

//     }
//                System.out.println("the number of zeroes in the given numbers are "+zeroes);

//  }                                           
// }
                                    //LAB TASK4

// import java.util.Scanner;
//  public class lab5{
//  public static void main(String args[]){
//     Scanner sc=new Scanner (System.in); 
//     int num,length=0;
//     System.out.println("enter numbers:");
//         while(true)
//         {
//             num=sc.nextInt();
//             if (num==0)
//             {
//                 break;
//             }
//           length=length+1;
    
//         }
//                    System.out.println("the length of the sequence is  "+length);
//  }
// }

                                             //LAB TASK 5

//  import java.util.Scanner;
//  public class lab5{
//  public static void main(String args[]){
//     Scanner sc=new Scanner (System.in); 
//     int num;
//     System.out.println("enter the value of num: ");
//     num=sc.nextInt();
//     int max=num;
//         System.out.println("enter numbers:");
//             while(true)
//             {
//                 num=sc.nextInt();
//                 if (num==0)
//                 {
//                     break;
//                 }
//               if(num>max)
//               {
//                 max=num;
//               }
        
//             }
//                        System.out.println("the maximum number of the sequence is  "+max);
//  }
// }
                                  
                                             //LAB TASK 6

// import java.util.Scanner;
//  public class lab5{
//  public static void main(String args[]){
//     Scanner sc=new Scanner (System.in); 
//     int num;
//     int index,count=0;
//     System.out.println("enter the value of num: ");
//     num=sc.nextInt();
//     int max=num;
//     index=1;                              //question
//         System.out.println("enter numbers:");
//             while(true)
//             {
//                 num=sc.nextInt();
               
//                 if (num==0)
//                 {
//                     break;
//                 }

//                 count=count+1;
//               if(num>max)
//               {
//                 max=num;
//                 index=count;
//               }
        
//             }
//                        System.out.println("the maximum number of the sequence is  "+max+" & its index is "+index);
//  }
// }

                                                 //LAB TASK 7

// import java.util.Scanner;
//  public class lab5{
//  public static void main(String args[]){
//     Scanner sc=new Scanner (System.in); 
//     int num,count=0;  
//   System.out.println("enter numbers:");
//  while(true)
//  {       
//  num=sc.nextInt();
// if (num==1)
// {
//     break;
//     }
//   if(num%2==0)
//   {
   
//     count=count+1;
//       }
            
//    }
//   System.out.println("the numer of even numbers in the sequence  is  "+count);
//  }
// }
                                              //LAB TASK 8

    
// import java.util.Scanner;
//  public class lab5{
//  public static void main(String args[]){
//     Scanner sc=new Scanner (System.in); 
//     int prevnum,currentnum,count=0;  
//   System.out.println("enter first number:");
//   prevnum=sc.nextInt();
//  while(true)
//  {     
//     currentnum=sc.nextInt();
//       if (currentnum==0)
//     {        
//         break;
//         }     


//   if(currentnum>prevnum)
//   {
   
//     count=count+1;

//       }
//  prevnum=currentnum;
            
//    }
//   System.out.println("the number of integers greater than the previous number are  "+count);
//  }
// }

                                        //LAB TASK 9

//   import java.util.Scanner;
//   public class lab5{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         char ch='y';
//         int num;
      


//         while(ch=='y')
//         {
//             System.out.println("which one you wanna print?");
//             num=sc.nextInt();

//       if(num==1)
//        { for (int j=1;j<=4;j++)
//                {
//                for (int i=1;i<=10;i++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();  
//     }
  
//        }





// if(num==2)
//    { for (int i=1;i<=5;i++)
//     {
//     for (int j=1;j<=i;j++)
// {
//  System.out.print("*");
// }
// System.out.println();

//     }
//    }






//    if(num==3)
//    { for (int i=1;i<=5;i++)
//     {

//        for(int c=4;c>=i;c--)
//         {
//         System.out.print(" ");
//         }
    

   
//      for (int j=1;j<=i;j++)
// {
//  System.out.print("*");
// }
// System.out.println( );
//     }


//     }
   
   


// if(num==4)
//    { for (int i=1;i<=5;i++)
//     {

//        for(int c=4;c>=i;c--)
//         {
//         System.out.print(" ");
//         }
    

//     for (int j=1;j<=2*i-1;j++)
// {
//  System.out.print("*");
// }
// System.out.println();

//     }
   
//    }



   

// // {
// //      for (int i=1;i<=5;i++)
// //     {

// //        for(int c=4;c>=i;c--)
// //         {
// //         System.out.print(" ");
// //         }
    

// //     for (int j=1;j<=(2*i-1);j=j++)
// // {
// //  System.out.print(i);
// // }
// //      System.out.println();

// //     }
// // }



// if(num==5)
// {
//  {
//         for (int i = 1; i <= 5; i++) {  // Outer loop for the rows
            
//             // Print spaces to align the numbers
//             for (int c = 5; c > i; c--) {
//                 System.out.print(" ");
//             }

//             // Print the number 'i', 2*i-1 times to form the pyramid shape
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print(i);  // Print 'i' for all occurrences in the row
//             }

//             // Move to the next line after printing each row
//             System.out.println();
        

//         }
//     }
// }




        
// System.out.println("do you want to execute the loop again?");
// System.out.println("enter y otherwise n");
//    ch=sc.next().charAt(0);


//   }
// }
//   }


                                                          //LAB TASK 10
                                                          
  
                                                          
import java.util.Scanner;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the year and the first day of the year
        System.out.print("Enter the year (e.g., 2023): ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year (0 = Sunday, 1 = Monday, ..., 6 = Saturday): ");
        int firstDay = sc.nextInt();

        // Array for the number of days in each month
        int[] daysInMonth = {
            31,  // January
            isLeapYear(year) ? 29 : 28,  // February
            31,  // March
            30,  // April
            31,  // May
            30,  // June
            31,  // July
            31,  // August
            30,  // September
            31,  // October
            30,  // November
            31   // December
        };

        // Array for month names
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };

        // Loop through each month
        for (int month = 0; month < 12; month++) {
            System.out.printf("\n%s %d\n", monthNames[month], year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print leading spaces for the first week
            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }

            // Print the days of the month
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%3d ", day);
                firstDay++; // Move to the next day

                // If it's Saturday, move to the next line
                if (firstDay > 6) {
                    firstDay = 0; // Reset to Sunday
                    System.out.println();
                }
            }
            System.out.println(); // New line after each month
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4,
        // but not divisible by 100 unless it is also divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
