// public class lab3 {
//     public static void main(String args[]){
// int num1=4,num2;
// double sale;
// char first;
// System.out.println("num1="+num1);
// num2=4*5-11;
// System.out.println("num2="+num2);
// sale=0.02*1000;
// System.out.println("sale="+sale);
// first='D';
// System.out.println("first="+first);
//     }   
// }

// import java.util.Scanner;
// public class lab3{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
// int feet,inches;
// double weight,height;
// System.out.println("enter value of inches:");
// inches=sc.nextInt();
// System.out.println("inches="+inches+"inches");
// System.out.println("enter value of feet:");
// feet=sc.nextInt();
// System.out.println("feet="+feet+"feet");
// System.out.println("enter value of height:");
// height=sc.nextDouble();
// System.out.println("weight="+height+"m");
// System.out.println("enter value of weight:");
// weight=sc.nextDouble();
// System.out.println("weight="+weight+"N");
//     }
// }
// import java.util.Scanner;
// public class lab3{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String firstname,lastname;
//         int age;
//         double weight;
//         System.out.println("enter first name:");
//         firstname=sc.next();
//         System.out.println("enter last name:");
//         lastname=sc.next();
//         System.out.println("enter age:");
//         age=sc.nextInt();
//         System.out.println("Enter weight:");
//         weight=sc.nextDouble();
//         System.out.println(firstname+" "+lastname+" "+" , "+"age="+age+" , "+"weight="+weight);
//     }
// }
// public class lab3{
//     public static void main(String args[]){
//         char alpha1,alpha2;
//         alpha1=65;
//         alpha2=66;
//         System.out.println("number1="+alpha1);
//         System.out.println("number2="+alpha2);
//     }
// }

// import java.util.Scanner;
// public class lab3{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         double radius,area;
//         System.out.println("enter value of radius:");
//         radius=s.nextDouble();
//          final double PI=3.14;                  //it's a constant value now
//          area= radius*radius*PI;
//          System.out.println("area="+area+"m");
//     }   
// }

                                        //TASKS

//   public class lab3{
// public static void main(String args[]){
// int num1,num2,num3,average;
// num1=125;
// num2=28;
// num3=-25;
// average=(num1+num2+num3)/3;
// System.out.println("num1="+num1);
// System.out.println("num2="+num2);
// System.out.println("num3="+num3);
// System.out.println("average="+average);
// }
//   }                                      

// import java.util.Scanner;
// public class lab3{
//     public static void main(String args[]){
// Scanner s=new Scanner(System.in);
// int length,width;
// System.out.println("enter the width:");
// length=s.nextInt();
// System.out.println("enter the length:");
// width=s.nextInt();
// System.out.println("length="+length+" , "+"width="+width);
// int area= length*width;
// int perimeter=2*(length+width);
// System.out.println("area of rectangle="+area);
// System.out.println("perimeter of rectangle="+perimeter);
//     }
// }

// import java.util.Scanner;
// public class lab3{
//     public static void main(String args[]){
//         Scanner c=new Scanner (System.in);
//         final int SECRET=11;
//         final double RATE=12.50;
//         int num1,num2,newNum;
//         String name;
//         double wages,hoursWorked;
//         System.out.println("enter first integer:");
//         num1=c.nextInt();
//         System.out.println("enter second integer:");
//         num2=c.nextInt();
//         System.out.println("the value of num1 is "+num1+" and The value of num2 is "+num2);
//          newNum=(num1*2)+num2;
//          System.out.println("newNum="+newNum);
//         newNum=newNum+SECRET;
//         System.out.println("The new value of newNum after adding 11 is "+newNum);
//         System.out.println("Enter first name:");
//         name=c.next();
//         System.out.println("enter a value between 0 to 70:");
//         hoursWorked=c.nextDouble();
//         System.out.println("calculate wages:");
//         wages=RATE*hoursWorked;
//         System.out.println("Name= "+name);
//         System.out.println("Pay Rate= $"+RATE);
//         System.out.println("Hours Worked= "+hoursWorked);
//         System.out.println("Salary= $"+wages);
       
//     }
// }
public class lab3 {
    public static void main(String[] args) {
        Car h=new Car();
        h.input();
        h.display();
    }
}
import java.util.Scanner;
 class Car{
    private String model;
    private String color;
    private int price;
    void input()
    {
        Scanner s=new Scanner(System.in);
        model=s.next();
        color=s.next();
        price=s.nextInt();
        s.close();
    }
    void display(){
        System.out.println(model+" "+color+" "+price);
    }
}