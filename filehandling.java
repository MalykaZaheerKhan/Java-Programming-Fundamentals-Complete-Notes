// import java.io.File;
// import java.io.IOException;
// public class filehandling{
//     public static void main(String args[])
//     { 
//         File f=new File("filehandling.txt");
//         try{
//             f.createNewFile();
//         }
//         catch(IOException e)
//         {
//           System.out.println("file doesnot exist");
//         }
//     }
// }

// import java.io.FileWriter;
// import java.io.IOException;
// public class filehandling{
//     public static void main(String args[])
//     { 
       

//         try{
//             FileWriter f=new FileWriter("filehandling.txt");
//             f.write("WELCOME TO JAVA WORLD.........BEST OF LUCK");
//             f.close();
//         }
//         catch (IOException e)
//         {
//             System.out.println("Cannot write");
//         }
//     }

// }

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// public class filehandling{
//     public static void main(String args[]){
//         File f=new File ("filehandling.txt");
//         try{
//         Scanner s=new Scanner (f);
//         while (s.hasNextLine()){
//         String line=s.nextLine();
//         System.out.println(line);
//         }
//         s.close();
//     }
//         catch(FileNotFoundException e)
//         {
//                 System.out.println("cannot read");
//         }
 //     }
// }

import java.io.File;
public class filehandling{
    public static void main(String args[])
    {
        File f=new File("filehandling.txt");
        if (f.delete())
        {
            System.out.println("i have deleted the file" );
        }
        else 
        {
            System.out.println("some error has occured while deleting file");
        }
    }
}