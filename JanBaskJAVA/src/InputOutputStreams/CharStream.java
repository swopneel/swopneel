package InputOutputStreams;

import java.io.FileReader;
import java.io.Reader;

public class CharStream {

    public static void main(String [] args) {
        //create an array of characters
        char[] array = new char[100];

        try {
            Reader input = new FileReader("input.txt");
            System.out.println("Is there data in the stream?" + input.ready());

            input.read(array);
            System.out.println("Data in the stream: ");
            System.out.println(array);

            input.close();

        } catch (Exception e) {
            //TODO: handle exception
            e.getStackTrace();
        }
        
    }
    
}


