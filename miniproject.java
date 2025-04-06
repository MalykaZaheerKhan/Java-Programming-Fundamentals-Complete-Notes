import java.util.Scanner;
public class miniproject {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber;
       
        do{
            System.out.println("enter your number:");
            usernumber=sc.nextInt();
            if (usernumber==mynumber)
            {
                System.out.println("CORRECT ANSWER!!!");
           break;
            }
            else if(usernumber>mynumber)
            {
                System.out.println("YOUR NUMBER IS TOO GREATER");
            }
            else
            {
                System.out.println("YOUR NUMBER IS TOO SMALLER");
            }
        }
        while(usernumber>=0);
        System.out.println("My number was:");
        System.out.println(mynumber);
    }
    }
  
