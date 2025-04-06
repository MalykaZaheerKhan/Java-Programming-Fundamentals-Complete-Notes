// public class lab7{
//     static int max(int a, int b)
//     {
//         if(a>b)
//         {
//          return a;
//         }
//         else 
//         {
//             return b;
//         }
//     }
//     public static void main(String args[]){
//         int largest=max(5,4);
//         System.out.println(largest+" is the max number");
//     }
// }

// public class lab7{
//     public static void main(String args[]){

//         printgrade(70.6);
//         printgrade(60.9);
//         printgrade(98.7);
//     }
//     static void printgrade(double a)
//     {
//         if( a>=90)
//         {
//             System.out.println("Grade A");
//         }
//         else if(a>=80)
//         {System.out.println("Grade B");}
//         else if(a>=70)
//        { System.out.println("Grade C");}
//         else if(a>=60)
//        { System.out.println("Grade D");}
//         else if(a>=50)
//         {System.out.println("Grade E");}
//         else 
//        { System.out.println("Grade F");}
//     }
// }


// public class lab7{
//     public static void main(String args[]){
// int num1=7;
// int num2=9;
// System.out.println("before swapping num1 is "+num1+" and num2 is "+num2);
// swap(num1,num2);
//     }
//     static void swap(int x,int y)
//     {
//             int z;
//             z=x;
//             x=y;
//             y=z;
//             System.out.println("After swapping num1 is "+x+" and num2 is "+y);
//     }
// }


                                          //////////////////METHOD OVERLOADING

// public class lab7{
//     public static void main(String args[]){

//         System.out.println("maximum number between 3 and 5 is "+max(3,5)); 
//                        // because  we are directly printing we don't need a separate variable to store the answer 
//                        // int z=max(3,5);
//                        // then System.out.println(z);
//         System.out.println("maximum number between 5.7 and 9.8 is "+max(5.7,9.8));
//         System.out.println("maximum number between 3.0 and 5.4 and 10.14 is "+max(3.0,5.4,10.14));


//     }
//     static int max(int a,int b)
//     {
// if(a>b)
// {
//     return a;
// }
// else
//  return b;
//     }
//     static double max(double a,double b)
//     {
//         if(a>b)
//         {
//             return a;
//         }
//        else 
//        { return b;}

//     }
//     static double max( double a, double b, double c)
//     {
//         return max(max(a,b),c);
//     }
// }

                                               //////////////////RECURSIVE FUNCTION

// public class lab7{
//     public static void main(String args[]){
//        System.out.println( factorial (5));
//         System.out.println ( factorial (3));

//     }
//     static int factorial(int f)
// {
//     if(f>0)
//     {
//     return f*factorial(f-1);
//     }
//     else 
//     {
//         return 1;
//     }
// }
    
//     }
// import java.util.Scanner;
// public class lab7{
//     public static void main(String args[]){
// Scanner s=new Scanner (System.in);
// long index=s.nextLong();
//         System.out.println("the fibonnaci number at index "+index+" is "+fib(index));
//       index=s.nextLong();   
//         System.out.println("the fibonnaci number at index "+index+" is "+fib(index));
//         index=s.nextLong();
//         System.out.println("the fibonnaci number at index "+index+" is "+fib(index));

//     }
//     static long fib(long index)
//     {
//         if (index==0)
//         {
//             return 0;
//         }
//        else if (index==1)
//         {
//             return 1;
//         }
//         else 
//         {
//             return fib(index-1)+fib(index-2);
//         }

//     }
// }


                         ////////////////////TASKS////////////////////////
                         
//////////////////////TASK NUMBER 1/////////////////

// import java.util.Scanner;
// public class lab7{
//     public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("Enter a number of you wanna print the sum by splitting: ");
// long n=sc.nextLong();
// System.out.println("the sum is "+sumOfDigits(n));

// System.out.println("Enter a number of you wanna print in reverse: ");
// int no=sc.nextInt();
// reverse(no);


//     }
//     public static int sumOfDigits(long n)
//     {
//         long digit,sum=0;
//         while (n>0)
//         {
//              digit=n%10;
//              n=n/10;
//              sum=sum+digit;
            
//         }
//         return (int)sum;                        //casting
        
//     }
//     public static void reverse(int number)
//     {
//         System.out.println("the reverse of number is ");
//         {
//             int digit;
//             while(number>0)
//             {
//                 digit=number%10;
//                 number=number/10;
//                 System.out.print(digit);
//             }
//         }

//     }
// }


  ///////////////////////////TASK2//////////////////
  
// import java.util.Scanner;
//  public class lab7{
//  public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("Enter a number: ");
// int number=sc.nextInt();
// System.out.println(reverse(number));
// System.out.println(isPalindrome(number));

//  }
//  static int reverse(int n){
//  int reversed=0;
 
//   while(n>0)
  
//   {
//     int digit=n%10;
//     reversed= reversed*10+digit;
//      n=n/10;
  
//   }
//   return reversed;
//  }
 
//  static boolean isPalindrome(int n)

//  {
//            return n==reverse(n);
//  }
//  }

                              /////////////////////TASK3////////////////
 
                              
// public class lab7{
//   public static void main(String args[]){
//                         displaySortedNumbers(3.43,34.65,5.6);
//                         displaySortedNumbers(54.67,54.676,54.66);
//   }
//   static void displaySortedNumbers(double num1,double num2,double num3){

//    if(num1>num2 && num2>num3 ) 
//    {
//     System.out.println(num1+" , "+num2+" , "+num3);
//    } 
// else if (num1>num3  &&  num3>num2)
//    {
//     System.out.println(num1+" , "+num3+" , "+num2);
//    } 
//    else if  (num2>num1 && num1>num3)
//    {
//     System.out.println(num2+" , "+num1+", "+num3);
//    } 
//    else if   (num2>num3  && num3>num1)
//    {
//     System.out.println(num2+" , "+num3+" , "+num1);
//    } 
//    else if   (num3>num1  && num1>num2)
//    {
//     System.out.println(num3+" , "+num1+" , "+num2);
//    } 
//    else 
//    {
//     System.out.println(num3+" , "+num2+" , "+num1);
//    } 
  
//   }
// }                             

                                         ////////////TASK 4///////////////////
   
                                         
// public class lab7{
// public static void main(String args[]){

//   for(int i=2000;i<=2020;i++){
// int y=numberOfDaysInAYear(i);

// System.out.println("Year "+i+" has "+y+" days ");

//   }
// }
// static int numberOfDaysInAYear(int year){

//   if ( (year%4==0   &&  year%100!=0)  || ( year% 400==0) )
// {
//   return 366;
// }
// else{
//   return 365;
// }
// }

// }    


                  //////////////////////TASK 5//////////////////
                  
// import java.util.Scanner;
// public class lab7{
//   public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter a string:");
// String y=sc.nextLine();
// int x=countLetters(y);
// System.out.println("String "+y+" has "+x+" letters ");
//   }
//   static int countLetters(String s)
//   {     int z=s.length();
//         return z;
//   }
// }             


                       /////////////////TASK6//////////////////
                       
// public class lab7{
//   public static void main(String args[]){
//           String word="engineer";
//           System.out.println(capitalize(word));
//           String line="i am a software engineer";
//           String x=capitalizeline(line);
        
//           System.out.println(x);
//   }
//   static String capitalize(String lower_case_word)
//   {
//     String x=lower_case_word.substring(0,1).toUpperCase()+lower_case_word.substring(1);
//   return x;
//   }
//   static String capitalizeline(String words)
// {

//           String [] wordss=words.split(" ");                 //split line into words
//           for(int i=0;i<wordss.length;i++)
//           {
//             wordss[i]=capitalize(wordss[i]);
//             System.out.println(wordss[i]);
//           }
//           String joinLine=String.join(" ",wordss);
//           return joinLine;
// }
// }

                                  ///////////////TASK 7///////////////////////
//  import java.util.Scanner;                                 
// public class lab7{      
//   public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("Enter a number: ");
// int n=sc.nextInt();
// printMatrix(n);
//   }
//   static void printMatrix(int n)
//   {
//     for(int i=0;i<n;i++)
//     {
//       for(int j=0;j<n;j++)
//       {
//         System.out.print((int)(Math.random()*2 )+ " "); }
//        System.out.println();
//       }
//   }
// }

                                   //////////////TASK 8//////////////////
                                   
// public class lab7{
//   public static void main(String args[]){
//   vowels("i wanna be an entrepreneur");
//   }
//   static void vowels(String line)
//   {
//      String lowercase =line.toLowerCase();
//      int count=0;

//     for(int i=0;i<lowercase.length();i++)
//     {          char ch=lowercase.charAt(i);
//            if(ch=='a' ||  ch=='e'   ||   ch=='i'   ||  ch=='o'  ||   ch=='u')
//           { count++;}
          

//   }
//   System.out.println(count);
//     }
// }     

                            ///////////////////TASK 9//////////////////
                            
// public class lab7{
//   public static void main(String args[]){
//    System.out.println(power(3,4));  

//   }
//   static int power(int a, int n)
//   {
//     if (n==0)
//     {
//       return 1;
//     }
//     else {
//     return a*power(a,n-1);
//     }
// } 
// }                           

                   ////////////////////////TASK 10////////////////////
                   
public class lab7{
  public static void main(String args[]){

  }
  
}                   