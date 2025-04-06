
//import java.util.Scanner;

// import java.util.Scanner;
// public class lab4 {
//     public static void main(String args[]){
//        Scanner sc=new Scanner (System.in); 
//        System.out.println("Enter a year: ");
//        int year= sc.nextInt();
//        boolean isLeapYear=(year%4==0 && year%100!=0)  || (year%400==0);
//     // boolean isLeapYear=(year%4==0 && year%100!=0 && year%400!=0);
//        System.out.println(year+" is a leap year?"+ isLeapYear);
//     }
// }
// import java.util.Scanner;
// public class lab4{
//     public static void main(String arags[]){
//         Scanner sc= new Scanner (System.in);
// System.out.println("Enter an integer: ");
// int x=sc.nextInt();
// if (x%5==0)
// {
//     System.out.println("HI FIVE!!!");  
// }
// if(x%2==0)
// {
//     System.out.println("HI EVEN!!!");
// }
//     }
// }

// import java.util.Scanner;
// public class lab4{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         double wages,hours,rate;
//         System.out.println("Enter the working "+"hours:");
//         hours=sc.nextDouble();
//         System.out.println("Enter the pay "+"rate: ");
//         rate=sc.nextDouble();
//         if(hours>40.0)
//         {
//             // wages=40.0*rate+1.5*rate*(hours-40.0);
//             //or
//             // wages=hours*rate+1.5*rate;

//         }
//         else
//         {wages=hours*rate;}
//         System.out.printf("the wages are $%.2f%n", wages);
//         // System.out.println( wages);
//     }
// }
// import java.util.Scanner;
// public class lab4{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int marks;
//         System.out.println("Enter marks: ");
//         marks=sc.nextInt();
//         if(marks>=90)
//         {
//             System.out.println("GRADE A");
//         }
//        else if(marks>=80)
//         {
//             System.out.println("GRADE B");
//         }
//         else if(marks>=70)
//         {
//             System.out.println("GRADE C");
//         }
//         else if(marks>=60)
//         {
//             System.out.println("GRADE D");
//         }
//         else
//         {
//             System.out.println("GRADE F");
//         }

//     }
// }
// // import java.util.Scanner;
// // public class lab4{
// //     public static void main(String args[]){
// //         Scanner sc=new Scanner (System.in);

// //         int number;
// //         System.out.println("enter a number:");
// //         number=sc.nextInt();

// //         switch (number)
// //         {
// //             case 1:
// //             {
// //                 System.out.println("you entered 1");
// //                 break;
// //             }
// //             case 2:
// //             {
// //                 System.out.println("you entered 2");
// //                 break;
// //             }
// //             case 3:
// //             {
// //                 System.out.println("you entered 3");
// //                 break;
// //             }
// //             case 4:
// //             {
// //                 System.out.println("you entered 4");
// //                 break;
// //             }
// //             case 5:
// //             {
// //                 System.out.println("you entered 5");
// //                 break;
// //             }
// //             default:
// //             {
// //                 System.out.println("you entered nothing");
                
// //             }

// //         }


// //     }
// // }

//                                     //LAB TASK 1
 
// public class lab4{
//     public static void main(String args[]){
//         int x=10;
//         int y=15;
//         int z=20;
//         boolean a=!(x>10);
//         System.out.println("the above expression is "+a);

//         boolean b=(x<=5)  || (y>15);
//         System.out.println("the above expression is "+b);

//         boolean c=(x!=15)  || (y!=z);
//         System.out.println("the above expression is "+c);

//         boolean d=(x>=z)   ||   (x+y>=z);
//         System.out.println("the above expression is "+d);

//         boolean e=(x<=y-2)   &&   (y>=z)   ||       (z-2!=20);
//         System.out.println("the above expression is "+e);


//     }
// }                                  

                                         //LAB TASK 2

public class lab4{
    public static void main(String args[]){
int x=3;
int y=4;
int z=7;
int w=1;
System.out.println("x == y: " + (x == y ));
System.out.println("x != z: " + (x != z ));
System.out.println("y == z – 3: " + (y == z-3) );
System.out.println("!(z > w): " + ! (z > w));
System.out.println("x + y < z: " + (x + y < z));

    }
}

                                  //LAB TASK 3

// public class lab4{
//     public static void main(String args[]){
//         boolean b1=true;
//         boolean b2=false;
//        boolean b3=(b1==b2);
//        System.out.println("b3="+b3);
//     }
// }

                                             //LAB TASK 4
//  import java.util.Scanner; 
// public class lab4{
//     public static void main(String args[]){
//         Scanner sc= new Scanner (System.in);
//         int x,y,z;
        // System.out.println("enter the first integer x=");
        // x=sc.nextInt();
        // System.out.println("enter the second integer y=");
        // y=sc.nextInt();
        // System.out.println("enter the third integer z=");
        // z=sc.nextInt();
//         System.out.println("smallest between x & y is "+ (Math.min(x,y)));

//         if(x>0)
//         {
//             System.out.println("1");
//         }
//         else if(x<0)
//         {
//             System.out.println("-1");
//         }
//         else
//         {
//             System.out.println("0");
//         }



//         System.out.println("smallest among x,y & z is "+ (Math.min(z,(Math.min(x,y)))));          //FOR THREE MIN VALUES
//     }
// }    

                                  //LAB TASK 5

//   import java.util.Scanner;
  
//     public class lab4{
//         public static void main(String args[]){
//             Scanner sc=new Scanner (System.in);
//             int x,y,z;
//             System.out.println("enter the first integer x=");
//             x=sc.nextInt();
//             System.out.println("enter the second integer y=");
//             y=sc.nextInt();
//             System.out.println("enter the third integer z=");
//             z=sc.nextInt();

//             if ((x==y) && (y==z)  && (z==x))
//             {
//                 System.out.println("3: all are same");
//             }
//             else if ((x==y)  || (y==z)   ||   (z==x))
//             {
//                 System.out.println("2: two are sam ewhile third is different");
//             }
//             else 
//             {
//                 System.out.println("0: all are different");
//             }     
        
//     }
//   }   

                             //LAB TASK 6

// import java.util.Scanner;
//  public class lab4{
//         public static void main(String args[]){
//            Scanner sc=new Scanner (System.in);
//            int num;
//            System.out.println("enter a number in te range of 1-10: ");
//            num=sc.nextInt();
// if (num==1)
// System.out.println("I");
// else if (num==2)
// System.out.println("II");
// else if (num==3)
// System.out.println("III");
// else if (num==4)
// System.out.println("IV");
// else if (num==5)
// System.out.println("V");
// else if (num==6)
// System.out.println("VI");
// else if (num==7)
// System.out.println("VII");
// else if (num==8)
// System.out.println("VIII");
// else if (num==9)
// System.out.println("IX");
// else if (num==10)
// System.out.println("X");
// else
// System.out.println("error!");
//         }
// }      

                                                           //LAB TASK 7

// import java.util.Scanner;
// public class lab4{
//         public static void main(String args[]){
//                 Scanner sc=new Scanner (System.in);
//            int l1,l2,w1,w2,a1,a2;
//            System.out.println("enter the length of rectangle 1 : ");
//            l1= sc.nextInt();
//            System.out.println("enter the width of rectangle 1 : ");
//            w1= sc.nextInt();
//            a1=l1*w1;
//            System.out.println("area of rectangle 1 is "+a1);
//            System.out.println("enter the length of rectangle 2: ");
//            l2= sc.nextInt();
//            System.out.println("enter the width of rectangle 2 : ");
//            w2= sc.nextInt();
//            a2=l2*w2;
//            System.out.println("area of rectangle 2 is : "+a2);
          
//            if (a1>a2)
//           { System.out.println("area of rectangle 1 is greater than rectangle 2");}
//            else if (a1<a2)
//            {System.out.println("area of rectangle 2 is greater than rectangle 1");}
//            else 

//             {System.out.println("both areas are same");}
//                 }
// }               

                                               //LAB TASK 8

//    import java.util.Scanner;
//    public class lab4{
//         public static void main(String args[]){
//                 Scanner sc=new Scanner (System.in);
//                 int date,month,year;
//                 System.out.println("enter month: ");
//                 month=sc.nextInt();
//                 System.out.println("enter date: ");
//                 date=sc.nextInt();
//                 System.out.println("enter year: ");
//                 year=sc.nextInt();
//                 if(month*date==year)
//                 {
//                         System.out.println("Date "+month+"/"+date+"/"+year+" is Magical.......");
//                 }
//                 else 
//                 {
//                         System.out.println("Date "+month+"/"+date+"/"+year+" is not Magical.......");  
//                 }
//         }

//    }   

                                                            //LAB TASK 9

//    import java.util.Scanner;
//   public class lab4{
//  public static void main(String args[]){
//  Scanner sc=new Scanner (System.in); 

// int pennies,nickles,dimes,quarters;
// double dollars=1.00;
// System.out.println("Enter the number of pennies: ");
// pennies=sc.nextInt();
// System.out.println("Enter the number of nickles: ");
// nickles=sc.nextInt();
// System.out.println("Enter the number of dimes: ");
// dimes=sc.nextInt();
// System.out.println("Enter the number of quarters: ");
// quarters=sc.nextInt();

// double total=((pennies*0.01)+(nickles*0.05)+(dimes*0.1)+(quarters*0.25));

// if (total==dollars )
// {
//         System.out.println("Congratulations on winning the game!!!");

// }
// else  if (total>dollars)
// {
//         System.out.println("the amount entered was more than one dollar");
// }
// else 
// {
//         System.out.println("the amount entered was less than one dollar");
// }

//  }
// }                                                           

//                                                             //LAB TASK 10

// // import java.util.Scanner;
// // public class lab4{
// //         public static void main(String args[]){
// //         Scanner sc=new Scanner (System.in);
// //         int num;
// //         System.out.println("No. of books a customer has purchased: ");
// // //         num=sc.nextInt();
// //         if(num==0)
// //         {
// //                 System.out.println("points="+0);
// //         }
// //         if(num==1)
// //         {
// //                 System.out.println("points="+5);
// //         }
// //         if(num==2)
// //         {
// //                 System.out.println("points="+15);
// //         }
// //         if(num==3)
// //         {
// //                 System.out.println("points="+30);
// //         }
// //         if(num==4)
// //         {
// //                 System.out.println("points="+60);
// //         }
// //         }
// // }                                                       

