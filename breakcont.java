// import java.util.Scanner;
// public class breakcont{
//     public static void main(String args[]){
//        Scanner sc=new Scanner (System.in);
//         int i=0,n;
//         System.out.println("enter the limit: ");
//         n=sc.nextInt();

//         while (true) { 
//             System.out.println(i);
//             i++;
//             if(i>n)
//             {
//                 break;
//             }
//         }
//     }
// }

import java.util.Scanner;
public class breakcont{
    public static void main(String args[]){
       Scanner sc=new Scanner (System.in);
        int i=0,n;
        System.out.println("enter the limit: ");
        n=sc.nextInt();

        while (true) {            //due to continue it goes back here i=4;
            if(i==3)
            {
                i++;
                continue;          //when continue keyword active it will skip the next statements and start the loop again
            }
            System.out.println(i);
            i++;
            if(i>n)
            {
                break;
            }
        }
    }
}