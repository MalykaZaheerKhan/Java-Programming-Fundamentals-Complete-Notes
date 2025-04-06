// import java.util.Scanner;
// public class mids{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
// double num1,num2,num3;
// System.out.println("Enter three decimal numbers: ");
// num1=sc.nextDouble();
// num2=sc.nextDouble();
// num3=sc.nextDouble();
// System.out.println("the maximum number among three decimal numbers is "+(Math.max(num3,(Math.max(num1, num2)))));

//     }
// }



import java.util.Scanner;
public class mids{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       int n,fact=1;
       System.out.println("Enter a number to find factorial: ") ;
       n=sc.nextInt();
       for(int i=n;i>=1;i--)
       {
       fact=fact*i;
      
       }
       System.out.println("Factorial of the given number is "+fact);
    }
}