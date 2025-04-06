// public class arrays {
//     /     public static void main(String args[]){
        //         int marks[]= new int [5];     //used new keyword to allocate them in memory
        //         marks[0]=65;
        //         marks[1]=73;
        //         marks[2]=78;
        //         marks[3]=87;
        //         marks[4]=98;
        //         System.out.println(marks[4]);
        //     }
            
        // }
        
        // public class arrays{
        //     public static void main(String args[]){
        //         boolean marks[]=new boolean [3];
                
        //         System.out.println(marks[2]);   //false   //bcz of the default value it stored ,just like in case of integers its 0
        
        
        //     }
        // }
        
        // public class arrays{
        //     public static void main(String arg[]){
        //         int marks[]=new int [3];
        //         marks [0]=89;
        //         marks[1]=78;
        //         marks[2]=56;
        //         System.out.println(marks.length);   //length() ,we don't have to use () ,it is used to call a function not arrays 
        //     }   //length of an array
        // }
        
        // public class arrays{
        //     public static void main(String arg[]){
        //         int marks[]=new int [3];
        //         marks [0]=89;
        //         marks[1]=78;
        //         marks[2]=56;
        //     System.out.println(marks[0]);
        //     Arrays.sort(marks);             //Sort : means arrange the array in ascending order
        //     System.out.println(marks[0]);
        //     }
        // }
        
        // public class arrays{
        //     public static void main(String args[]){
        //         int marks[]={78,76,45,35};      //if we already know what we have to assign values we donot have to use the keyword NEW
        //        System.out.println(marks[0]);
        //     }
        // }
        
        // 
// }

// public class arrays{
//         public static void main(String args[]){
//                 int A[][]={{1,2},{3,4}};
//                 int B[][]={{5,6},{1,2}};
//                 int C[][]=new int[2][2];
//                 int product=1;
//                 for(int i=0;i<2;i++)
//                 {
//                         for(int j=0;j<2;j++)
//                         {
//                                 for(int k=0;k<2;k++)
//                                 {
//                             product= A[i][k]*B[k][j];
//                             C[i][j]=C[i][j]+product;
//                                 }
//                         }
//                 }
//                 for(int i=0;i<2;i++)
//                 {
//                         for(int j=0;j<2;j++)
//                         {
//                             System.out.println(C[i][j]);
//                         }
//                 }

//         }
// }
import java.util.Scanner;
public class arrays{
public static void main(String args[]){
   Scanner sc=new Scanner (System.in);  
   int  r1,c1,r2,c2,sum;
   System.out.println("enter number of rows 1: ");
   r1=sc.nextInt();
   System.out.println("enter number of columns 1: ");
   c1=sc.nextInt();
   System.out.println("enter number of rows 2: ");
   r2=sc.nextInt();
   System.out.println("enter number of columns 2: ");
   c2=sc.nextInt();
   int A[][]=new int[r1][c1];
   int B[][]=new int[r2][c2];
   int C[][]=new int[r1][c2];
  
  if(c1!=r2)
  {
        System.out.print("multiplication of these two matrices is not possible");
  }

  System.out.print("enter the values of first matrix: ");
  for (int i=0;i<r1;i++)
  {
        for (int j=0;j<c1;j++)
        {
                 A[i][j]=sc.nextInt();
        }
  }

System.out.print("enter the values of 2nd matrix: ");

  for (int i=0;i<r2;i++)
  {
        for (int j=0;j<c2;j++)
        {
                 B[i][j]=sc.nextInt();
        }
  }
  
  
   for (int i=0;i<r1;i++)
   {
       for( int j=0;j<c2;j++)
{
        for (int k=0;k<c1;k++)
        {
              
               
                sum=A[i][k]*B[k][j];
                C[i][j]=C[i][j]+sum;
               
             
}
}

}

for (int i=0;i<r1;i++)
{
        for (int j=0;j<c2;j++)
        {
                System.out.println(C[i][j]);
        }
}

}
}