package exceptionHandling;

import java.io.IOException;

class ThrowExample{
    void throwMethod(int num) throws IOException, ClassNotFoundException{
        if (num ==1){
            throw new IOException("Ioexceotion occured");
        }else{
            throw new ClassNotFoundException("this occured");
        }

    }
}

public class CatchedExcetions {

    public static void main(String[] args) {
        try {
            ThrowExample obj = new ThrowExample();
            obj.throwMethod(2);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        
    }
    
}
