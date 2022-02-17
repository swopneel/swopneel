package serializzation;


import java.io.*;

class Demo implements Serializable{
    public int a;
    public String b;

    //Default constructor
    public Demo(int a, String b){
        this.a =a;
        this.b =b;
    }
}

public class DeSerializableTest{

    public static void main(String[] args) {
        Demo obj = new Demo( 5, "this is sth!!");
        String filename = "file.ser";

        try {
            //serialization
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //method fo serialzing objects
            out.writeObject(obj);
            //(Demo)in.

            out.close();
            file.close();

            System.out.println("object has been serialized");
        }
        catch (Exception e){
            System.out.println(e);
            
        }
        
    }

}