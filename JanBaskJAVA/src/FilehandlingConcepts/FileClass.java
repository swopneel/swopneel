package FilehandlingConcepts;

import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {

        File obj = new File("newfile.txt");

        //try {
          //  obj.createNewFile();
            //System.out.println("file created successfullly");
        //} catch (Exception e) {
        
          //  e.printStackTrace();
        //}

        //try {
            //FileWriter fw = new FileWriter("newfile.txt");
            //fw.write ("this iss a first line of the file wiht the File writer Class");
          //  fw.close();
        //} catch (IOException e) {
          //  e.printStackTrace();
        //}
        try {
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
