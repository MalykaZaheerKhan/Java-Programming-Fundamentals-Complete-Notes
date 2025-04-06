// public class labb3 {
//    public static void main(String args[]) {
// double distance,mass;
// distance=1.49579E11;
// mass=1.989E30;
// System.out.println("The sun is "+distance+" away");
// System.out.println("The sun's mass is "+mass+" kilomgram");

//    }  }

// public class labb3{
//     public static void main(String args[]){
//         double regularwages;
//         double basepay=25;
//         double regularhours=40;
//         double overtimewages;
//         double overtimepay=37.5;
//         double overtimehours=10;
//         double totalwages;
//         regularwages=basepay*regularhours;
//         overtimewages=overtimepay*overtimehours;
//         totalwages=regularwages+overtimewages;
//         System.out.println("wages for thid week are $"+ totalwages);
//     }
// }

// public class labb3{
//     public static void main(String arg[]){
// double monthlypay=6000.0;
// double contribution;

// contribution= monthlypay*0.05;
// System.out.println("5 percent is $"+contribution+ "per month");
// contribution= monthlypay*0.08;
// System.out.println("8 percent is $"+contribution+" per month");
// contribution= monthlypay*0.10;
// System.out.println("10 percent is $"+contribution+" per month");
//     }
// }

// public class labb3{
//         public static void main(String arg[]){
// double num1=127.899;
// double num2=3456.148;
// double num3=3.776;
// double num4=264.821;
// double num5=88.081;
// double num6=1799.999;
// System.out.printf("%8.1f\n",num1);
// System.out.printf("%8.2f\n",num2);
// System.out.printf("%8.1f\n",num3);
// System.out.printf("%8.2f\n",num4);
// System.out.printf("%8.1f\n",num5);
// System.out.printf("%8.2f\n",num6);
//         }
//     }

// import java.util.Scanner;
// public class labb3{
//             public static void main(String arg[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("Enter purchase amount:");
// double purchaseamount= sc.nextDouble();
// double tax= purchaseamount*0.06;
// System.out.println("Sales tax is $ "+(int)(tax*100)); 

//             }
//         }

                               //lab task 1 

// import java.util.Scanner;

// public class labb3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double cur;
//         System.out.print("Enter the amount in dollars: ");
//         cur = sc.nextDouble();
        
//         // Step 1: Convert dollars to cents
//         int cents = (int) Math.round(cur * 100);  // Convert to cents
        
//         // Step 2: Calculate the number of dollars
//         int dollars = cents / 100;
//         cents = cents % 100;  // Remaining cents
        
//         // Step 3: Calculate the number of quarters
//         int quarters = cents / 25;
//         cents = cents % 25;  // Remaining cents
        
//         // Step 4: Calculate the number of dimes
//         int dimes = cents / 10;
//         cents = cents % 10;  // Remaining cents
        
//         // Step 5: Calculate the number of nickels
//         int nickels = cents / 5;
//         cents = cents % 5;  // Remaining cents
        
//         // Step 6: Remaining cents are the pennies
//         int pennies = cents;  // Remaining cents
        
//         // Display results
//         System.out.println("Your amount consists of:");
//         System.out.println(dollars + " dollars");
//         System.out.println(quarters + " quarters");
//         System.out.println(dimes + " dimes");
//         System.out.println(nickels + " nickels");
//         System.out.println(pennies + " pennies");
//     }
// }
//output
// Enter the amount in dollars: 11.56
// Your amount consists of:
// 11 dollars
// 2 quarters
// 0 dimes
// 1 nickels
// 1 pennies



                                //lab task 2
// import java.util.Scanner;
// public class labb3{
//     public static void main(String args[]){
//         Scanner s= new Scanner (System.in);
//         int N,K,R,D;
//         System.out.println("enter the number of students: ");
//         N=s.nextInt();
//         System.out.println("enter the number of apples: ");
//         K=s.nextInt();
//         D=K/N;
//         System.out.println("total apples each student got  "+D);
//         R=K%N;
//         System.out.println("remaining apples are "+R);
        
//     }
// }

                              //lab task 3

// import java.util.Scanner;
// public class labb3{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int a,b,c,d;
//         System.out.println("the number of students in class A are ");
//         a=sc.nextInt();
//         System.out.println("the number of students in class B are ");
//         b=sc.nextInt();
//         System.out.println("the number of students in class C are ");
//         c=sc.nextInt();
//         d=(a+b+c)/2;

//         System.out.println("if two students sit on a desk , the amount of deska to purchase are "+d);
        

//     }
// }                       

                                //lab task 4
// import java.util.Scanner;
// public class labb3{
//     public static void main(String args[]){
//         Scanner s= new Scanner (System.in);
// int N,H,M;
// System.out.println("enter total number of minutes have passed: ");
// N= s.nextInt();

// M=N%60;
// H=N/60;
// System.out.println("how many minutes have passed :"+H);

// System.out.println("how many hours have passed :"+M);
// System.out.println(H+":"+M);
//     }
// }
                       //lab task5
   
                       
//  import java.util.Scanner;
//  public class labb3{
//     public static void main(String args[]){
//         Scanner s=new Scanner (System.in);
//        double m;
//         System.out.println("total amount of milk produced: ");
//         m=s.nextDouble();
//        double n=m/3.78;
//        System.out.println("number of milk cartons required to hold the milk: "+(int)Math.round(n));
//       double a=m*0.38;
//        System.out.println("cost of producing milk is $"+a);
//        double b=n*0.27;
//        System.out.println("the profit for producing milk is $"+b);
//     }
//  }                     
//                              //task 6

// import java.util.Scanner;

// public class labb3 {
//     public static void main(String[] args) {
//         // Create a Scanner object for user input
//         Scanner sc = new Scanner(System.in);

//         // Prompt user for pay rate and hours worked
//         System.out.print("Enter the pay rate per hour: ");
//         double payRate = sc.nextDouble();

//         System.out.print("Enter the number of hours worked each week: ");
//         double hoursWorkedPerWeek = sc.nextDouble();

//         // Constants
//         final int WEEKS = 5; // Total weeks worked
//         final double TAX_RATE = 0.14; // Tax rate
//         final double CLOTHING_EXPENSE_RATE = 0.10; // Expense for clothes
//         final double SCHOOL_SUPPLIES_EXPENSE_RATE = 0.01; // Expense for school supplies
//         final double SAVINGS_BONDS_EXPENSE_RATE = 0.25; // Expense for savings bonds
//         final double PARENT_SAVINGS_BOND_RATE = 0.50; // Parents' contribution to savings bonds

//         // a. Calculate income before and after taxes
//         double totalIncomeBeforeTax = payRate * hoursWorkedPerWeek * WEEKS;
//         double taxAmount = totalIncomeBeforeTax * TAX_RATE;
//         double totalIncomeAfterTax = totalIncomeBeforeTax - taxAmount;

//         // b. Calculate money spent on clothes and accessories
//         double clothingExpenses = totalIncomeAfterTax * CLOTHING_EXPENSE_RATE;

//         // c. Calculate money spent on school supplies
//         double schoolSuppliesExpenses = totalIncomeAfterTax * SCHOOL_SUPPLIES_EXPENSE_RATE;

//         // d. Calculate money spent on savings bonds
//         double remainingAfterExpenses = totalIncomeAfterTax - clothingExpenses - schoolSuppliesExpenses;
//         double savingsBondsExpenses = remainingAfterExpenses * SAVINGS_BONDS_EXPENSE_RATE;

//         // e. Calculate money parents spend on additional savings bonds
//         double parentsSavingsBondsContribution = savingsBondsExpenses * PARENT_SAVINGS_BOND_RATE;

//         // Output the results
//         System.out.printf("Your income before taxes: $%.2f\n", totalIncomeBeforeTax);
//         System.out.printf("Your income after taxes: $%.2f\n", totalIncomeAfterTax);
//         System.out.printf("Money spent on clothes and accessories: $%.2f\n", clothingExpenses);
//         System.out.printf("Money spent on school supplies: $%.2f\n", schoolSuppliesExpenses);
//         System.out.printf("Money spent to buy savings bonds: $%.2f\n", savingsBondsExpenses);
//         System.out.printf("Money your parents spend to buy additional savings bonds for you: $%.2f\n", parentsSavingsBondsContribution);
        
        
//     }
// }



                           //task 7
// import java.util.Scanner;
//                            public class labb3{
//    public static void main(String args[]){
//       Scanner sc= new Scanner (System.in);
// int A=20;
// int B=15;
// int C=10;
// int D=5;
// System.out.println("how many tickets are sold of class A?");
// int ticketsA=sc.nextInt();
// System.out.println("how many tickets are sold of class B?");
// int ticketsB=sc.nextInt();
// System.out.println("how many tickets are sold of class C?");
// int ticketsC=sc.nextInt();
// System.out.println("how many tickets are sold of class D?");
// int ticketsD=sc.nextInt();

// int incomeA=ticketsA*A;
// int incomeB=ticketsB*B;
// int incomeC=ticketsC*C;
// int incomeD=ticketsD*D;
// int total= incomeA+incomeB+incomeC+incomeD;

// System.out.println("income generated from tickets sales of class A= $"+incomeA);
// System.out.println("income generated from tickets sales of class B= $"+incomeB);
// System.out.println("income generated from tickets sales of class C= $"+incomeC);
// System.out.println("income generated from tickets sales of class D= $"+incomeD);
// System.out.println("income generated from total tickets sales = $"+total);

//    }
// }                           



                           
                           //task 8
// public class labb3{
//    public static void main(String args[]){
//       int a=(int)(Math.random()*1000);
//       System.out.println("a="+a);
//       int b=a/100;
//       int  c=a%100;
//       int d=c/10;
//       int e=c%10;
//      int f=b+d+e;
//       System.out.println("sum="+f);

//    }
// }                           


//                                    //task 9
// public class labb3{
//    public static void main(String args[]){
//       double x = 75.3987;
// double y = 982.89764;
// System.out.printf("%.2f%n",x);
// System.out.printf("%.2f%n",y);
// System.out.printf("%.3f%n",x);
// System.out.printf("%.3f%n",y);

//    }
// }                                   
                                //   task 10
// public class labb3{
//    public static void main(String args[]){
//       int degree = 30;
//       double radian=Math.toRadians(degree);
//       double sin=Math.sin(radian);
//       double cos=Math.cos(radian);
//       double tan=Math.tan(radian);
//       System.out.printf("%.4f%n",radian);
//       System.out.printf("%.4f%n",sin);
//       System.out.printf("%.4f%n",cos);
//       System.out.printf("%.4f%n",tan);

//       degree = 60;
//       radian=Math.toRadians(degree);
//      sin=Math.sin(radian);
//        cos=Math.cos(radian);
//       tan=Math.tan(radian);
//       System.out.printf("%.4f%n",radian);
//       System.out.printf("%.4f%n",sin);
//       System.out.printf("%.4f%n",cos);
//       System.out.printf("%.4f%n",tan);
//    }
// }                                  