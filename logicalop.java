                   //LOGICAL OPERATORS

// public class logicalop{
//     public static void main(String arg[]){

//         int a=10,b=20;
//         // if(a<=50 && b<50)
    
//         System.out.println("true");
//         else 
//         System.out.println("false");
//     }
// }


// public class logicalop{
//     public static void main(String arg[]){

//         int a=10,b=20;
//         if(a<40 || b<50)
    
//         System.out.println("one of them is true");
//         else 
//         System.out.println("false");
//     }
// }

// public class logicalop{
//     public static void main(String args[]){
//         boolean isAdult=false;
//         // if (isAdult==true)
//         // if (isAdult)                 // if we donot write true it will still consider stores true in java
//         if (!isAdult)                  //!= negation sign
//         System.out.println("yes");
//         else 
//         System.out.println("no");

//     }
// }
import java.util.Scanner;
 public class logicalop{
    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
int cash;
System.out.println("how much cash you have?");
cash= sc .nextInt();
// int pen=10,book=50;

if (cash<10)
{
    System.out.println("you can't buy anything");
    System.out.println("get more cash");

}
else if (cash<60 && cash >10)
{System.out.println("you can buy one thing");}

else
{
    System.out.println("You can buy both");
}
    }
 }