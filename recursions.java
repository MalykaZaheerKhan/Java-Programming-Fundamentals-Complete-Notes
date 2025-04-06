
//     public static void main(String args[]){
// int x=factorial(0);
// System.out.println("factorial of the number is: "+x)
// ;    }
//     static int factorial(int n){
//           if(n>1)  { 
//             return n*factorial(n-1);}

//           else
//           {
//             return 1;
//           }

//     }
// }

// public class recursions{
//     public static void main(String args[]){
//         int n1=0,n2=1,n3;
//         // System.out.print(n1+" "+n2);
//         for(int i=0;i<10;i++)
//         {
//             System.out.print(" "+n1);
//             n3=n1+n2;
//             // System.out.print(" "+n3);
//             n1=n2;
//             n2=n3;
//         }
//     }
// }

// public class recursion{
//     public static void main(String args[]){
//           fibonacci(10);
//     }
//     static int fibonacci(int n){
//         if (n==0)
//         {
//             return 0;
//         }
//         else if (n==1){
//             return 1;
//         }
//         else 
//         {
//                return fibonacci (n-1)+fibonacci(n-2);
//         }
//     }
// }




// public class recursions{
//     public static void main(String args[]){
//         for(int n=0;n<10;n++)
//         { System.out.println("The number at index "+n+" in fibonacci sequence is "+fib(n));}
//     }

//     static int fib(int index){
//         if(index==0)
//         {
//             return 0;
//         }
//         else if (index==1)
//         {
//             return 1;
//         }
//         else 
//         {
//             return fib(index-2)+fib(index-1);
//         }
//     }
// }

public class recursions{
    public static void main(String args[]){

print(8);

    }  
    static void print(int n)
    {
        if(n>0)
        {
            print(n-1);
            System.out.println(n);
        }
       
        }
       
    }


// public class recursions{
//     public static void main(String args[]){

// print(7);

//     }  
//     static void print(int n)
//     {
//         if(n>0)
//         {
//             System.out.println(n);
//             print(n-1);
            
//         }
       
//     }
// }


// public class recursions{
//     public static void main(String args[]){
// num(15);
//     }
//     static void num(int n)
//     {

//         if(n>=0){

//           num(n-1);
//           if(n%2==0){
//           System.out.println(n);
//           }
//         }
//     }
// }


// public class recursions {

    
//     public static int fibonacci(int n) {
//         if (n==0)
//         {
//             return 0;
//         }
//         else if(n==1)
//         {
//             return 1;
//         }
//         else 
//         {
//             return fibonacci(n-1)+fibonacci(n-2);
//         }
//     }

//     public static void main(String[] args) {
//         int terms = 10; 

//         System.out.println("Fibonacci Series up to " + terms + " terms:");
//         for (int i = 0; i < terms; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }
// }

