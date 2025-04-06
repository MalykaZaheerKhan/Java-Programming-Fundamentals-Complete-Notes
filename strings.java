


// public class strings {
//     public static void main(String args[]){
//       String name= "malyka";
//       System.out.println(name.length());   //number of letters....  .length()

//     }
//     }

// public class strings{
//    public static void main(String args[]){
//     //strings' type:
//     // 1- concatenate (join two strings)
//     String name1= "malyka";
//     String name2="khan";
//     String name3= name1 +" "+ name2;
//     System.out.println(name3); //malyka khan(output)
//    }
// }

// public class strings{
//  public static void main(String args[]){
//     //strings' type
//     //2-charAt(to tell which alphabet is at the given position)
//     String name="HaniaKhan";
//     System.out.println(name.charAt(5));  //K
//  }
// }

// public class strings{
//     public static void main(String args[]){
//        //strings' type
//        //replace (replace the char with another char in the given string) name.replace('old char','new char');
//        String name="Malika";
//        String name2=name.replace('i','y');
//        System.out.println(name2);  //K
//     }
//    }

// public class strings{
//     public static void main(String args[]){
//         //strings' type
//         //3_substring (return a small part from a string)
//         String name="password is software";
//         System.out.println(name.substring(12,20));
//     }
// }

public class strings{
     public static void main(String args[]){
         
          String name="hania";
          System.out.println(name.toUpperCase()); 
//           System.out.println(name.length());

//           System.out.println(name.toUpperCase());

//           System.out.println(name.toLowerCase());

//     String lc=name.toLowerCase();
//     System.out.println(lc);

//     String uc=name.toUpperCase();
//     System.out.println(uc);

//     int n=name.length();
//     System.out.println(n);

//     String nontrim="    hani  khan  ";
//     System.out.println(nontrim.trim());

     //     String city="Sahiwal";

     //     System.out.println(city.substring(3));
     //     System.out.println(city.substring(5));
     //     System.out.println(city.substring(0));

     //     System.out.println(city.substring(2,6));
     //     System.out.println(city.substring(1,7));


          String boy="harry";
         
          // System.out.println(boy.replace('r','p'));
          
          // System.out.println(boy.replace("r","ier")); //want to replace char with string put both in string format
        
          // System.out.println(boy.replace("rry","ppiness"));               //can replavce old chars with new and more chars
         
          // System.out.println(boy.replace("rry","ppi"));


// System.out.println(boy.startsWith("har"));
// System.out.println(boy.startsWith("hay"));

// System.out.println(boy.endsWith("rri"));
// System.out.println(boy.endsWith("rry"));


// System.out.println(boy.charAt(3));
// System.out.println(boy.charAt(4));               //if you write index out of limit it will give error
    
String count="Pensylvinnia";
String girl="hanianiania";

// System.out.println(count.indexOf("vin"));                   //give the start of index of string , can be used for both char and string
// System.out.println(count.indexOf('a'));

//System.out.println(count.indexOf('n',5));     //give the index of n , starts from the given index and ignore the beore all characters of a string

// System.out.println(count.lastIndexOf("vin"));
// System.out.println(girl.lastIndexOf("nia",7));            //index is a limit , tell me in this limit where the given string or character is lastly present
// System.out.println(girl.lastIndexOf("nia"));
// System.out.println(girl.lastIndexOf("nia",4));
// System.out.println(girl.lastIndexOf("nia",1));    //bcz that's not present in this index limit


// System.out.println(girl.equals("hania"));
// System.out.println(girl.equals("hanianiania"));
// System.out.println(girl.equals("Hanianiania"));                    //case Sensitivity
// System.out.println(girl.equalsIgnoreCase("Hanianiania"));       //ignores the case sensitivity


                                     //escape sequence characters

      System.out.println("what is the name of the girl\""+girl+"\"");     
      
      System.out.println("what is the name of the girl\'"+girl+"\'"); 
      
      System.out.println("what is the name of the girl\\"+girl+"\\"); 
      
      System.out.println("what is the name of the girl\n"+girl+"\n"); 
      
      System.out.println("what is the name of the girl\b"+girl+"\b"); 
     
      System.out.println("what is the name of the girl\t"+girl+"\t"); 
      
      System.out.println("what is the name of the girl\f"+girl+"\f");
      
      System.out.println("what is the name of the boy\f"+boy+"\f"); 
      
      System.out.println("what is the name of the girl\r"+girl+"\r"); 

    
                                              //compares to methods

     // String str1="hello";
     // String str2="hello";
     // String str3="hye";
     // String str4="HELLO";
     // String str5="hel";
     
//      System.out.println(str1.compareTo(str2));
//      System.out.println(str2.compareTo(str3));              //str3<str2   -20
//      System.out.println(str3.compareTo(str2));              //str2>str3   +20

// System.out.println(str1.compareTo(str4));                       // HELLO > hello ......+32
// System.out.println(str1.compareToIgnoreCase(str2));             // equal .......0


                                                     //contains method  (if the substring in paranthesis is present in the string)

     //  System.out.println(str1.contains("lo"));
     //  System.out.println(str1.contains("hell"));                     //we cannot give character here
     //  System.out.println(str1.contains(str2));


                                    ////////////concatenation class


     //  String name1="DEXTER";
     //  String name2="'S LABORATORY"; 
     //  System.out.println(name1.concat(name2));                             


     }
}