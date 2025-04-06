
// import java.util.Scanner;
// public class lab8{
//     public static void main (String args[]){
// Scanner sc=new Scanner (System.in);
//  System.out.println("Enter the values of array: ");
//  int  arr[]=new int[10];
//  for(int i=0;i<10;i++)
//  {
//     arr[i]=sc.nextInt();
//  }

//  int largest=arr[0];
//  for(int i=0;i<10;i++)
//  {
//     if(arr[i]>largest)
//     {
//         largest=arr[i];
//     }
    
//  }
//  System.out.println("The largest value in the array is "+largest);

//  int largest2;
//  if(largest!=arr[0])
//  {
//     largest2=arr[0];
//  }
//  else 
//  {
//     largest2=arr[1];
//  }
//  for(int i=0;i<10;i++)
//  {
//     if(arr[i]>largest2)
//     {
//         if( arr[i]!=largest)
//         {
//             largest2=arr[i];
//         }
//     }
//  }
//  System.out.println("the 2nd largest value is "+largest2);
    
//     }
// }

// import java.util.Scanner;
// public class lab8{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int arr[]=new int[5];
//         System.out.println("Enter the values of array: ");
//         for(int i=0;i<5;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int x=sum(arr);
//         System.out.println("The sum of values in array are "+x);

//     }
//     static int sum(int array[])
     
  
//     {
//         int sum=0;
//     for(int i=0;i<array.length;i++)

//        {
//             sum=sum+array[i];
//        }
//        return sum;

//     }
  

// }

// import java.util.Scanner;
// public class lab8{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
// System.out.println("Enter the caharacters in array: ");
//         char array[]=new char[10];

// for(int i=0;i<10;i++)
// {
//      array[i]=sc.next().charAt(0);
// }

// int count=0;
//  for (int i=0;i<10;i++)
//  {
//     for (int j=0;j<10;j++)
//     {
//         if (array[i]==array[j])
//         {
//           count++;
//         }
//         System.out.println(array[i]+" occurs "+count+" times");
//         count=0;
//     }
//  }
//     }
// }

// import java.util.Scanner;
// public class lab8{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter the menu you wanna display: ");
//         System.out.println("1: For the input and display the number: ");
//         System.out.println("2: For searching elements and its location ");
//         System.out.println("3: For largest and smaallest element in an array ");
//         System.out.println(" for Copy the contents of one array into another ");
//         int a =sc.nextInt();

//        switch  (a) {
//          case 1:
//          {
//                int arr[]= new int [10];
//                arr=input (arr);
//                display(arr);
//                break;
//          }

//          case 2:
//          {
//                 int array[]=new int[10];
//                 array =input(array);
//                 search(array,26);
//                 break;
//          }
//          case 3:
//          {      int array[] =new int[10];
//           array = input(array);
//                 largest(array);
//                 smallest(array);
// break;
//          }

//          case 4:
//          {
//               int array1[]=new int[10];
//               array1=input(array1);
//               int copied[]=new int[10];
//               copy(copied,array1);
// break;
//          }
//          default :
//          {
//           System.out.println("invalid input!!!");
//          }

// }
  
       
      
// }
    
// static int[] input(int array[])
// {     Scanner sc=new Scanner (System.in);
  
//       for (int i = 0; i < 10; i++) {
//            array[i]=sc.nextInt();
      
//       }
//      return array;
// }
   

//    static void display(int array[])
//    {
    
//       System.out.println("The values in array are : ");
//       for (int i=0;i<10;i++)
    
//       {
//         System.out.println(array[i]);
//       }
//    }
     

//   static void search(int array[],int number)
//   {   int loc=99;
//       int a=1;
//  for(int i=0;i<10;i++)
//  {
//        if(array[i]==number)
//        {
//           loc=90;
//          a=i;
//        }
//  }
//  if (loc==90)
//  {
//   System.out.println("Element found at index "+a);
//  }
//    else 
//    {
//     System.out.println("Element not found");
//    }
//   }
   
//   static void largest(int array[])
//   {
//     int max=array[0];
//      {
//       for (int i=0;i<10;i++)
//       {
//         if(array[i]>max)
//         {
//           max=array[i];
//         }
//       }
//       System.out.println("maximum number in array is "+max);
//      }


//   }

//   static void smallest(int array[])
//   {
//     int min=array[0];
//      {
//       for (int i=0;i<10;i++)
//       {
//         if(array[i]<min)
//         {
//           min=array[i];
//         }
//       }
//       System.out.println("minimum number in array is "+min);
//      }


//   }


//   static void copy(int copied[],int array[])
//   {
//   for (int i=0;i<10;i++)
//  {
//     copied[i]=array[i];
//  }

//  for(int i=0;i<10;i++)
//  {
//   System.out.println("new copied array is "+copied[i]);
//  }


//   }
   


// }

