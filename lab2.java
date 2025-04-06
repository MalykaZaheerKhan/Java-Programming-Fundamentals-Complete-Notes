
import java.util.Scanner;

public class lab2 {
   public static void main(String args[]){
    Scanner keyboard = new Scanner (System.in);   //FOR INPUT ,CREATE A SCANNER OBJECT TO READ FROM THE KEYBO
    
    int hours;
    double payrate,total;
   
    System.out.println("Hours=");
    hours= keyboard.nextInt();
    
    System.out.println("Pay rate:");
     payrate= keyboard.nextDouble();
   
     total=hours*payrate;
    System.out.println("Total="+total);
   }
}