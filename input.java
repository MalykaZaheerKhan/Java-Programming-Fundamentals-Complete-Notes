// import java.util.Scanner;
// public class input 

// {
//     public static void main(String arg[]){
//         Scanner scn= new Scanner (System.in);

//         int age;
//         System.out.println("What is your age?");
    
//         age= scn .nextInt();            //we can write int,float,char,byte
//         System.out.println(age);
//     }  
// }

// import java.util.Scanner;
// public class input
// {
//     public static void main(String args[]){
//     Scanner scr=new Scanner (System.in);
//                                                              //FOR STRINGS
//      String name;
//      System.out.println("What is your name?") ;
//      name= scr .next();                                 //it will only print a word or take token /single word from a line
//      System.out.println(name);

//      scr.nextLine();                              //to consume the leftover , so it doesnot effect our next program
//      String name2;
//      System.out.println("give a compliment:");
//      name2= scr.nextLine();                 //if we donot wanna write scr.nextLine() above then just write a whole line in commas"she is a good girl"
//      System.out.println(name2);
     
// }
// }

// import java.util.Scanner;
// public class input 

// {
//     public static void main(String arg[]){
//         Scanner scn= new Scanner (System.in);

//         char alp;
//         System.out.println("type the alphabet:");
    
//         alp= scn .next().charAt(0);            //for characters
//         System.out.println(alp);
//     }  
// }

public class input{
    public static void main(String[] args) {
        int a=10;
       
       a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
    }
}