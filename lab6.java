// import java.util.Scanner;
// public class lab6{
//     public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.print("enter three points: ");
// double x1=sc.nextDouble();
// double y1=sc.nextDouble();
// double x2=sc.nextDouble();
// double y2=sc.nextDouble();
// double x3=sc.nextDouble();
// double y3=sc.nextDouble();
// double a=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
// double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
// double c=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
// double d= Math.toDegrees(Math.acos(a*a-b*b-c*c));
// double e= Math.toDegrees(Math.acos(b*b-a*a-c*c));
// double f= Math.toDegrees(Math.acos(c*c-b*b-a*a));

// System.out.println("the three angles are "+Math.round(d*100)/100.0+" "+Math.round(e*100)/100.0+" "+Math.round(f*100)/100.0);
//     }
// }

// public class lab6{
//     public static void main(String args[]){
//         System.out.println("isDigit('a') is "+Character.isDigit('a'));
//         System.out.println("isLetter('a') is "+Character.isLetter('a'));
//         System.out.println("isLowerCase('a') is "+Character.isLowerCase('a'));
//         System.out.println("isUpperCase('a') is "+Character.isUpperCase('a'));
//         System.out.println("toLowerCase('T') is "+Character.toLowerCase('T'));
//         System.out.println("toUpperCase('a') is "+Character.toUpperCase('a'));

//     }
// }

// import java.util.Scanner;
// public class lab6{
//     public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter two cities: ");
// String city1=sc.nextLine();
// String city2=sc.nextLine();
// if(city1.compareTo(city2)<0)               //alphaeticallyordercomparison
// System.out.println("cities in alphabetical order are "+city1+" , "+city2);
// else
// System.out.println("cities in alphabetical order are "+city2+" , "+city1);

//     }
// }

public class lab6{
    public static void main(String args[]){
        String sentence,str1,str2,str3;
        int index;
        sentence="Now is the time for a birthday party";
        System.out.println("sentence=\""+sentence+"\"");
        System.out.println("the length of sentence is "+sentence.length());
        System.out.println("the character at index 16 is "+"sentence="+sentence.charAt(16));
        System.out.println("The index of t in sentence is "+sentence.indexOf('t'));
        System.out.println("the index of for in sentence is "+sentence.indexOf("for"));
        System.out.println("sentence.substring(7,12)=\""+sentence.substring(7,12)+"\"");
        System.out.println("sentence.substring(7,22)=\""+sentence.substring(7,22)+"\"");
        System.out.println("sentence.substring(4,10)=\""+sentence.substring(4,10)+"\"");
        str1=sentence.substring(0,8);
        System.out.println("str1=\""+str1+"\"");
        str2=sentence.substring(2,12);
        System.out.println("str2=\""+str2+"\"");
        System.out.println("sentence in uppercase is \""+sentence.toUpperCase()+"\"");
        index=sentence.indexOf("birthday");
        str1=sentence.substring(index,index+14);
        System.out.println("str1\""+str1+"\"");
System.out.println("sentence.replace('t','T')=\""+sentence.replace('t','T')+"\"");
  

    }
}
// import java.util.Scanner;
// public class lab6{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         double x1,x2,y1,y2,d;
//         x1=sc.nextDouble();
//         x2=sc.nextDouble();
//         y1=sc.nextDouble();
//         y2=sc.nextDouble();
        



//     }
// }

                           ////////////////////////TASKS         
                           
                           /////////////////////////TASK1//////////////////
//  import java.util.Scanner;                          
// public class lab6{
//     public static void main (String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("Enter point 1 for latitude and longitude in degrees: ");
// double x1=sc.nextDouble();
// double  y1=sc.nextDouble();

// System.out.println("Enter point 2 for latitude and longitude in degrees: ");
// double x2=sc.nextDouble();
// double  y2=sc.nextDouble();

// x1=Math.toRadians(x1);
// y1=Math.toRadians(y1);
// x2=Math.toRadians(x2);
// y2=Math.toRadians(y2);

// double radius=6371.01;

// double d;

// d=radius*Math.acos((Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
// System.out.println(d);

//     }
// }                           


                        ///////////////////////TASK 2////////////////////
                        
// import java.util.Scanner;
// public class lab6{
//     public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("enter a character: ");
// char c=sc.next().charAt(0);
// int asciicode=(int)c;                      //////////////////generating an asciicode
// System.out.println(asciicode);
//     }
// }   

// import java.util.Scanner;
// public class lab6{
//     public static void main(String args[]){
//     Scanner sc=new Scanner (System.in);
//      System.out.println("enter an Asciicode: ");
//     int c=sc.nextInt();
//     char character=(char)c;                        /////////an asciicode to character

//     if(character>=0 && character<=127)
//     {
//         System.out.println(character);
//     }
//     else {
//         System.out.println("invalid input!!!");
//     }
    
    // }
// }

                               /////////////////////TASK3/////////////////////
 
// import java.util.Scanner;
//  public class lab6 {
//     public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// System.out.println("enter a number :");
// int n=sc.nextInt();
// if(n>=0  &&  n<=15)
// {
//     String hex=Integer.toHexString(n);                            ///////conversion to hex
//     System.out.println(hex);
// }
// else{
//     System.out.println("invalid input");
// }
//     }
// } 


// import java.util.Scanner;                            
// public class lab6{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter a hex digit: ");
//         String h=sc.next();
//         if(h.length()==1 && isValidHex(h.charAt(0)))
//         {
//             int decimal=Integer.parseInt(h,16);

//             String binary=Integer.toBinaryString(decimal);
//             System.out.println(binary);
//         }
//         else 
//         {
//             System.out.println("invalid input");
//         }
        

//     }
//     public static boolean isValidHex(char ch) {
//         return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F');
// } 
// } 

                             ////////////////////////TASK4/////////////////

                            
// public class lab6{
//     public static void main(String args[]){
       
// int n=(int)(Math.random()*200);
// char c=(char)n;
// c=Character.toUpperCase(c);

// System.out.println(c); 


//     }
// }                             


                           //////////////////////TASK 5/////////////////////
                           
//  import java.util.Scanner;
//   public class lab6{
//     public static void main(String args[]){
// Scanner sc=new Scanner (System.in);

// String s;
// System.out.println("Enter a string: ");
// s=sc.nextLine();

// boolean isPalindrome=true;
// int length=s.length();

// for(int i=0;i<=length/2;i++)
// {
//     if(s.charAt(i)!=s.charAt(length-1-i))
//     {
//         isPalindrome=false;
//     }
    
// }
// if( isPalindrome==true)
// {
//     System.out.println(s+" is a palindrome");
// }
// else 
// {
//     System.out.println(s+" is not a palindrome");
// }


//     }
//  }                          

                         //////////////////////TASK 6////////////////////
                         

//  public class lab6{
//     public static void main(String args[]){
       
//            String s="Hello, World!";

//            String x=s.substring(0,7);

//            String y=s.substring(7,13);
//            String z;

//            z=x;
//            x=y;
//            y=z;

//            System.out.println(x+" "+y);

//     }
//  } 

                             //////////////////////TASK 7////////////////////
                             
// public class lab6{
//     public static void main(String args[]){
//         String s="florida";
    
//     int n=s.length();
//    for (int i=0;i<n;i++)
// {
//     if ( s.charAt(i)=='f')
//     {
//          System.out.print(i+"   ");
//     }
    
// }  
//     }    
// }                       

                             /////////////////////////TASK 8//////////
                             
// public class lab6{
//     public static void main(String args[]){
//         String s="in the hole in the ground there lived a rabbit";
//         int firstH=s.indexOf('h');
//         int secondH=s.lastIndexOf('h');

//         if(firstH!=secondH && firstH!=-1 && secondH!=-1)
//         {
//             System.out.print(s.substring(0,firstH)+s.substring(secondH+1));
//         }
//         else 
//         {
//             System.out.print("There is no h twice");
//         }
//     }
// }                             


                                   /////////////////////////TASK 9////////////////////
                                   
// public class lab6{
//     public static void main(String args[]){
//         String  s="in the hole in the ground there lived a rabbit";
// int firsth=s.indexOf('h');
// int secondh=s.lastIndexOf('h');
// String result="";                         /////////////////an empty string

// for(int i=0;i<s.length();i++)
// {
//    if (i>firsth && i<secondh && s.charAt(i)=='h')
//    {
//        result=result+'H';                         ////////////////////adding characters ina string
//    }
//    else 
//    {
//          result=result+s.charAt(i);
//    }
// }

// System.out.println(result);


//   }
// }        



                       ///////////////////TASK 10//////////////////////
                       
// public class lab6{
//     public static void main(String args[]){
//         String h="Hello";
//         int n=h.length();
//         String result="";
//         String result2="";
//         String result3="";
//         String result4="";
//         System.out.println(h.substring(2,3));
//         System.out.println(h.substring(1,5));
//         System.out.println(h.substring(0,5));
//         System.out.println(h.substring(0,3));
//        for(int i=0;i<n;i++)
//        {
//            if(i%2==0)
//            {
//              result=result+h.charAt(i);
//            }
          
//        }
//        System.out.println(result);

//        for(int i=0;i<n;i++)
//        {
//            if(i%2!=0)
//            {
//              result2=result2+h.charAt(i);
//            }
          
//        }
//        System.out.println(result2);

      
      
      
//        for(int i=n-1;i>=0;i--)
//        {
           
//            {
//              result3=result3+h.charAt(i);
//            }
          
//        }
//        System.out.println(result3);
//        for(int i=n-1;i>=0;i-=2)
//        {
           
//            {
//              result4=result4+h.charAt(i);
//            }
          
//        }
//        System.out.println(result4);


//         System.out.println(h.length());
//     }
// }                       
